package com.epochconsulting.motoinventory.vehicletracker.util.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pragnya on 25/10/17.
 */

public class UserDetails {
    @SerializedName("data")
    @Expose
    private List<UserData> userDataList = null;

    public List<UserData> getUserData() {
        return userDataList;
    }

    public void setUserData(List<UserData> userData) {
        this.userDataList = userData;
    }
}
