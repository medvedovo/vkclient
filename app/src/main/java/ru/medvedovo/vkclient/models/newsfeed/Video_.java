
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video_ {

    @SerializedName("vid")
    @Expose
    public Integer vid;
    @SerializedName("owner_id")
    @Expose
    public Integer ownerId;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("duration")
    @Expose
    public Integer duration;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("date")
    @Expose
    public Integer date;
    @SerializedName("views")
    @Expose
    public Integer views;
    @SerializedName("image")
    @Expose
    public String image;
    @SerializedName("image_big")
    @Expose
    public String imageBig;
    @SerializedName("image_small")
    @Expose
    public String imageSmall;
    @SerializedName("access_key")
    @Expose
    public String accessKey;
    @SerializedName("first_frame_800")
    @Expose
    public String firstFrame800;
    @SerializedName("first_frame_320")
    @Expose
    public String firstFrame320;
    @SerializedName("first_frame_160")
    @Expose
    public String firstFrame160;
    @SerializedName("first_frame_130")
    @Expose
    public String firstFrame130;
    @SerializedName("is_private")
    @Expose
    public Integer isPrivate;

}
