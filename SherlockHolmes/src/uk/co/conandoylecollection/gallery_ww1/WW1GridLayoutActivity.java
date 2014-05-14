package uk.co.conandoylecollection.gallery_ww1;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import uk.co.conandoylecollection.R;
public class WW1GridLayoutActivity extends Activity {
	 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("World War I");
 
        GridView gridView = (GridView) findViewById(R.id.grid_view);
 
        // Instance of ImageAdapter Class
        gridView.setAdapter(new WW1ImageAdapter(WW1GridLayoutActivity.this));
        
        
        /**
         * On Click event for Single Gridview Item
         * */
        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                    int position, long id) {
 
                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), WW1FullScreenViewActivity.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Navigate "up" the demo structure to the launchpad activity.
                // See http://developer.android.com/design/patterns/navigation.html for more.
                NavUtils.navigateUpTo(this, new Intent(this, uk.co.conandoylecollection.exhibitions.MainActivity.class));
              
                return true;
        }
		return super.onOptionsItemSelected(item);}
}
