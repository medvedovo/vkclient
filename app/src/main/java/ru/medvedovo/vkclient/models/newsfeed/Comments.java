
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comments {

    @SerializedName("count")
    @Expose
    public Integer count;
    @SerializedName("can_post")
    @Expose
    public Integer canPost;

}
