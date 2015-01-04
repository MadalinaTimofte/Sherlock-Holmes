package uk.co.conandoylecollection.ex_articles_cottingleyfairies;


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

public class TheCottingleyFairiesArticleActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("The Cottingley Fairies");

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

            case 0: return FirstPageFragment.newInstance("In the summer of 1917, in leafy Cottingley Glen near Shipley in West Yorkshire, Elsie Wright aged 16," +
            		" and her cousin Frances Griffiths aged 9, claimed to have taken photographs of fairies. The photographs showed the fairies flying around the glen " +
            		"in the company of the girls.\n\n" +
            		"The photographs were later seen by Arthur Conan Doyle, who included them in an article he was writing about fairy lore. The article was published in the Christmas 1920" +
            		" edition of the Strand magazine.\n\n" +
            		"Find out more about The Cottingley Fairies exhibition and Arthur Conan Doyle and Spiritualism "
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
