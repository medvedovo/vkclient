
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reposts {

    @SerializedName("count")
    @Expose
    public Integer count;
    @SerializedName("user_reposted")
    @Expose
    public Integer userReposted;

}
