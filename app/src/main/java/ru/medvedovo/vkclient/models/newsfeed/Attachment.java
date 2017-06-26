
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attachment {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("photo")
    @Expose
    public Photo photo;
    @SerializedName("video")
    @Expose
    public Video video;

}
