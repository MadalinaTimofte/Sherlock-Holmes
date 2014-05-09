package uk.co.conandoylecollection.events;

import java.util.List;

import uk.co.conandoylecollection.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter {
    private Context context;

    private List<Event> listEvents;

    public EventAdapter(Context context, List<Event> listEvents) {
        this.context = context;
        this.listEvents = listEvents;
    }

    public int getCount() {
        return listEvents.size();
    }

    public Object getItem(int position) {
        return listEvents.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Event entry = listEvents.get(position);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.event_row, null);
        }
        TextView theme = (TextView) convertView.findViewById(R.id.theme);
        theme.setText(entry.getTheme());

        TextView time = (TextView) convertView.findViewById(R.id.time);
        time.setText(entry.getDate());

        TextView place = (TextView) convertView.findViewById(R.id.place);
        place.setText(entry.getPlace());

        // Set the onClick Listener on this button
       // Button btnGallery = (Button) convertView.findViewById(R.id.btnGallery);
      //  btnGallery.setOnClickListener(new OnClickListener(){
      //  	public void onClick(){
       // 		Intent intent = new Intent(EventAdapter.this,PompeyLadGridLayoutActivity.class );
       // 		startActivity(intent);
       // 		finish();
     //   	}
      //  });
     
        // btnRemove.setId(position);
        

        return convertView;
    }

   
}