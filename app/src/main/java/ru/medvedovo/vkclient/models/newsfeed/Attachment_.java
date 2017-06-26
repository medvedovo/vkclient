
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attachment_ {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("photo")
    @Expose
    public Photo_ photo;
    @SerializedName("video")
    @Expose
    public Video_ video;
    @SerializedName("link")
    @Expose
    public Link link;

}
