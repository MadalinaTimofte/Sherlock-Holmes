package uk.co.conandoylecollection.exhibitions;

import uk.co.conandoylecollection.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity  {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exhibitions);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("About Exhibitions");
        listExhibitions();}
	
	public void listExhibitions() {
        ImageView icon = (ImageView) findViewById(R.id.image);
       
        icon.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

            Intent intent = new Intent(v.getContext(), uk.co.conandoylecollection.exhibitions.ListActivity.class);
            startActivity(intent);
            }
      });

       
}
}