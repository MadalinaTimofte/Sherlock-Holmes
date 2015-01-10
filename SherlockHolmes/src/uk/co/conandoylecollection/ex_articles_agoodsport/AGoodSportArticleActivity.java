package uk.co.conandoylecollection.ex_articles_agoodsport;


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
 * The Conan Doyle - A Good Sport article found inside Exhibitions section.
 */
public class AGoodSportArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Conan Doyle - A Good Sport");

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
             * Edit here the text of the article.
             */
            case 0: return FirstPageFragment.newInstance("Loewood House, a day care service for adults with learning " +
                                                         "and physical disabilities, put together an exhibition to celebrate Arthur Conan Doyle's sporting prowess.\n\n" +
            		                                     "Cricket and football may have been his favoured sports, but Doyle was also proficient and enthusiastic about rugby," +
            		                                     " boxing, cycling, riding, hunting, golf, billiards, motoring, bowls, and the new-fangled sport of skiing.\n\n" +
            		                                     "Sherlock Holmes may not have been a fan but sport appeared in a number of Doyle's novels and short stories.\n\n" +
            		                                     "Find out more about the Conan Doyle - A Good Sport exhibition: ");
            
            default: return null;
            }
        }

       @Override
       public int getCount() {
            return 1;
       }       
    }
}
