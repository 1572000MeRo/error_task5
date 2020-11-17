package com.reload.myapplication1;

public class User {
    private  String user_name;
    private String user_message;
    private int user_image;

    public User() {
    }

    public User(String user_name, String user_message, int user_image) {
        this.user_name = user_name;
        this.user_message = user_message;
        this.user_image = user_image;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_message() {
        return user_message;
    }

    public void setUser_message(String user_message) {
        this.user_message = user_message;
    }

    public int getUser_image() {
        return user_image;
    }

    public void setUser_image(int user_image) {
        this.user_image = user_image;
    }

    @Override
    public String toString() {
        return
                "user_name: "+user_name +"\n"+
                "user_message: " + user_message ;
    }
}
