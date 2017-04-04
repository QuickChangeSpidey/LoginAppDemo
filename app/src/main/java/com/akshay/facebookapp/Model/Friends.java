package com.akshay.facebookapp.Model;

import android.media.Image;

/**
 * Created by Akshay on 4/3/17.
 */

public class Friends {
    private String name, gender, dob;

    public Friends(){


    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    private Image photo;

    public Friends(String name, String gender, String dob, Image photo) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
