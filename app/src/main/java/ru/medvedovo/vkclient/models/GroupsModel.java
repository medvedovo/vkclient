package ru.medvedovo.vkclient.models;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

public class GroupsModel {
    public void getGroups(VKRequest.VKRequestListener listener, String group_ids) {
        VKParameters parameters = new VKParameters();
        parameters.put("group_ids", group_ids);
        VKRequest request = new VKRequest("groups.getById", parameters);
        request.executeWithListener(listener);
    }
}
