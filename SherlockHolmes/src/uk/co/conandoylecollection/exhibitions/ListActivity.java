package uk.co.conandoylecollection.exhibitions;

import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.ex_articles_agoodsport.AGoodSportArticleActivity;
import uk.co.conandoylecollection.ex_articles_catchathief.ToCatchAThiefArticleActivity;
import uk.co.conandoylecollection.ex_articles_cottingleyfairies.TheCottingleyFairiesArticleActivity;
import uk.co.conandoylecollection.ex_articles_grippingyarns.GrippingYarnsArticleActivity;
import uk.co.conandoylecollection.ex_articles_playingsherlock.PlayingSherlockHolmesArticleActivity;
import uk.co.conandoylecollection.ex_articles_stitchingastory.StitchingAStoryArticleActivity;
import uk.co.conandoylecollection.ex_articles_studyforsherlock.AStudyForSherlockArticleActivity;
import uk.co.conandoylecollection.ex_articles_thelostworld.TheLostWorldArticleActivity;
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

public class ListActivity extends Activity implements OnItemClickListener{
	
	GridView gridview;
	DashboardAdapter adapter;
	Application activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_gridview);
        
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
        	         case 2:  Intent newActivity2 = new Intent(this, StitchingAStoryArticleActivity.class);     
	                          startActivity(newActivity2);
	                
	                          break;   
	                          
        	         case 3:  Intent newActivity3 = new Intent(this, TheLostWorldArticleActivity.class);     
                              startActivity(newActivity3);
           
                     break;    
	                        
        	         case 4:  Intent newActivity4 = new Intent(this, AStudyForSherlockArticleActivity.class);     
                              startActivity(newActivity4);
           
                     break;
                     
        	         case 5:  Intent newActivity5 = new Intent(this, TheCottingleyFairiesArticleActivity.class);     
                              startActivity(newActivity5);
           
                     break;
                     
        	         case 6:  Intent newActivity6 = new Intent(this, GrippingYarnsArticleActivity.class);     
                              startActivity(newActivity6);
           
                     break;
                     
        	         case 7:  Intent newActivity7 = new Intent(this, ToCatchAThiefArticleActivity.class);     
                              startActivity(newActivity7);
           
                     break;
                     
        	         case 8:  Intent newActivity8 = new Intent(this, PlayingSherlockHolmesArticleActivity.class);     
                              startActivity(newActivity8);
           
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
        


  
