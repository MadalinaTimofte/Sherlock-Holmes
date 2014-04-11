package com.example.sherlockholmes.images;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.sherlockholmes.R;
import com.example.sherlockholmes.gallery.ImageAdapter;

public class FullScreenViewActivity extends Activity{

	
	private FullScreenImageAdapter adapter;
	private ViewPager viewPager;
	
/*	 private Integer[] mThumbIds = {
	            R.drawable.acd1, R.drawable.acd2,
	           R.drawable.acd3, R.drawable.acd4,
	           R.drawable.acd5, R.drawable.acd6,
	           R.drawable.acd7, R.drawable.acd8,
	    };
	    
	    private String[] description={
	    		"apple","pinaple","rose","strawberry",
	    		"orange","lemon","potato","banana"
	    };*/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen_view);

		viewPager = (ViewPager) findViewById(R.id.pager);

		
		Intent i = getIntent();
		int position = i.getIntExtra("position", 0);
		
	    ImageAdapter image_adapter = new ImageAdapter(FullScreenViewActivity.this);
		adapter = new FullScreenImageAdapter(FullScreenViewActivity.this,image_adapter.getItem(position),image_adapter.getDescription(position),position);
		
		viewPager.setAdapter(adapter);
		
		adapter.notifyDataSetChanged();

		// displaying selected image first
		viewPager.setCurrentItem(position);
	}
}
