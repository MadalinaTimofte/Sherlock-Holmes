package uk.co.conandoylecollection.gallery_pompeylad;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import uk.co.conandoylecollection.R;

public class PompeyLadImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.pompeylad_acd1_b_1_2_2, R.drawable.pompeylad_acd1_b_1_2_6,
            R.drawable.pompeylad_acd1_b_1_2_16, R.drawable.pompeylad_acd1_b_1_2_18,
            R.drawable.pompeylad_acd1_b_1_2_20, R.drawable.pompeylad_bush_villas_2_001,
            R.drawable.pompeylad_envelope, R.drawable.pompeylad_map,
            R.drawable.pompeylad_newspaper, R.drawable.pompeylad_pipe_guides,
            R.drawable.pompeylad_pipes_zoom, R.drawable.pompeylad_sherlock_fireplace,
            R.drawable.pompeylad_sherlock_sugar_cube_wrapper, R.drawable.pompeylad_sherlock_themed_tea_menu,
            R.drawable.pompeylad_snoopy_sherlock_hat_and_coat, R.drawable.pompeylad_snoopy_sherlock_hat_and_coat_2,
            R.drawable.pompeylad_the_dancing_men, R.drawable.pompeylad_wallpaper,
    };
    
    private String[] description={
    		"Photograph of Arthur Conan Doyle at the age of 4",
    		"Photograph of Arthur Conan Doyle dressed for cricket at Stonyhurst",
    		"Photograph of Arthur Conan Doyle taken on the day of his graduation as Bachelor of Medicine at the university of Edinburgh",
    		"Photograph of Arthur Conan Doyle standing outside Bush Villa in Southsea",
    		"Photographic portrait of Arthur Conan Doyle",
    		"","","","","","","","","","","","",""  		
    };
 
    // Constructor
    public PompeyLadImageAdapter(Context c){
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
