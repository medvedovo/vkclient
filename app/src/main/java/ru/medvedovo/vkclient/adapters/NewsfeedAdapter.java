package ru.medvedovo.vkclient.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.medvedovo.vkclient.models.newsfeed.Item;

public class NewsfeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> data;
    private Activity activity;

    public NewsfeedAdapter(Activity activity) {
        this.activity = activity;
        this.data = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public void addItems(List<Item> items) {
        data = items;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
