package com.example.myfirstapplication.bean;

public class SellingItem {

    private String UserName;

    private int ProfilePicUrl;

    private String Description;


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getProfilePicUrl() {
        return ProfilePicUrl;
    }

    public void setProfilePicUrl(int profilePicUrl) {
        ProfilePicUrl = profilePicUrl;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
