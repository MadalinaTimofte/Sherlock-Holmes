package uk.co.conandoylecollection.events;

import java.util.ArrayList;
import java.util.List;

import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.main.MainActivity;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.ListView;

public class EventsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Events");

        ListView list = (ListView) findViewById(R.id.listEvents);
        list.setClickable(true);

        final List<Event> listOfEvents = new ArrayList<Event>();
        listOfEvents.add(new Event("Conan Doyle Collection","4 March 2014 - 1 April 2014" , "Landport Community Centre"));
        listOfEvents.add(new Event("Conan Doyle Collection","18 Februrary - 4 March 2014" , "John Pounds Centre"));
        listOfEvents.add(new Event("The Lost World","18 Jan 2014 - 4 Feb 2014",  "John Pounds Centre"));
        listOfEvents.add(new Event("The Lost World","5 Dec 2013 - 6/7 Jan 2014",  "Paulsgrove Community Centre"));
        listOfEvents.add(new Event("Conan Doyle : The Pompey Lad","30 Oct 2013 - 27 Nov 2013" , "Fratton Community Centre"));
        

        EventAdapter adapter = new EventAdapter(this, listOfEvents);

        list.setAdapter(adapter);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Navigate "up" the demo structure to the launchpad activity.
                // See http://developer.android.com/design/patterns/navigation.html for more.
                NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
                return true;
        }
                return super.onOptionsItemSelected(item);
}
}