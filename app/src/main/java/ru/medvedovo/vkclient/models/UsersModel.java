package ru.medvedovo.vkclient.models;

import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

public class UsersModel {
    public void getUsers(VKRequest.VKRequestListener listener, String user_ids, String fields) {
        VKParameters parameters = new VKParameters();
        parameters.put(VKApiConst.USER_IDS, user_ids);
        parameters.put(VKApiConst.FIELDS, fields);
        VKRequest request = new VKRequest("users.get", parameters);
        request.executeWithListener(listener);
    }
}
