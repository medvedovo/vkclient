
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attachment_ {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("photo")
    @Expose
    private Photo_ photo;
    @SerializedName("link")
    @Expose
    private Link link;
    @SerializedName("audio")
    @Expose
    private Audio audio;
    @SerializedName("doc")
    @Expose
    private Doc doc;
    @SerializedName("video")
    @Expose
    private Video_ video;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Photo_ getPhoto() {
        return photo;
    }

    public void setPhoto(Photo_ photo) {
        this.photo = photo;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    public Video_ getVideo() {
        return video;
    }

    public void setVideo(Video_ video) {
        this.video = video;
    }

}
