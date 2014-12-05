package uk.co.conandoylecollection.articles_aboutcollection;


import uk.co.conandoylecollection.R;
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

public class CollectionArticleActivity extends FragmentActivity {
	
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
        getMenuInflater().inflate(R.menu.activity_screen_slide, menu);

        menu.findItem(R.id.action_previous).setEnabled(mPager.getCurrentItem() > 0);

        // Add either a "next" or "finish" button to the action bar, depending on which page
        // is currently selected.
        MenuItem item = menu.add(Menu.NONE, R.id.action_next, Menu.NONE,
                (mPager.getCurrentItem() == pagerAdapter.getCount() - 1)
                        ? R.string.action_finish
                        : R.string.action_next);
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

        public MyPagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int pos) {
            switch(pos) {

            case 0: return FirstPageFragment.newInstance("Richard Lancelyn Green was a leading expert on Sir Arthur Conan Doyle and Sherlock Holmes and " +
            		"he collected passionately from an early age, over a period of 40 years.\n\n" +
            		"The Collection includes first editions of books, related letters, film and television " +
            		"memorabilia, as well as part of Richard’s recreation of Sherlock Holmes’ Baker Street study. " +
            		"Richard collected items with some connection, however obscure, with Sherlock Holmes – " +
            		"from matchboxes with Sherlock Holmes on them, to adverts in magazines and even copies " +
            		"of the Radio Times with listings of related programmes. \n\n" +
            		"Lancelyn Green decided to bequeath his collection to Portsmouth after visiting the city’s Central " +
            		"Library as part of his research into Conan Doyle. Impressed by the knowledgeable and helpful staff he " +
            		"decided Portsmouth should eventually become home to his life’s work. He died unexpectedly in 2004 " +
            		"at the early age of 50.\n\n" +
            		"Always willing to help out others who shared his passion for Holmes and Conan Doyle, he insisted, as " +
            		"a condition of his bequest, that his collection remain available to the general public as well as to " +
            		"scholars and aficionados.\n\n" +
            		"This app provides merely a glimpse into the world of Sir Arthur Conan Doyle as portrayed by the " +
            		"wealth of information bequeathed to the city.");
            case 1: return SecondPageFragment.newInstance("The archive and research centre is based in the Portsmouth History Centre in Porstmouth Central Library.\n\n" +
            		"The Arthur Conan Doyle Richard Lancelyn Green bequest offers the opportunity:\n" +
            		"• To explore the everyday existence of Arthur Conan Doyle during the Victorian and Edwardian eras \n" +
            		"• To discover the breadth of interests Conan Doyle had during his lifetime " +
            		"• To put Conan Doyle’s work into context and extend an understanding of his writing, his world and his legacy" +
            		"• To use the atmospheric ‘A Study in Sherlock’ exhibition to inspire new creative writing" +
            		"• To understand the vital importance of 'detective skills', i.e. research, observation, information management in developing abilities which will benefit pupils throughout their lives\n\n" +
            		"To visit the collection contact us on 023 9283 4727 or email ");
            default: return null;
            }
        }
 
        @Override
        public int getCount() {
            return 2;
        }       
    }
}
