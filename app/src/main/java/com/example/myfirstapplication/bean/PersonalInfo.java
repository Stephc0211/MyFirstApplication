package com.example.myfirstapplication.bean;

public class PersonalInfo {
    private int userId;
    private String userName;
    private int following;
    private int follower;
    private String info;
    private String password;
    private String email;


    public PersonalInfo(int userId, String userName, int following, int follower, String info,
                        String password, String email) {
        this.userId = userId;
        this.userName = userName;
        this.following = following;
        this.follower = follower;
        this.info = info;
        this.password = password;
        this.email = email;
    }

    public PersonalInfo(){

    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", following=" + following +
                ", follower=" + follower +
                ", info='" + info + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
