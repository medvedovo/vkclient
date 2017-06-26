
package ru.medvedovo.vkclient.models.newsfeed;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("source_id")
    @Expose
    public Integer sourceId;
    @SerializedName("date")
    @Expose
    public Integer date;
    @SerializedName("post_id")
    @Expose
    public Integer postId;
    @SerializedName("post_type")
    @Expose
    public String postType;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("copy_post_date")
    @Expose
    public Integer copyPostDate;
    @SerializedName("copy_post_type")
    @Expose
    public String copyPostType;
    @SerializedName("copy_owner_id")
    @Expose
    public Integer copyOwnerId;
    @SerializedName("copy_post_id")
    @Expose
    public Integer copyPostId;
    @SerializedName("copy_text")
    @Expose
    public String copyText;
    @SerializedName("post_source")
    @Expose
    public PostSource postSource;
    @SerializedName("comments")
    @Expose
    public Comments comments;
    @SerializedName("likes")
    @Expose
    public Likes likes;
    @SerializedName("reposts")
    @Expose
    public Reposts reposts;
    @SerializedName("attachment")
    @Expose
    public Attachment attachment;
    @SerializedName("attachments")
    @Expose
    public List<Attachment_> attachments = null;
    @SerializedName("photos")
    @Expose
    public List<Integer> photos = null;
    @SerializedName("video")
    @Expose
    public List<Integer> video = null;
    @SerializedName("marked_as_ads")
    @Expose
    public Integer markedAsAds;

}
