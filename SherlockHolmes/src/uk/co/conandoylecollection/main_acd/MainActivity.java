package uk.co.conandoylecollection.main_acd;

import uk.co.conandoylecollection.articles_acd.ACDArticleActivity;
import uk.co.conandoylecollection.articles_family.FamilyArticleActivity;
import uk.co.conandoylecollection.articles_holmes.HolmesArticleActivity;
import uk.co.conandoylecollection.articles_spiritualism.SpiritualismArticleActivity;

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
public class MainActivity extends Activity implements OnItemClickListener{
	
	GridView gridview;
	DashboardAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Arthur Conan Doyle");
    
        gridview = (GridView)findViewById(R.id.grid_view);
        adapter = new DashboardAdapter(this);
        gridview.setAdapter(adapter);
        
        gridview.setOnItemClickListener(this);
    }
        	 public void onItemClick(AdapterView<?> parent, View view, int position,long id){
        	    	 switch( position ) {
        	         case 0:  Intent newActivity0 = new Intent(this, ACDArticleActivity.class);     
        	                  startActivity(newActivity0);
        	                  break;
        	         case 1:  Intent newActivity1 = new Intent(this, HolmesArticleActivity.class);     
        	                  startActivity(newActivity1);
        	                  break;
        	         case 2:  Intent newActivity2 = new Intent(this, FamilyArticleActivity.class);     
        	                  startActivity(newActivity2);
        	                  break;
        	         case 3:  Intent newActivity3 = new Intent(this, SpiritualismArticleActivity.class);     
        	                  startActivity(newActivity3);
        	                  break;
        	        }
         
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

  