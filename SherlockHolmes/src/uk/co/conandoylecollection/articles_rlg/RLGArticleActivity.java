package uk.co.conandoylecollection.articles_rlg;

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

import uk.co.conandoylecollection.R;

import uk.co.conandoylecollection.main_aboutCollection.MainActivity;

/*
 * The Introduction to Richard Lancelyn Green article found inside About Collection section.
 */
public class RLGArticleActivity extends FragmentActivity {
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);  
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("RLG");

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
		return super.onOptionsItemSelected(item);}
    
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

            /*
             * Edit here the text of the article.
             */
            case 0: return FirstPageFragment.newInstance("Richard devoted his life to the study of Sherlock Holmes and Sir Arthur Conan Doyle " +
            		"and was recognised world-wide as one of the leading experts in this field. He" +
            		"amassed the most wide-ranging collection of Conan Doyle and Holmes material " +
            		"anywhere in the world, buying up first editions of books, related letters, film and " +
            		"television memorabilia, merchandising and paraphernalia. He even recreated the " +
            		"221b Baker Street study in his attic.\n\n" +
            		"Throughout his life, he was a prolific writer on Holmes and Conan Doyle, producing " +
            		"over 200 separate publications.  He was an active member of many of the groups " +
            		"associated with Sherlock Holmes and Conan Doyle. He was Chairman of the " +
            		"Sherlock Holmes Society of London for the period 1996-99. He was well respected " +
            		"and liked for his good sense of humour and generosity to other scholars, his " +
            		"collection and his encyclopaedic knowledge.\n\n" +
            		"Richard Lancelyn Green died in 2004 at the early age of 50 and bequeathed his collection to the City of Portsmouth.\n\n" +
            		"Find out more about the Richard Lancelyn Green Collection:  ");
           
            default: return null;
            }
        }

        @Override
        public int getCount() {
            return 1;
        }       
    }
}