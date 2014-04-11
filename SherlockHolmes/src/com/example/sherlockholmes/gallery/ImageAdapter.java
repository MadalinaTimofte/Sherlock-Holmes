package com.example.sherlockholmes.gallery;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.sherlockholmes.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.acd1, R.drawable.acd2,
            R.drawable.acd3, R.drawable.acd4,
            R.drawable.acd5, R.drawable.acd6,
            R.drawable.acd7, R.drawable.acd8,
    };
    
    private String[] description={
    		"mama are mere multe","babanana erste mare","kdksksksk","nssnsnnsns",
    		"bunica","bunicu","matusa","eu"
    };
 
    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }
 
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
 
    
    @Override
    public Integer[] getItem(int position) {
        return mThumbIds;
    }
    
    public String[] getDescription(int position){
    	return description;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(180, 215));
       // imageView.setPadding(10, 10, 10, 10);
        return imageView;
    }
 
}
