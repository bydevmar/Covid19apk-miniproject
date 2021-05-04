package com.example.check_covid.models;

public class AdviceParagraph {
    String Title;
    String Parag;
    String AfterWhy;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getParag() {
        return Parag;
    }

    public void setParag(String parag) {
        Parag = parag;
    }

    public String getAfterWhy() {
        return AfterWhy;
    }

    public void setAfterWhy(String afterWhy) {
        AfterWhy = afterWhy;
    }

    public AdviceParagraph(String title, String parag, String afterWhy) {
        Title = title;
        Parag = parag;
        AfterWhy = afterWhy;
    }
    public AdviceParagraph() {    }

}
