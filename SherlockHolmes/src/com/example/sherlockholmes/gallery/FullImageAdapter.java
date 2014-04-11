package com.example.sherlockholmes.gallery;

/*import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.sherlockholmes.R;
 
public class FullImageAdapter extends PagerAdapter {
 
    private Activity _activity;
    private LayoutInflater inflater;
 
    // constructor
    public FullImageAdapter(Activity activity) {
        this._activity = activity;
    }
 
    @Override
    public int getCount() {
        return 0;
    }
 
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }
     
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       
        Button btnClose;
  
        inflater = (LayoutInflater) _activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = inflater.inflate(R.layout.layout_fullscreen_image, container,
                false);
       
        ImageView imageView = (ImageView) viewLayout.findViewById(R.id.full_image);
        TextView textview = (TextView) viewLayout.findViewById(R.id.item_text);
        btnClose = (Button) viewLayout.findViewById(R.id.btnClose);
        
        ImageAdapter imageAdapter = new ImageAdapter(_activity);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
        textview.setText(imageAdapter.description[position]);
       
         
        // close button click event
        btnClose.setOnClickListener(new View.OnClickListener() {            
            @Override
            public void onClick(View v) {
                _activity.finish();
            }
        });
  
       
        ((ViewPager) container).addView(viewLayout);
  
        return viewLayout;
    }
     
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((RelativeLayout) object);
  
    }
}*/
