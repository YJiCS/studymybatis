package com.pojo;

public class Users {
    private int userNo;
    private String userName;
    private String userPwd;
    private int userSex;
    private String userAddress;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Users() {
    }

    public Users(int userNo, String userName, String userPwd, int userSex, String userAddress) {
        this.userNo = userNo;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userSex = userSex;
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "Users [userNo=" + userNo + ", userName=" + userName + ", userPwd=" + userPwd + ", userSex=" + userSex +",userAddress="+userAddress+ "]";
    }
}
