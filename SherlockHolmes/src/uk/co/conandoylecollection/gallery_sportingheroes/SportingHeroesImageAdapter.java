package uk.co.conandoylecollection.gallery_sportingheroes;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import uk.co.conandoylecollection.R;
public class SportingHeroesImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.sportingheroes_acd1_b_1_2_2, R.drawable.sportingheroes_acd1_b_1_2_6,
            R.drawable.sportingheroes_acd1_b_1_2_10, R.drawable.sportingheroes_acd1_b_1_2_71,
            R.drawable.sportingheroes_acd1_b_1_2_72, R.drawable.sportingheroes_acd1_b_1_2_75,
            R.drawable.sportingheroes_acd1_b_1_2_76, R.drawable.sportingheroes_acd1_b_1_2_83,
            R.drawable.sportingheroes_acd1_b_1_2_94_02, R.drawable.sportingheroes_acd1_b_1_2_103,
            R.drawable.sportingheroes_acd1_b_1_2_151, R.drawable.sportingheroes_acd1_b_1_2_154,
            R.drawable.sportingheroes_acd1_b_1_2_157, R.drawable.sportingheroes_acd1_b_1_2_177,
            R.drawable.sportingheroes_acd1_b_1_2_178, R.drawable.sportingheroes_acd1_b_1_2_185,
            R.drawable.sportingheroes_acd1_b_1_2_249, R.drawable.sportingheroes_acd1_b_1_2_250,
            R.drawable.sportingheroes_acd1_b_1_2_265,R.drawable.sportingheroes_acd1_b_1_2_341,
            R.drawable.sportingheroes_acd1_b_1_2_342,R.drawable.sportingheroes_acd1_b_1_2_347,
            R.drawable.sportingheroes_acd1_b_1_2_376,R.drawable.sportingheroes_acd1_b_1_2_386,
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
    		 "",
    		 "",
    		 "",
    		
    };
 
    // Constructor
    public SportingHeroesImageAdapter(Context c){
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
