package com.example.sherlockholmes;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class DisplayExhibitions extends Activity implements OnItemClickListener{
	
	public static final String[] titles = new String[] { "Strawberry",
        "Banana", "Orange", "Mixed" };
	
	public static final Integer[] images = {R.drawable.acd2,R.drawable.acd6,R.drawable.acd7,R.drawable.acd18,
		R.drawable.acd20,R.drawable.challenger,R.drawable.gerald,R.drawable.holmes};
	
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
    	Toast toast = Toast.makeText(getApplicationContext(),"Item" + (position+1)+":"+rowItems.get(position), Toast.LENGTH_SHORT);
    	toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL,0,0);
    	toast.show();
    }
    
    
    }

   