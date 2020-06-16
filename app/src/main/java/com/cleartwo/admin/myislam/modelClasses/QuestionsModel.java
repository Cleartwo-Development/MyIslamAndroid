package com.cleartwo.admin.myislam.modelClasses;


public class QuestionsModel {
    private String title;
    private String an1;
    private String an2;
    private String an3;
    private String an4;
    private String rAn;

    public QuestionsModel(String title, String an1, String an2, String an3, String an4, String rAn) {
        this.title = title;
        this.an1 = an1;
        this.an2 = an2;
        this.an3 = an3;
        this.an4 = an4;
        this.rAn = rAn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAn1() {
        return an1;
    }

    public void setAn1(String an1) {
        this.an1 = an1;
    }

    public String getAn2() {
        return an2;
    }

    public void setAn2(String an2) {
        this.an2 = an2;
    }

    public String getAn3() {
        return an3;
    }

    public void setAn3(String an3) {
        this.an3 = an3;
    }

    public String getAn4() {
        return an4;
    }

    public void setAn4(String an4) {
        this.an4 = an4;
    }

    public String getrAn() {
        return rAn;
    }

    public void setrAn(String rAn) {
        this.rAn = rAn;
    }
}
