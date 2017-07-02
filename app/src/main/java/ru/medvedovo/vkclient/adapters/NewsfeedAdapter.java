package ru.medvedovo.vkclient.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.medvedovo.vkclient.models.groups.Group;
import ru.medvedovo.vkclient.models.newsfeed.Item;
import ru.medvedovo.vkclient.models.users.User;

public class NewsfeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> data;
    private List<Group> groups;
    private List<User> users;

    private static final int ITEM_POST = 1;
    private static final int ITEM_PHOTO = 2;
    private static final int ITEM_PHOTO_TAG = 3;
    private static final int ITEM_WALL_PHOTO = 4;
    private static final int ITEM_FRIEND = 5;
    private static final int ITEM_NOTE = 6;

    private Activity activity;

    public NewsfeedAdapter(Activity activity) {
        this.activity = activity;
        this.data = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public void addItems(List<Item> items) {
        this.data = items;
    }

    public void addGroups(List<Group> items) {
        this.groups = items;
    }

    private Group getGroupById(Integer id) {
        for (Group group : groups) {
            if (group.getId() == -id) {
                return group;
            }
        }
        return null;
    }

    public void addUsers(List<User> items) {
        this.users = items;
    }

    private User getUserById(Integer id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public String getSourceIds(boolean isGroup) {
        if (data == null || data.isEmpty()) {
            return "";
        }

        String result = "";
        for (Item item : data) {
            Integer sourceId = item.getSourceId();
            if ((sourceId < 0 && isGroup) || (sourceId > 0 && !isGroup)) {
                result += sourceId < 0 ? String.valueOf(sourceId * -1) : String.valueOf(sourceId);
                result += ",";
            }
        }

        if (!result.isEmpty() && result.lastIndexOf(',') == result.length() - 1) {
            return result.substring(0, result.length() - 1);
        }

        return result;
    }

    private int getItemType(int position) {
        if (data == null) {
            return 0;
        }
        switch (data.get(position).getType()) {
            case "post":
                return ITEM_POST;
            case "photo":
                return ITEM_PHOTO;
            case "photo_tag":
                return ITEM_PHOTO_TAG;
            case "wall_photo":
                return ITEM_WALL_PHOTO;
            case "friend":
                return ITEM_FRIEND;
            case "note":
                return ITEM_NOTE;
            default:
                return 0;
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
