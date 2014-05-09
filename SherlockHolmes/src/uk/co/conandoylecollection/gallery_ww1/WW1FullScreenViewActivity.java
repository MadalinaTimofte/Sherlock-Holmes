package uk.co.conandoylecollection.gallery_ww1;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.gallery_thelostworld.TheLostWorldFullScreenViewActivity;
public class WW1FullScreenViewActivity extends Activity{

	
	private WW1FullScreenImageAdapter adapter;
	private ViewPager viewPager;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen_view);
		
		  ActionBar actionBar = getActionBar();
	        actionBar.setDisplayHomeAsUpEnabled(true);
	        actionBar.setTitle("WW1");

		viewPager = (ViewPager) findViewById(R.id.pager);

		
		Intent i = getIntent();
		//int position = i.getIntExtra("position", 0);
		
		 int position = i.getExtras().getInt("id");
		
	    WW1ImageAdapter image_adapter = new WW1ImageAdapter(WW1FullScreenViewActivity.this);
		adapter = new WW1FullScreenImageAdapter(WW1FullScreenViewActivity.this,image_adapter.getItem(position),image_adapter.getDescription(position),position);
		
		viewPager.setAdapter(adapter);
		
		adapter.notifyDataSetChanged();

		// displaying selected image first
		viewPager.setCurrentItem(position);
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Navigate "up" the demo structure to the launchpad activity.
                // See http://developer.android.com/design/patterns/navigation.html for more.
                NavUtils.navigateUpTo(this, new Intent(this, WW1GridLayoutActivity.class));
              
                return true;
        }
		return super.onOptionsItemSelected(item);}
}
