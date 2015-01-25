package uk.co.conandoylecollection.articles_holmes;

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

/*
 * The Introdcution to Sherlock Holmes article found inside ACD section.
 */
public class HolmesArticleActivity extends FragmentActivity {

	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);    
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Sherlock Holmes");

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
                // See http://developer.android.com/design/patterns/navigation.html for more.
                NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
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
            
            /*
             * Edit the text of the article here.
             */
            case 0: return FirstPageFragment.newInstance("Detective fiction was a relatively new genre of writing when Sir Arthur Conan Doyle first " +
            		"started writing. The genre emerged through the short stories of Edgar Allan Poe but it was Conan Doyle " +
            		"who firmly established detective fiction as perhaps the most popular genre of all.\n\n A Study in Scarlet\n\n" +
            		"The first Sherlock Holmes story, 'A Study in Scarlet' initially appeared in Beeton's Christmas Annual in 1887. " +
            		"The story details the events following the kidnap, forced marriage, and later death of a young woman in United States.\n\n" +
            		"Sherlock Holmes introduced himself to the Victorian readership as an extraordinary English " +
            		"reasoning-machine, a man using the latest forensic techniques and a method of deduction " +
            		"taken from Conan Doyle's friend, Joseph Bell. Holmes interprets footprints, shoe prints, carriage-wheel" +
            		"tracks, horseshoe prints, bicycle tracks, and tobacco ash. His investigations were the " +
            		"Victorian equivalent of the modern CSI series.\n\n" +
            		"Conan Doyle wrote 'The Sign of Four', the second of the two Sherlock Holmes novels written in Portsmouth, " +
            		"at the request of the editor of Lippincott's Magazine, who he had met at a dinner party in London.\n\n" +
            		"Find out more about Sherlock Holmes " );
           
           default: return null;
            }
        }

        @Override
        public int getCount() {
            return 1;
        }       
    }
}