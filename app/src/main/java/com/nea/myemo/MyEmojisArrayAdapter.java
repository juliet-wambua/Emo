package com.nea.myemo;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyEmojisArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mEmojis;
    private String[] mMeaning;

    public MyEmojisArrayAdapter(Context mContext, int resource, String[] mEmojis, String[] mMeaning){
        super(mContext, resource);
        this.mContext = mContext;
        this.mEmojis = mEmojis;
        this.mMeaning = mMeaning;
    }

    @Override
    public Object getItem(int position) {
        String emojis = mEmojis[position];
        String meaning = mMeaning[position];
        return String.format("%s \nServes great: %s", emojis, meaning);
    }

    @Override
    public int getCount() {
        return mMeaning.length;
    }

}
