package ru.medvedovo.vkclient.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.medvedovo.vkclient.R;
import ru.medvedovo.vkclient.adapters.NewsfeedAdapter;
import ru.medvedovo.vkclient.models.newsfeed.Newsfeed;

public class NewsActivity extends AppCompatActivity {

    @BindView(R.id.newsfeed_view)
    RecyclerView newsfeedView;

    private LinearLayoutManager linearLayoutManager;
    private NewsfeedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        ButterKnife.bind(this);

        linearLayoutManager = new LinearLayoutManager(NewsActivity.this);
        newsfeedView.setLayoutManager(linearLayoutManager);

        adapter = new NewsfeedAdapter(this);

        getNewsfeed();
    }

    private void getNewsfeed() {
        VKParameters parameters = new VKParameters();
        parameters.put(VKApiConst.USER_ID, VKAccessToken.currentToken().userId);
        parameters.put(VKApiConst.COUNT, 10);
        VKRequest request = new VKRequest("newsfeed.get", parameters);
        request.executeWithListener(new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                super.onComplete(response);
                Newsfeed newsfeed = new Gson().fromJson(response.responseString, Newsfeed.class);

                adapter.addItems(newsfeed.getResponse().getItems());
                newsfeedView.setAdapter(adapter);
            }

            @Override
            public void onError(VKError error) {
                super.onError(error);
            }
        });
    }
}
