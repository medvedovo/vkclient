package ru.medvedovo.vkclient.models.newsfeed;

import android.os.Parcel;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("items")
    @Expose
    public List<Item> items = null;
    @SerializedName("profiles")
    @Expose
    public List<Profile> profiles = null;
    @SerializedName("groups")
    @Expose
    public List<Group> groups = null;
    @SerializedName("new_offset")
    @Expose
    public Integer newOffset;
    @SerializedName("new_from")
    @Expose
    public String newFrom;
}
