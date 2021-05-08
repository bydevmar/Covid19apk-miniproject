package com.example.check_covid;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.check_covid.adapters.AdapterAdvice;
import com.example.check_covid.models.AdviceParagraph;
import com.example.check_covid.models.ListParagraphs;

 class AdvicesFragment extends Fragment {
    View view ;
    ListParagraphs listeParagraphs;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_advices, container, false);

        try {
            if(listeParagraphs == null){
                montrerAdvices();
            }
            AdapterAdvice aa = new AdapterAdvice(getContext() , R.layout.adviceitem , listeParagraphs);
            ((ListView)view.findViewById(R.id.lvAdvices)).setAdapter(aa);
        }
        catch(Exception e){
            Log.i("ftah", "Exception Advice : " + e);
        }
        return view;
    }
    private void montrerAdvices() {
        listeParagraphs = new ListParagraphs();
        listeParagraphs.add( new AdviceParagraph(getString(R.string.advice1title),getString(R.string.advice1para) , getString(R.string.advice1afterwhy)));
        listeParagraphs.add( new AdviceParagraph(getString(R.string.advice2title),getString(R.string.advice2para) , getString(R.string.advice2afterwhy)));
        listeParagraphs.add( new AdviceParagraph(getString(R.string.advice3title),getString(R.string.advice3para) , getString(R.string.advice3afterwhy)));
        listeParagraphs.add( new AdviceParagraph(getString(R.string.advice4title),getString(R.string.advice4para) , getString(R.string.advice4afterwhy)));
        listeParagraphs.add( new AdviceParagraph(getString(R.string.advice5title),getString(R.string.advice5para) , getString(R.string.advice5afterwhy)));
    }
}
