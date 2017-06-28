
package ru.medvedovo.vkclient.models.newsfeed;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo___ {

    @SerializedName("sizes")
    @Expose
    private List<Size> sizes = null;

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

}
