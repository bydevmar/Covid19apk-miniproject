package com.example.check_covid.models;

public class Triage {
    protected String Display; //DiaplayMember
    protected String Value; //Value member

    public Triage(String display, String value) {
        Display = display;
        Value = value;
    }

    public String getDisplay() {
        return Display;
    }

    public String getValue() {
        return Value;
    }

    @Override
    public String toString() {
        return getDisplay().toString();
    }
}
