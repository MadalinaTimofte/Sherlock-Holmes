package uk.co.conandoylecollection.exhibitions;

import uk.co.conandoylecollection.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
/*
 * Class creating thumbnails for exhibitions list found inside Exhibitions section.
 */
public class DashboardAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    private Integer[] mThumbIds = {
            R.drawable.agoodsport, R.drawable.thepompeylad,
            R.drawable.stitchingastory, R.drawable.thelostworld1, 
            R.drawable.studyforsherlock, R.drawable.thecottingleyfairies, 
            R.drawable.grippingyarns, R.drawable.tocatchathief, 
           R.drawable.playingsherlock};
    
    private String[] title = {
    		"","","","","","","","","",""
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
    		
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(     Context.LAYOUT_INFLATER_SERVICE );
            row = inflater.inflate(R.layout.grid_row, parent, false);
        } else {
            row = (View) convertView;
        }

            TextView textViewTitle = (TextView) row.findViewById(R.id.textView);
            ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

            imageView.setImageResource(mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            textViewTitle.setText(title[position]);
    	
       
        return row;
    }
 
}
