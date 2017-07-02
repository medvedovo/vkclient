package ru.medvedovo.vkclient.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.medvedovo.vkclient.R;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.login_button)
    Button loginButton;

    String[] vkScope = new String[]{VKScope.FRIENDS,VKScope.WALL};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        setListeners();
    }

    private void setListeners() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VKSdk.login(LoginActivity.this, vkScope);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
                Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
                startActivity(intent);
            }

            @Override
            public void onError(VKError error) {
                Toast.makeText(getApplicationContext(), getString(R.string.authorization_error), Toast.LENGTH_LONG).show();
            }
        })) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
