package uk.co.conandoylecollection.gallery_pompeylad;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import uk.co.conandoylecollection.R;

public class PompeyLadFullScreenViewActivity extends Activity{

	
	private PompeyLadFullScreenImageAdapter adapter;
	private ViewPager viewPager;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen_view);
		
		  ActionBar actionBar = getActionBar();
	        actionBar.setDisplayHomeAsUpEnabled(true);
	        actionBar.setTitle("Pompey Lad");

		viewPager = (ViewPager) findViewById(R.id.pager);

		
		Intent i = getIntent();
		//int position = i.getIntExtra("position", 0);
		
		 int position = i.getExtras().getInt("id");
		
	    PompeyLadImageAdapter image_adapter = new PompeyLadImageAdapter(PompeyLadFullScreenViewActivity.this);
		adapter = new PompeyLadFullScreenImageAdapter(PompeyLadFullScreenViewActivity.this,image_adapter.getItem(position),
				image_adapter.getDescription(position),position);
		
		viewPager.setAdapter(adapter);
		
		adapter.notifyDataSetChanged();

		// displaying selected image first
		viewPager.setCurrentItem(position);
	}
	
	 @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	            case android.R.id.home:
	                // Navigate "up" the demo structure to the launchpad activity.
	                // See http://developer.android.com/design/patterns/navigation.html for more.
	                NavUtils.navigateUpTo(this, new Intent(this, PompeyLadGridLayoutActivity.class));
	              
	                return true;
	        }
			return super.onOptionsItemSelected(item);}
}
