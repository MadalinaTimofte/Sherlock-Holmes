package uk.co.conandoylecollection.exhibitions;

import uk.co.conandoylecollection.R;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/*
 * The Exhibition section main text (exhibitions.xml) followed by the list.
 */
public class MainActivity extends Activity  {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exhibitions);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("About Exhibitions");
        //listExhibitions();
        
        ImageView icon = (ImageView)findViewById(R.id.ivClick);
        icon.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Debugging...", Toast.LENGTH_LONG).show();
			}
		});
        
	}
	
/*	public void listExhibitions() {
        ImageView icon = (ImageView) findViewById(R.id.image);
       
        icon.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this, uk.co.conandoylecollection.exhibitions.ListActivity.class);
            startActivity(intent);
            }
      });

       
}*/
}