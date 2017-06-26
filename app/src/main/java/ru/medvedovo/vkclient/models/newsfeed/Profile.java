
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("uid")
    @Expose
    public Integer uid;
    @SerializedName("first_name")
    @Expose
    public String firstName;
    @SerializedName("last_name")
    @Expose
    public String lastName;
    @SerializedName("sex")
    @Expose
    public Integer sex;
    @SerializedName("screen_name")
    @Expose
    public String screenName;
    @SerializedName("photo")
    @Expose
    public String photo;
    @SerializedName("photo_medium_rec")
    @Expose
    public String photoMediumRec;
    @SerializedName("online")
    @Expose
    public Integer online;
    @SerializedName("online_app")
    @Expose
    public String onlineApp;
    @SerializedName("online_mobile")
    @Expose
    public Integer onlineMobile;

}
