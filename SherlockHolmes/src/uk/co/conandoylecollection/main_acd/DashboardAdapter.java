package uk.co.conandoylecollection.main_acd;

import uk.co.conandoylecollection.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class DashboardAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.icon_conan_doyle, R.drawable.icon_sherlock        
    };
    
    private String[] title = {
    		"Conan Doyle","Sherlock Holmes"
    };
    
  // Constructor
    public DashboardAdapter(Context c){
        mContext = c;
    }
 
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
 
    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }
 
    @Override
    public long getItemId(int position) {
        return 0;
    }
    
    public Integer[] getIcon(int position){
    	return mThumbIds;
    	
    }
    
    public String[] getTitle(int position){
    	return title;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	View row = convertView;
    	if(row==null){
    		LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            row = inflater.inflate(R.layout.grid_row, parent, false);


            TextView textViewTitle = (TextView) row.findViewById(R.id.textView);
            ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

            imageView.setImageResource(mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            textViewTitle.setText(title[position]);
    	}
       
        return row;
    }
 
}
