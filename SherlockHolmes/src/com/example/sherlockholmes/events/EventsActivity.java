package com.example.sherlockholmes.events;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sherlockholmes.R;

public class EventsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView list = (ListView) findViewById(R.id.ListView01);
        list.setClickable(true);

        final List<Event> listOfEvents = new ArrayList<Event>();
        listOfEvents.add(new Event("Test", "9981728", "test@test.com"));
        listOfEvents.add(new Event("Test1", "1234455", "test1@test.com"));
        listOfEvents.add(new Event("Test2", "00000", "test2@test.com"));

        EventAdapter adapter = new EventAdapter(this, listOfEvents);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long index) {
                System.out.println("sadsfsf");
                showToast(listOfEvents.get(position).getTheme());
            }
        });

        list.setAdapter(adapter);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}