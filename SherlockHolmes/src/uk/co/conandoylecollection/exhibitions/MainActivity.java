package uk.co.conandoylecollection.exhibitions;

import uk.co.conandoylecollection.gallery_pompeylad.PompeyLadGridLayoutActivity;
import uk.co.conandoylecollection.gallery_spiritualism.SpiritualismGridLayoutActivity;
import uk.co.conandoylecollection.gallery_sportingheroes.SportingHeroesGridLayoutActivity;
import uk.co.conandoylecollection.gallery_thelostworld.TheLostWorldGridLayoutActivity;


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

import uk.co.conandoylecollection.R;

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
        actionBar.setTitle("Exhibitions");
    
        gridview = (GridView)findViewById(R.id.grid_view);
        adapter = new DashboardAdapter(this);
        gridview.setAdapter(adapter);
        
        gridview.setOnItemClickListener(this);
    }
        	 public void onItemClick(AdapterView<?> parent, View view, int position,long id){
        	    	 switch( position ) {
        	         case 0:  Intent newActivity0 = new Intent(this, PompeyLadGridLayoutActivity.class);     
        	                  startActivity(newActivity0);
        	                
        	                  break;
        	         case 1:  Intent newActivity1 = new Intent(this, SpiritualismGridLayoutActivity.class);     
        	                  startActivity(newActivity1);
        	                
        	                  break;
        	         case 2:  Intent newActivity2 = new Intent(this, SportingHeroesGridLayoutActivity.class);     
        	                  startActivity(newActivity2);
        	                 
        	                  break;
        	         case 3:  Intent newActivity3 = new Intent(this, TheLostWorldGridLayoutActivity.class);     
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
        	              
        	                return true;
        	        }
        			return super.onOptionsItemSelected(item);}

    }
        


  
