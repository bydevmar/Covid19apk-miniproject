package com.example.check_covid.models;

import java.util.List;

public class Response {
    private Global Global;
    private List<Countries> Countries;
    private String Date;

    public Global getGlobal() {
        return Global;
    }

    public void setGlobal(Global global) {
        Global = global;
    }

    public List<Countries> getCountries() {
        return Countries;
    }

    public void setCountries(List<Countries> countries) {
        Countries = countries;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

}
