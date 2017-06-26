
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("pid")
    @Expose
    public Integer pid;
    @SerializedName("aid")
    @Expose
    public Integer aid;
    @SerializedName("owner_id")
    @Expose
    public Integer ownerId;
    @SerializedName("src")
    @Expose
    public String src;
    @SerializedName("src_big")
    @Expose
    public String srcBig;
    @SerializedName("src_small")
    @Expose
    public String srcSmall;
    @SerializedName("src_xbig")
    @Expose
    public String srcXbig;
    @SerializedName("width")
    @Expose
    public Integer width;
    @SerializedName("height")
    @Expose
    public Integer height;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("created")
    @Expose
    public Integer created;
    @SerializedName("lat")
    @Expose
    public Double lat;
    @SerializedName("long")
    @Expose
    public Double _long;
    @SerializedName("access_key")
    @Expose
    public String accessKey;
    @SerializedName("user_id")
    @Expose
    public Integer userId;
    @SerializedName("post_id")
    @Expose
    public Integer postId;
    @SerializedName("src_xxbig")
    @Expose
    public String srcXxbig;

}
