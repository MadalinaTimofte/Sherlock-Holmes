package uk.co.conandoylecollection.articles_acd;


import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.main_acd.MainActivity;
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
 * Introduction to Sir Arthur Conan Doyle article found inside ACD section.
 */
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
             * Edit the page of the article here.
             */
            case 0: return FirstPageFragment.newInstance("Arthur Conan Doyle was born in Edinburgh on May 22nd 1859, the eldest son of 9. Educated at Stonyhurst, " +
            		"an austere Jesuit boarding school in the north of England, where he discovered an ability to write and tell extravagant stories.\n\n" +
            		"Conan Doyle trained as a doctor at the University of Edinburgh where fellow students included J.M.Barrie and Robert Louis Stevenson. " +
            		"He also became friends with Dr Joseph Bell, a man well known for his method of deducing information about people " +
            		"and their lives through simple acts of observation and deduction - the influence which led to the creation of his greatest detective, Sherlock Holmes.\n\n" +
            		"The life of Sir Arthur Conan Doyle illustrates the excitement and diversity of the Victorian period as much as that of any other figure of this period.\n\n" +
            		"Over his life he was:\n" +
            		"• A surgeon on a whaling ship\n" +
            		"• A GP\n" +
            		"• An apprentice eye-surgeon\n" +
            		"• An unsuccesful parliamentary candidate (twice)\n" +
            		"• A multi-talented sportman\n" +
            		"• Behind the development of recreational skiing in Switzerland\n" +
            		"• A formidable public speaker\n" +
            		"• A campaigner against miscarriages of justice\n" +
            		"• The head of an extraordinary family\n" +
            		"• A succesful author\n" +
            		"• An outspoken proponent of spiritualism\n" +
            		"In his autobiography he wrote: 'I have had a life which, for variety and romance, could I think, hardly be exceeded.'\n\n" +
            		"The Portsmouth connection\n\n" +
            		"Doyle arrived in Portsmouth in 1882 and set up a GP surgery in Elm Grove, Southsea. " +
            		"He threw himself into the life of town joining the Portsmouth Literacy and Scientific Society, " +
            		"and giving public talks on Edward Gibbon, Thomas Carlyle, and George Meredith, among others.\n\n" +
            		"He also played for the local cricket and bowls teams, and was the first goalkeeper for the team that became Portsmouth Football Club. " +
            		"It was in Southsea he began his writing career with short stories, historical novels including 'Micah Clarke' " +
            		"and the first two Sherlock Holmes tales, 'A Study in Scarlet' and 'The Sign of Four'. \n\n" +
            		"Find out more about Arthur Conan Doyle:");
            
            default: return null;
            }
        }

       @Override
       public int getCount() {
            return 1;
       }       
    }
}
