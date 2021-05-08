package com.example.check_covid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.check_covid.R;
import com.example.check_covid.models.AdviceParagraph;
import com.example.check_covid.models.ListParagraphs;

public class AdapterAdvice extends BaseAdapter {

    Context context;
    ListParagraphs paraphs ;
    int resLayoutItem;


    public AdapterAdvice(Context context, int resLayoutItem, ListParagraphs paraphs) {
        super();
        this.context = context;
        this.resLayoutItem = resLayoutItem;
        this.paraphs = paraphs;
    }

    @Override
    public int getCount() {
        return paraphs.size();
    }

    @Override
    public Object getItem(int position) {
        return paraphs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        AdviceParagraph CurrentParagraphe = this.paraphs.get(i);

        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(this.context);
            view = inflater.inflate(this.resLayoutItem,null);
        }
        String mDrawableName = "advice"+i;
        int resID = context.getResources().getIdentifier(mDrawableName , "drawable", context.getPackageName());
        ((TextView)view.findViewById(R.id.tvAdviceTitle)).setText(CurrentParagraphe.getTitle()+"");
        ((TextView)view.findViewById(R.id.tvAdviceParagraph)).setText(CurrentParagraphe.getParag()+"");
        ((TextView)view.findViewById(R.id.tvAdviceAfterWhy)).setText(CurrentParagraphe.getAfterWhy()+"");
        ((ImageView)view.findViewById(R.id.ivAdvicePicture)).setImageResource(resID);
        return view;
    }
}
