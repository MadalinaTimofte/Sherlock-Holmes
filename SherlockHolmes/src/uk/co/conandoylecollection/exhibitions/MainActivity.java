package uk.co.conandoylecollection.exhibitions;

import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.ex_articles_agoodsport.AGoodSportArticleActivity;
import uk.co.conandoylecollection.ex_articles_thepompeylad.ThePompeyLadArticleActivity;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity implements OnItemClickListener{
	
	GridView gridview;
	DashboardAdapter adapter;
	Application activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exhibitions);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("About Exhibitions");
    
        gridview = (GridView)findViewById(R.id.grid_view);
        adapter = new DashboardAdapter(this);
        gridview.setAdapter(adapter);
        
        gridview.setOnItemClickListener(this);
    }
        	 public void onItemClick(AdapterView<?> parent, View view, int position,long id){
        	    	 switch( position ) {
        	         case 0:  Intent newActivity0 = new Intent(this, AGoodSportArticleActivity.class);     
        	                  startActivity(newActivity0);
        	                
        	                  break;
        	         case 1:  Intent newActivity1 = new Intent(this, ThePompeyLadArticleActivity.class);     
        	                  startActivity(newActivity1);
        	                
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
        	              
        	                return true;
        	        }
        			return super.onOptionsItemSelected(item);}

    }
        


  
