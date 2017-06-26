
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Newsfeed {

    @SerializedName("response")
    @Expose
    public Response response;

}
