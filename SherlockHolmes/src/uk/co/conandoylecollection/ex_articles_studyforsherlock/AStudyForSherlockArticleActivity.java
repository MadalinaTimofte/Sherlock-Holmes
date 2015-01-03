package uk.co.conandoylecollection.ex_articles_studyforsherlock;


import uk.co.conandoylecollection.R;
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

public class AStudyForSherlockArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("A Study For Sherlock");

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
               NavUtils.navigateUpTo(this, new Intent(this, uk.co.conandoylecollection.exhibitions.MainActivity.class));
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

            case 0: return FirstPageFragment.newInstance("In the opening scenes of Sir Arthur Conan Doyle’s first Sherlock Holmes novel, A Study in Scarlet (written in Portsmouth), " +
            		"Holmes and Dr Watson go to view some lodgings at 221B Baker Street.\n\n"+
            		"This address was to stay unchanged through all the many stories about Doyle’s extraordinary detective. And the sitting-room became Holmes’s laboratory and study," +
            		" the centre of his investigations.\n\n" +
            		"As part of the Sharing Sherlock project Portsmouth MIND group designed, built and painted their own personal version of this most famous of imaginary places," +
            		" the study of Sherlock Holmes and his fellow detective, Dr Watson. To accompany their display, they selected a variety of objects on the same theme.\n\n" +
            		"Find out more about A Study for Sherlock exhibition ");
            
            default: return null;
            }
        }

       @Override
       public int getCount() {
            return 1;
       }       
    }
}
