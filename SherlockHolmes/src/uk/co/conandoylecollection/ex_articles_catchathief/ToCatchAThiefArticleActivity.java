package uk.co.conandoylecollection.ex_articles_catchathief;


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

public class ToCatchAThiefArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("To Catch a Thief");

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

            case 0: return FirstPageFragment.newInstance("In Arthur Conan Doyle’s story Charles Augustus Milverton, Sherlock Holmes and Dr Watson, equipped" + 
														"with a ‘first-class, up-to-date burgling kit’, are doing a " +
														"spot of house-breaking. They are looking for documents"+
														"which will incriminate the building’s owner, the blackmailer"+
														"Charles Augustus Milverton. The pair are in disguise, "+
														"wearing silken masks specially made by Watson for the occasion.\n\n" +
														"For better or worse, masks transform people – as the" + 
                                                        "students of Harbour School’s Key Stage 3 Group " +
                                                        "discovered while creating their own fanciful masks and"+ 
                                                        "costumes. Like those of Holmes and Watson, their"+ 
                                                        "disguises are designed to entrap criminals.\n\n" +
                                                        "Find out more about the To Catch a Thief exhibition "

 );
            
            default: return null;
            }
        }

       @Override
       public int getCount() {
            return 1;
       }       
    }
}
