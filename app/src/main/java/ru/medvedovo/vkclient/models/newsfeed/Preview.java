
package ru.medvedovo.vkclient.models.newsfeed;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Preview {

    @SerializedName("photo")
    @Expose
    private Photo___ photo;
    @SerializedName("video")
    @Expose
    private Video video;

    public Photo___ getPhoto() {
        return photo;
    }

    public void setPhoto(Photo___ photo) {
        this.photo = photo;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

}
