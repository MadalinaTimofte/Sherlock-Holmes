package uk.co.conandoylecollection.articles_holmes;


import uk.co.conandoylecollection.articles_acd.ACDArticleActivity;
import uk.co.conandoylecollection.articles_holmes.FirstPageFragment;
import uk.co.conandoylecollection.articles_holmes.SecondPageFragment;
import uk.co.conandoylecollection.articles_holmes.ThirdPageFragment;
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

import uk.co.conandoylecollection.R;
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
                // See http://developer.android.com/design/patterns/navigation.html for more.
                NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
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
		return super.onOptionsItemSelected(item);}
    
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
            case 0: return FirstPageFragment.newInstance("Detective fiction was a relatively new genre of writing when Sir Arthur Conan Doyle first turned his hand to it.\n\n It had emerged through the shortstories of Edgar Allan Poe, notably ‘The Murders in the Rue Morgue,’ ‘The Purloined Letter,’ and ‘The Myster of Marie Roget’ in the 1840s.\n\n In the following decades, popular English writers such as Charles Dickens and Wilkie Collins, and continental writers such as Emile Gaboriau, explored detection and detectives within their work.");
            case 1: return SecondPageFragment.newInstance("It was Conan Doyle who firmly established detective fiction as perhaps the most popular genre of all. The first Sherlock Holmes story, A Study in Scarlet, initially appeared in Beeton’s Christmas Annual in 1887.\n\n It was later published in volume edition, illustrated by Conan Doyle’s father, the artist Charles Altamount Doyle. The story is about the events following the kidnap, forced marriage, and later death of a young woman in the United States.\n\n The young woman’s fiancé, it turns out, decides to take his revenge on the two men whom he sees as responsible for her death, and so tracks them across the world before eventually killing them both");
            case 2: return ThirdPageFragment.newInstance("In solving the mystery, Sherlock Holmes introduced himself to the Victorian readership as an extraordinary English reasoning-machine, a man using the latest forensic techniques and a method of deduction that taken from Conan Doyle’s friend, Joseph Bell.\n\n Holmes interprets footprints, shoe prints, carriage-wheel tracks, horseshoe prints, bicycle tracks, and tobacco ash. In later Holmes stories he would also examine cigar butts, typefaces, human remains, gunpowder residue, bullet marks and fingerprints, all as crucial forensic evidence in the solving of cases.\n\n His investigations were the Victorian equivalent of the modern CSI series.Conan Doyle. produced The Sign of Four, the second of the two Sherlock Holmes novels written in Portsmouth, at the request of the editor of Lippincott’s Magazine, who he had met at a dinner party in London.\n\n Conan Doyle agreed to the request to write a story, as did another member of the dinner party, Oscar Wilde. Wilde’s ‘story’ became the novel The Picture of Dorian Gray.");
           default: return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }       
    }
}