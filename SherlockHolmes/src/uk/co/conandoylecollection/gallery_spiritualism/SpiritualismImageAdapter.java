package uk.co.conandoylecollection.gallery_spiritualism;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import uk.co.conandoylecollection.R;

public class SpiritualismImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.spiritualism_acd1_c_1_2_2, R.drawable.spiritualism_acd1_c_1_2_4,
            R.drawable.spiritualism_acd1_c_1_2_6, R.drawable.spiritualism_acd1_c_1_2_8,
            R.drawable.spiritualism_acd1_c_1_2_46, R.drawable.spiritualism_acd1_c_1_2_54,
            R.drawable.spiritualism_acd1_c_1_2_60, R.drawable.spiritualism_acd1_c_1_2_73,
            R.drawable.spiritualism_acd1_c_1_2_78, R.drawable.spiritualism_acd1_c_1_2_90,
            R.drawable.spiritualism_acd1_c_1_2_102, R.drawable.spiritualism_acd1_c_1_2_107,
            R.drawable.spiritualism_acd1_c_1_2_110, R.drawable.spiritualism_acd1_c_1_2_114,
            R.drawable.spiritualism_acd1_c_1_2_115, R.drawable.spiritualism_acd1_c_1_2_138,
            R.drawable.spiritualism_acd1_c_1_2_146, R.drawable.spiritualism_acd1_c_2_10_28,
            R.drawable.spiritualism_acd1_c_1_2_95
    };
    
    private String[] description={
    		"Photograph of man and woman, both seated. with extra resembling Arthur Conan Doyle",
    		"Photograph of Arthur Conan Doyle seated",
    		"Photograph of medium Mary Marshall purporting to generate ectoplasm that contains extras, including one extra resembling Arthur Conan Doyle ",
    		"Photograph of woman standing, purpoting to levitate a table",
    		"Photograph of seated woman (head not showm) purpoting to lift a table with ectoplasm",
    		"Photograph of table purpotedly being raised by ectoplasm by medium (face not shown), with seated man to the right",
    		"Photograph of medium Kathleen Goligher purpoting to produce ectoplasm",
    		"Photograph of seated figure (head not shown) behind table, purpoting to lift table by supernatural means, with seated man to the right",
    		"Photograph of seated woman ( face not shown) purpoting to produce ectoplasm ",
    		"Photograph of seated woman (face not shown) seated at table with material purpoted to be ectoplasm tied to table legs ",
    		"Photograph of medium, Eva Carriere ( aka 'Eva C' and Marthe Beraud) close up of face with purpoted materialisation of female face and hand on her shoulder",
    		"Photograph of extra to contain spirit from writing from Archbishop Thomas Colley",
    		"Two photographs on one postcard top image of purpoted 'psychograph' of spirit writing by Dr W J Crawford, bottom image example of handwriting by W J Crawford ",
    		"Photograph of two images: left hand side purpoted spirit writing from W Walker, right hand side image of example of handwriting from W Walker",
    		"Photograph purpoting to be spirit writing from Arthur Conan Doyle",
    		"Photograph of church or hall, large pipe organ behind people seated on stage, with extras, Woolwich 1926",
    		"Photograph of spiritualist service in Bromley, showing table covered with a cloth featuring a stiched cross, and top half of image obscured by extras of several faces and circles containing the word Sanctus",
    		"Part letters from Arthur Conan Doyle to Harry Price",
    		"Photograph of woman's feet under table, with substance purported to be ectoplasm emerging from between shoes and rising to table, with shoes and legs of person in background"
    		
    		
    };
 
    // Constructor
    public SpiritualismImageAdapter(Context c){
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
