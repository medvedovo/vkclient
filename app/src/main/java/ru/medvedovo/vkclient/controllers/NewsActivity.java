package ru.medvedovo.vkclient.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.medvedovo.vkclient.R;
import ru.medvedovo.vkclient.adapters.NewsfeedAdapter;
import ru.medvedovo.vkclient.models.GroupsModel;
import ru.medvedovo.vkclient.models.NewsfeedModel;
import ru.medvedovo.vkclient.models.UsersModel;
import ru.medvedovo.vkclient.models.groups.Groups;
import ru.medvedovo.vkclient.models.newsfeed.Newsfeed;
import ru.medvedovo.vkclient.models.users.Users;

public class NewsActivity extends AppCompatActivity {

    @BindView(R.id.newsfeed_view)
    RecyclerView newsfeedView;

    @BindView(R.id.loading_container)
    LinearLayout loadingContainer;

    @BindView(R.id.logout_button)
    Button logoutButton;

    private NewsfeedAdapter adapter;
    private GroupsModel groupsModel;
    private NewsfeedModel newsfeedModel;
    private UsersModel usersModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        ButterKnife.bind(this);
        setButtonListeners();

        loadingContainer.setVisibility(View.VISIBLE);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(NewsActivity.this);
        newsfeedView.setLayoutManager(linearLayoutManager);
        adapter = new NewsfeedAdapter(this);

        newsfeedModel = new NewsfeedModel();
        groupsModel = new GroupsModel();
        usersModel = new UsersModel();

        newsfeedModel.getNewsfeed(getNewsfeedListener(), VKAccessToken.currentToken().userId, 50);
    }

    private void setButtonListeners() {
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VKSdk.logout();
                finish();
            }
        });
    }

    private VKRequest.VKRequestListener getNewsfeedListener() {
        return new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                super.onComplete(response);
                Newsfeed newsfeed = new Gson().fromJson(response.responseString, Newsfeed.class);

                adapter.addItems(newsfeed.getResponse().getItems());
                groupsModel.getGroups(getGroupsListener(), adapter.getSourceIds(true));
            }
        };
    }

    private VKRequest.VKRequestListener getGroupsListener() {
        return new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                super.onComplete(response);
                Groups groups = new Gson().fromJson(response.responseString, Groups.class);

                adapter.addGroups(groups.getResponse());
                usersModel.getUsers(getUsersListener(), adapter.getSourceIds(false), "photo_100");
            }
        };
    }

    private VKRequest.VKRequestListener getUsersListener() {
        return new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                super.onComplete(response);
                Users users = new Gson().fromJson(response.responseString, Users.class);

                adapter.addUsers(users.getResponse());
                newsfeedView.setAdapter(adapter);
                loadingContainer.setVisibility(View.GONE);
            }
        };
    }
}
