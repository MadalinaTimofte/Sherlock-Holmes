package uk.co.conandoylecollection.ex_articles_playingsherlock;

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

/*
 * The Playing Sherlock Holmes article found inside Exhibitions section.
 */
public class PlayingSherlockHolmesArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Playing Sherlock Holmes");

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

            /*
             * Edit text of the article here.
             */
            case 0: return FirstPageFragment.newInstance("When Arthur Conan Doyle created Sherlock Holmes, he had no idea of how popular his hero was to become. Soon famous as a man of many disguises," +
            		" Sherlock began to appear in places other than books and magazines.\n\n" +
            		"In 1899, he was played on stage by the charismatic American actor William Gillette (who coined the phrase ‘Elementary my dear Watson’). On screen he has been played by many different actors," +
            		" such as Basil Rathbone, Jeremy Brett and currently, Benedict Cumberbatch.\n\n" +
            		"The New Theatre Royal Drama Group in Portsmouth – children of five to eleven years old – meet weekly for drama workshops. Responding enthusiastically to stories of Sherlock Holmes, they have" +
            		" improvised and performed two plays about him, and chosen toys and games to go in the accompanying case for their exhibition.\n\n" +
            		"Find out more about the Playing Sherlock Holmes exhibition ");
            
            default: return null;
            }
        }

       @Override
       public int getCount() {
            return 1;
       }       
    }
}
