package net.smallacademy.authenticatorapp;

public class UserLogin {

    String uid;
    String name;
    String email;
    double Lat;
    double Long;

    public UserLogin() {
    }

    public UserLogin(String uid, String name, String email, double lat, double aLong) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        Lat = lat;
        Long = aLong;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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


    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }
}
