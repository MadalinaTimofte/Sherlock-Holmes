package uk.co.conandoylecollection.gallery_pompeylad;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.conandoylecollection.R;

public class PompeyLadFullScreenImageAdapter extends PagerAdapter {

	private Activity context;
	private LayoutInflater inflater;
	private int _position;
	private Integer[] mThumbIds;
	private String[] description;

	public PompeyLadFullScreenImageAdapter(Activity context,Integer[] mThumbIds,String[] description,int _position){
		this.context = context;
		this.mThumbIds =  mThumbIds;
		this.description = description;
		this._position = _position;
		
	}

	public PompeyLadFullScreenImageAdapter(Activity context){
		this.context = context;
	}
	@Override
    public int getCount() {
		return mThumbIds.length;
    }
 
 
	@Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);
    }
	
	@Override
    public Object instantiateItem(ViewGroup container, int position) {
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = inflater.inflate(R.layout.layout_fullscreen_image, container,
                false);
        ImageView imageView = (ImageView) viewLayout.findViewById(R.id.full_image);
        TextView textview = (TextView) viewLayout.findViewById(R.id.item_text);
        imageView.setImageResource(mThumbIds[position]);
        textview.setText(description[position]);
       ((ViewPager) container).addView(viewLayout,0);
 
        return viewLayout;
	}
	
	@Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
        
 
    }

}
