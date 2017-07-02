package ru.medvedovo.vkclient.models;

import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

public class NewsfeedModel {
    public void getNewsfeed(VKRequest.VKRequestListener listener, String user_id, Integer count) {
        VKParameters parameters = new VKParameters();
        parameters.put(VKApiConst.USER_ID, user_id);
        parameters.put(VKApiConst.COUNT, count);
        VKRequest request = new VKRequest("newsfeed.get", parameters);
        request.executeWithListener(listener);
    }
}
