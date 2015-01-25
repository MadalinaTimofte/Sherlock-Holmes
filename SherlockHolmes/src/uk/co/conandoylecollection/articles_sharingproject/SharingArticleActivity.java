package uk.co.conandoylecollection.articles_sharingproject;


import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.articles_sharingproject.FirstPageFragment;
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

/*
 * The Sharing Sherlock Project article found inside About Collection section.
 */
public class SharingArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("About Collection");

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

            /*
             * Edit here the text of the article.
             */
            case 0: return FirstPageFragment.newInstance("Sir Arthur Conan Doyle's connections to Portsmouth are strong - he was living here " +
            		"when he wrote his first novel, 'The Study in Scarlet', and he played an important part in the life of the city.\n\n" +
            		"To promote the history of Arthur Conan Doyle's association with Portsmouth, and to " +
            		"allow the local community more access to the full potential of the Collection, the " +
            		"Heritage Lottery Fund has given a grant for the creation of the Sharing Sherlock project.\n\n" +
            		"The project includes:\n" +
            		"• 10 touring exhibitions, each created by a community or school\n " +
            		"• An online exhibition\n" +
            		"• 30 outreach and education community/school workshops resulting in a better understanding of the literary heritage or Portsmouth and the themes from the collection\n" +
            		"• A series of school and community group study packs and handling boxes aimed at Key stage 2 to 4 which will support the exhibition and workshop programme\n" +
            		"• Engagement and training opportunities for 20 new volunteers.\n\n" +
            		"The exhibitions are on a wide range of themes, stretching from Arthur Conan Doyle: " +
            		"Sporting Hero to The Lost World, and are taking place in local community centres and public spaces.\n\n" +
            		"This app is part of this project and provides an introduction to Arthur Conan Doyle " +
            		"and the Richard Lancelyn Green Collection housed at Portsmouth's Central Libray.\n\n" +
            		"Find out more about the Arthur Conan Doyle Collection: ");
            default: return null;
            }
        }
 
        @Override
        public int getCount() {
            return 1;
        }       
    }
}
