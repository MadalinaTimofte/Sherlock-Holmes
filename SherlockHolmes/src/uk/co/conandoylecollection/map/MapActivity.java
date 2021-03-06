package uk.co.conandoylecollection.map;

import uk.co.conandoylecollection.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

/*
 * Shows the map content.
 */
public class MapActivity extends Activity{
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.map_layout);
	        
	        ActionBar actionBar = getActionBar();
	        actionBar.setDisplayHomeAsUpEnabled(true);
	        actionBar.setTitle("Getting to the Collection");      
 }
	 @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	            case android.R.id.home:
	                // Navigate "up" the demo structure to the launchpad activity.
	                // See http://developer.android.com/design/patterns/navigation.html for more.
	                NavUtils.navigateUpTo(this, new Intent(this, uk.co.conandoylecollection.main.MainActivity.class));
	                return true;}
	        return super.onOptionsItemSelected(item);
}
}