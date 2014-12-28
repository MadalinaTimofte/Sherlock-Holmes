package uk.co.conandoylecollection.exhibitions;


import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.exhibitions.FirstPageFragment;
import uk.co.conandoylecollection.main_aboutCollection.MainActivity;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ExhibitionMainActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("About Exhibitions");

        mPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
        mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // When changing pages, reset the action bar actions since they are dependent
                // on which page is currently active. An alternative approach is to have each
                // fragment expose actions itself (rather than the activity exposing actions),
                // but for simplicity, the activity provides the actions in this sample.
                invalidateOptionsMenu();
            }
        });
    
    }

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Navigate "up" the demo structure to the launchpad activity.
                NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int pos) {
            switch(pos) {

            case 0: return FirstPageFragment.newInstance("These online exhibitions form part of the Sharing Sherlock: The Story of a Pompey " +
            		"Lad about Sir Arthur Conan Doyle. Based upon the touring exhibitions created " +
            		"with local schools and groups, this online exhibition provides a glimpse into the world " +
            		"of Sir Arthur Conan Doyle as portrayed in the Sir Arthur Conan Doyle collection of " +
            		"first editions of books, related letters, film and television memorabilia bequeathed to " +
            		"Portsmouth by Richard Lancelyn Green.\n\n" +
            		"It was in Portsmouth that Sir Arthur Conan Doyle introduced his most famous creation, " +
            		"Sherlock Holmes, when he published his first story A Study in Scarlet. \n\n" +
            		"These exhibitions celebrate the life and work of one of Portsmouth's most celebrated residents.\n");
            default: return null;
            }
        }
 
        @Override
        public int getCount() {
            return 1;
        }       
    }
}
