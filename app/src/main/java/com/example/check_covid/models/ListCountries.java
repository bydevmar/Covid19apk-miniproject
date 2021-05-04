package com.example.check_covid.models;

import java.util.ArrayList;
import java.util.List;


public class ListCountries extends ArrayList<Countries> {

    public ListCountries(List<Countries> countries)  {
        super();
        addAll(countries);
    }
}
