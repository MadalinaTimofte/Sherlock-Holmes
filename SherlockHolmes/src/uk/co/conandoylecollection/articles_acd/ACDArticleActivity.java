package uk.co.conandoylecollection.articles_acd;


import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.main_acd.MainActivity;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ACDArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Conan Doyle");

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
        getMenuInflater().inflate(R.menu.activity_screen_slide, menu);

        menu.findItem(R.id.action_previous).setEnabled(mPager.getCurrentItem() > 0);

        // Add either a "next" or "finish" button to the action bar, depending on which page
        // is currently selected.
        MenuItem item = menu.add(Menu.NONE, R.id.action_next, Menu.NONE,
                (mPager.getCurrentItem() == pagerAdapter.getCount() - 1)
                        ? R.string.action_next
                        : R.string.action_finish);
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
      
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Navigate "up" the demo structure to the launchpad activity.
                NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
                return true;

            case R.id.action_previous:
                // Go to the previous step in the wizard. If there is no previous step,
                // setCurrentItem will do nothing.
                mPager.setCurrentItem(mPager.getCurrentItem() - 1);
                return true;

            case R.id.action_next:
                // Advance to the next step in the wizard. If there is no next step, setCurrentItem
                // will do nothing.
                mPager.setCurrentItem(mPager.getCurrentItem() + 1);
                
                return true;
           
        }

        return super.onOptionsItemSelected(item);
    }
    
    
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

            case 0: return FirstPageFragment.newInstance("Arthur Conan Doyle was born in Edinburgh on May 22nd 1859. He described his early years as ‘happy,’ spending his days acting out historical adventures and battles, or else endlessly pestering his mother and father with questions about science, history, and books. From the age of 9 he was educated at Stonyhurst, an austere Jesuit boarding school in the north of England, where the familiar public-school curriculum of algebra and classics was enforced through harsh discipline. Conan Doyle, it is said, was disciplined more than most because of his outspoken nature and hot temper.At Stonyhurst, Conan Doyle was an enthusiastic sportsman, excelling at cricket in particular. He also discovered an ability to write and tell extravagant stories, which his uncle, Richard, encouraged by taking the young Arthur to see plays in London, including Hamlet, featured Henry Irving, the greatest and most famous actor of the age.");
            case 1: return SecondPageFragment.newInstance("After leaving school, Conan Doyle trained as a doctor at the University of Edinburgh from 1876 to 1881, during which time his fellow students included J. M. Barrie (who later wrote Peter Pan) and Robert Louis Stevenson, author of Treasure Island and Dr Jeckyll and Mr Hyde. He also became friends with Dr Joseph Bell, one of the University tutors, a man well known for his method of deducing information about people and their lives through simple acts of observation and deduction: he would study the dirt on their shoes, the condition of their clothes, or the cleanliness of their fingernails, for example. This was exactly the detective method that Conan Doyle later attributed to his great detective, Sherlock Holmes, as he himself later acknowledged ‘It is no wonder that after the study of such a character, I used and amplified his methods when…I tried to build up a scientific detective who solves cases on his own merits and not through the folly of the criminal.'");
            default: return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }       
    }
}
