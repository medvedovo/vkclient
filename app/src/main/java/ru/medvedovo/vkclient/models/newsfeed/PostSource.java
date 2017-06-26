
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostSource {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("platform")
    @Expose
    public String platform;

}
