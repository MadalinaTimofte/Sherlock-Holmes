package uk.co.conandoylecollection.ex_articles_thepompeylad;


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

public class ThePompeyLadArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Conan Doyle - The Pompey Lad");

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
               NavUtils.navigateUpTo(this, new Intent(this, uk.co.conandoylecollection.exhibitions.ListActivity.class));
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

            case 0: return FirstPageFragment.newInstance("Arthur Conan Doyle lived in Southsea when he wrote the first" +
            		" two Sherlock stories A Study in Scarlet and The Sign of Four.\n\n" +
            		"Conan Doyle threw himself into the life of the town. He joined the Portsmouth Literary and Scientific Society," +
            		" and gave public talks on Edward Gibbon, Thomas Carlyle, and George Meredith, among others. He also played for the" +
            		" local cricket and bowls teams, and was the first goalkeeper for the team that became Portsmouth Football Club.\n\n"+
            		"Doyle had less than £10 in his pockets when he arrived in Portsmouth. By the time he left, eight years later, " +
            		"he was acclaimed both as a writer and a society man. His creation Sherlock Holmes nowbelongs to the world, but, " +
            		"Portsmouth-born, he remains a Pompey lad.\n\n"+
            		"Find out more about Conan Doyle: A Pompey Lad ");
            
            default: return null;
            }
        }

       @Override
       public int getCount() {
            return 1;
       }       
    }
}
