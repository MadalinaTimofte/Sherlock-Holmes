package com.example.sherlockholmes.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.example.sherlockholmes.R;
import com.example.sherlockholmes.articles_rlg.RLGArticleActivity;

public class MainActivity extends Activity implements OnItemClickListener{
	
	GridView gridview;
	DashboardAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        gridview = (GridView)findViewById(R.id.grid_view);
        adapter = new DashboardAdapter(this);
        gridview.setAdapter(adapter);
        
        gridview.setOnItemClickListener(this);
    }
        	 public void onItemClick(AdapterView<?> parent, View view, int position,long id){
        	    	 switch( position ) {
        	         case 0:  Intent newActivity0 = new Intent(this,com.example.sherlockholmes.main_acd.MainActivity.class);     
        	                  startActivity(newActivity0);
        	                  break;
        	         case 1:  Intent newActivity1 = new Intent(this, RLGArticleActivity.class);     
        	                  startActivity(newActivity1);
        	                  break;
        	       /*  case 2:  Intent newActivity2 = new Intent(this, i3.class);     
        	                  startActivity(newActivity2);
        	                  break;
        	         case 3:  Intent newActivity3 = new Intent(this, i4.class);     
        	                  startActivity(newActivity3);
        	                  break;
        	         case 4:  Intent newActivity4 = new Intent(this, i5.class);     
        	                  startActivity(newActivity4);
        	                  break;
        	        }
         */
        }
        
    }
        
}

  
