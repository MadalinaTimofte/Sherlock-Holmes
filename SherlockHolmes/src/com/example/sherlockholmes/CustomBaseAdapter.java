package com.example.sherlockholmes;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomBaseAdapter extends BaseAdapter{
	Context context;
	List<RowItem> rowItems;
	
	public CustomBaseAdapter(Context context, List<RowItem> items){
		this.context = context;
		this.rowItems = items;
	}
	 
	private class ViewHolder{
		ImageView imageView;
		
		
	}
	
	public View getView(int position, View convertView, ViewGroup parent){
	ViewHolder holder = null;
	
	LayoutInflater nInflater = (LayoutInflater)
			context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if(convertView == null){
			convertView = nInflater.inflate(R.layout.list_item, null);
			holder = new ViewHolder();
			holder.imageView = (ImageView) convertView.findViewById(R.id.list_image);
			convertView.setTag(holder);
		}
		else{
			holder = (ViewHolder) convertView.getTag();
		
		}
		RowItem rowItem = (RowItem) getItem(position);
		holder.imageView.setImageResource(rowItem.getImageId());
		
		return convertView;
}
@Override
public int getCount() {
    return rowItems.size();
}

@Override
public Object getItem(int position) {
    return rowItems.get(position);
}

@Override
public long getItemId(int position) {
    return rowItems.indexOf(getItem(position));
}
}