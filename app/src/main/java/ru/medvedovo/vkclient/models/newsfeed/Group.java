
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("gid")
    @Expose
    public Integer gid;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("screen_name")
    @Expose
    public String screenName;
    @SerializedName("is_closed")
    @Expose
    public Integer isClosed;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("photo")
    @Expose
    public String photo;
    @SerializedName("photo_medium")
    @Expose
    public String photoMedium;
    @SerializedName("photo_big")
    @Expose
    public String photoBig;

}
