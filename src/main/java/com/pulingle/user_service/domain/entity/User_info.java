package com.pulingle.user_service.domain.entity;

/**
 * @Author: Teemo
 * @Description:用户信息表
 * @Date: Created in 9:46 2018/3/25
 */
public class User_info {
    /**
     * 用户id
     */
    private int user_id;
    /**
     * 账号
     */
    private String account;
    /**
     * 手机
     */
    private String phone;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 用户头像url
     */
    private String profile_picture_url;
    /**
     * 性别
     */
    private int sex;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 好友列表
     */
    private String friends_list;
    /**
     * 个性签名
     */
    private String signature;
    /**
     * 首页图片列表
     */
    private String pictures_list;
    /**
     * 注册时间
     */
    private String create_time;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile_picture_url() {
        return profile_picture_url;
    }

    public void setProfile_picture_url(String profile_picture_url) {
        this.profile_picture_url = profile_picture_url;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFriends_list() {
        return friends_list;
    }

    public void setFriends_list(String friends_list) {
        this.friends_list = friends_list;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPictures_list() {
        return pictures_list;
    }

    public void setPictures_list(String pictures_list) {
        this.pictures_list = pictures_list;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "User_info{" +
                "user_id=" + user_id +
                ", account='" + account + '\'' +
                ", phone='" + phone + '\'' +
                ", nickname='" + nickname + '\'' +
                ", profile_picture_url='" + profile_picture_url + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", friends_list='" + friends_list + '\'' +
                ", signature='" + signature + '\'' +
                ", pictures_list='" + pictures_list + '\'' +
                ", create_time='" + create_time + '\'' +
                '}';
    }
}
