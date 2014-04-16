package com.example.sherlockholmes.main;

import java.util.ArrayList;
import java.util.List;

import com.example.sherlockholmes.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class DisplayExhibitions extends Activity implements OnItemClickListener{
	
	public static final String[] titles = new String[] { "Sherlock",
		"Sherlock", "Sherlock", "Sherlock","Sherlock","Sherlock","Sherlock" };
	
	public static final Integer[] images = {R.drawable.articles_conandoyle,R.drawable.articles_conandoyle,R.drawable.articles_conandoyle,R.drawable.articles_conandoyle,
		R.drawable.articles_conandoyle,R.drawable.articles_conandoyle,R.drawable.articles_conandoyle,R.drawable.articles_conandoyle};
	
	ListView listView;
	List<RowItem> rowItems;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list);
       
        rowItems = new ArrayList<RowItem>();
        for(int i=0;i<titles.length;i++){
        	RowItem item = new RowItem(images[i],titles[i]);
        	rowItems.add(item);
        }
        listView =(ListView)findViewById(R.id.list);
        CustomBaseAdapter adapter = new CustomBaseAdapter(this, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        }
    
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id){
    	/* switch( position ) {
         case 0:  Intent newActivity0 = new Intent(this, i1.class);     
                  startActivity(newActivity0);
                  break;
         case 1:  Intent newActivity1 = new Intent(this, i2.class);     
                  startActivity(newActivity1);
                  break;
         case 2:  Intent newActivity2 = new Intent(this, i3.class);     
                  startActivity(newActivity2);
                  break;
         case 3:  Intent newActivity3 = new Intent(this, i4.class);     
                  startActivity(newActivity3);
                  break;
         case 4:  Intent newActivity4 = new Intent(this, i5.class);     
                  startActivity(newActivity4);
                  break;
        }*/
    }
    
    
    }

   