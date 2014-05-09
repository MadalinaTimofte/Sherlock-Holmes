package uk.co.conandoylecollection.gallery_thelostworld;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import uk.co.conandoylecollection.R;

public class TheLostWorldImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.the_lost_world, R.drawable.thelostworld_acd1d1136_4,
            R.drawable.thelostworld_acd1d1136_5, R.drawable.thelostworld_acd1d1136_6,
            R.drawable.thelostworld_acd1d1136_7, R.drawable.thelostworld_acd1d1137_10,
            R.drawable.thelostworld_acd1d1137_12, R.drawable.thelostworld_acd1d1137_25,
            R.drawable.thelostworld_acd1d1137_26, R.drawable.thelostworld_acd1d1137_27,
            R.drawable.thelostworld_acd1d1137_28, R.drawable.thelostworld_acd1d1137_29,
            R.drawable.thelostworld_acd1d1137_31, R.drawable.thelostworld_acd1d1137_32,
            R.drawable.thelostworld_acd1d1137_33, R.drawable.thelostworld_acd1d1137_34,
            R.drawable.thelostworld_acd1d1137_35, R.drawable.thelostworld_acd1d1137_36,
            R.drawable.thelostworld_acd1d1137_39, R.drawable.thelostworld_acd1d1137_40,
            R.drawable.thelostworld_acd1d1137_41
          
    };
    
    private String[] description={
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		 "",
    		
    		
    };
 
    // Constructor
    public TheLostWorldImageAdapter(Context c){
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
