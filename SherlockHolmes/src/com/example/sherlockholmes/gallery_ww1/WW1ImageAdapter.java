package com.example.sherlockholmes.gallery_ww1;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.sherlockholmes.R;

public class WW1ImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.ww1_acd1_b_1_2_196, R.drawable.ww1_acd1_b_1_2_205,
          
          
    };
    
    private String[] description={
    		 "",
    		 ""
    		
    };
 
    // Constructor
    public WW1ImageAdapter(Context c){
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
        return imageView;
    }
 
}
