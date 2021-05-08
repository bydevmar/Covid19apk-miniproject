package com.example.check_covid.models;

import java.util.ArrayList;
import java.util.List;

public class ListParagraphs extends ArrayList<AdviceParagraph> {
    public ListParagraphs() {
    }

    public ListParagraphs(List<AdviceParagraph> paragraphs)  {
        super();
        addAll(paragraphs);
    }


}
