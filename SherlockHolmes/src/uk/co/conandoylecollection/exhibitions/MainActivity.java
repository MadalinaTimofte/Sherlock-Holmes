package uk.co.conandoylecollection.exhibitions;

import uk.co.conandoylecollection.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;

/*
 * The Exhibition section main text (show_exhibitions.xml) followed by the list.
 */
public class MainActivity extends Activity  {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_exhibitions);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("About Exhibitions");}
       
        public void showExhibition(View view){
    		Intent intent = new Intent(MainActivity.this, uk.co.conandoylecollection.exhibitions.ListActivity.class);
            startActivity(intent);
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

