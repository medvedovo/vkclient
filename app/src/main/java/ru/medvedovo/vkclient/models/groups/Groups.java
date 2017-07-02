
package ru.medvedovo.vkclient.models.groups;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Groups {

    @SerializedName("response")
    @Expose
    private List<Group> response = null;

    public List<Group> getResponse() {
        return response;
    }

    public void setResponse(List<Group> response) {
        this.response = response;
    }

}
