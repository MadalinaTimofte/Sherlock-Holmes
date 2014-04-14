package com.example.sherlockholmes.gallery_thelostworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.sherlockholmes.R;

public class TheLostWorldFullScreenViewActivity extends Activity{

	
	private TheLostWorldFullScreenImageAdapter adapter;
	private ViewPager viewPager;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen_view);

		viewPager = (ViewPager) findViewById(R.id.pager);

		
		Intent i = getIntent();
		//int position = i.getIntExtra("position", 0);
		
		 int position = i.getExtras().getInt("id");
		
	    TheLostWorldImageAdapter image_adapter = new TheLostWorldImageAdapter(TheLostWorldFullScreenViewActivity.this);
		adapter = new TheLostWorldFullScreenImageAdapter(TheLostWorldFullScreenViewActivity.this,image_adapter.getItem(position),image_adapter.getDescription(position),position);
		
		viewPager.setAdapter(adapter);
		
		adapter.notifyDataSetChanged();

		// displaying selected image first
		viewPager.setCurrentItem(position);
	}
}
