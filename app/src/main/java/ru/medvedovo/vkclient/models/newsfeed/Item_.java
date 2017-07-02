
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("album_id")
    @Expose
    private Integer albumId;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("photo_75")
    @Expose
    private String photo75;
    @SerializedName("photo_130")
    @Expose
    private String photo130;
    @SerializedName("photo_604")
    @Expose
    private String photo604;
    @SerializedName("photo_807")
    @Expose
    private String photo807;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("access_key")
    @Expose
    private String accessKey;
    @SerializedName("likes")
    @Expose
    private Likes_ likes;
    @SerializedName("reposts")
    @Expose
    private Reposts_ reposts;
    @SerializedName("comments")
    @Expose
    private Comments_ comments;
    @SerializedName("can_comment")
    @Expose
    private Integer canComment;
    @SerializedName("can_repost")
    @Expose
    private Integer canRepost;
    @SerializedName("post_id")
    @Expose
    private Integer postId;
    @SerializedName("photo_1280")
    @Expose
    private String photo1280;
    @SerializedName("photo_2560")
    @Expose
    private String photo2560;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("long")
    @Expose
    private Double _long;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhoto75() {
        return photo75;
    }

    public void setPhoto75(String photo75) {
        this.photo75 = photo75;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    public void setPhoto604(String photo604) {
        this.photo604 = photo604;
    }

    public String getPhoto807() {
        return photo807;
    }

    public void setPhoto807(String photo807) {
        this.photo807 = photo807;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Likes_ getLikes() {
        return likes;
    }

    public void setLikes(Likes_ likes) {
        this.likes = likes;
    }

    public Reposts_ getReposts() {
        return reposts;
    }

    public void setReposts(Reposts_ reposts) {
        this.reposts = reposts;
    }

    public Comments_ getComments() {
        return comments;
    }

    public void setComments(Comments_ comments) {
        this.comments = comments;
    }

    public Integer getCanComment() {
        return canComment;
    }

    public void setCanComment(Integer canComment) {
        this.canComment = canComment;
    }

    public Integer getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(Integer canRepost) {
        this.canRepost = canRepost;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPhoto1280() {
        return photo1280;
    }

    public void setPhoto1280(String photo1280) {
        this.photo1280 = photo1280;
    }

    public String getPhoto2560() {
        return photo2560;
    }

    public void setPhoto2560(String photo2560) {
        this.photo2560 = photo2560;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLong() {
        return _long;
    }

    public void setLong(Double _long) {
        this._long = _long;
    }

}
