package com.bean;

public class student {
    private int userId;
    private String username;
    private String password;
    private String sex;
    private String nickname;
    private int age;
    private String email;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public student(int userId, String username, String password, String sex, String nickname, int age, String email, String headImage) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.nickname = nickname;
        this.age = age;
        this.email = email;
        this.headImage = headImage;
    }

    private String headImage;

    @Override
    public String toString() {
        return "student{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", headImage='" + headImage + '\'' +
                '}';
    }

    public student() {
    }
}