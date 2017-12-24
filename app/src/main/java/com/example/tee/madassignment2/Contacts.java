package com.example.tee.madassignment2;

public class Contacts {
    private int id;
    private String fname;
    private String fphone;
    private String femail;

    public Contacts(int id, String fname, String fphone, String femail) {
        this.id = id;
        this.fname = fname;
        this.fphone = fphone;
        this.femail = femail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", fphone='" + fphone + '\'' +
                ", femail='" + femail + '\'' +
                '}';
    }
}