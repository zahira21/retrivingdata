package com.example.camera_testing_app;

public class uploadinfo {
    String imagepath, text;

    public uploadinfo(String imagepath, String text) {
        this.imagepath = imagepath;
        this.text = text;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
