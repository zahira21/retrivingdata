package com.example.retrivingdata;

public class member {
    String name, email, imagepath;
    Integer numbf, numbs;
    Double lat, lon;

    public member(){

    }

    public member(String name, String email, String imagepath, Integer numbf, Integer numbs, Double lat, Double lon) {
        this.name = name;
        this.email = email;
        this.imagepath = imagepath;
        this.numbf = numbf;
        this.numbs = numbs;
        this.lat = lat;
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public Integer getNumbf() {
        return numbf;
    }

    public void setNumbf(Integer numbf) {
        this.numbf = numbf;
    }

    public Integer getNumbs() {
        return numbs;
    }

    public void setNumbs(Integer numbs) {
        this.numbs = numbs;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}
