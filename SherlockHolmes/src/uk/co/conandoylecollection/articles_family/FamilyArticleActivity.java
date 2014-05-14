package uk.co.conandoylecollection.articles_family;


import uk.co.conandoylecollection.R;
import uk.co.conandoylecollection.articles_acd.ACDArticleActivity;
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



public class FamilyArticleActivity extends FragmentActivity {

	
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Conan Doyle Family");

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
            case 0:return FirstPageFragment.newInstance("Arthur Ignatius Conan Doyle was born in Edinburgh on the 22 May 1859 to an English father, Charles Altamont Doyle, and an Irish mother, Mary (nee Foley).\n\n His father came from a prosperous Catholic family, which also originated from Ireland, many of whom were noted artists and illustrators. Mary was a devoted mother, and fantastic story teller, who filled his childhood with wonderful tales she had invented.\n\n Unfortunately Charles suffered from alcoholism and his erratic behaviour meant that there was little money during Arthur’s upbringing.Arthur was the eldest of son of 9 siblings seven of whom survived into adulthood.\n\n His sisters became governess’ before marrying well. One of his sisters, Connie, married a friend and fellow author, Ernest Hornung, who created the gentleman thief, Raffles.\n\n Arthur’s only brother, Innes, joined him during his time in Portsmouth for part of his schooling before joining the army. He was awarded a DSO before dying in the Spanish flu epidemic of 1919 at the early age of 45.");
            case 1: return SecondPageFragment.newInstance("It was during his time spent in Portsmouth as a doctor that Arthur met and fell in love with a sister of one of his patients, Louise Hawkins (known as Touie).\n\n They married at St Oswald’s church, Thornton in Lonsdale, in August 1885. A daughter, Mary, was born in Portsmouth in 1889.In 1890 Arthur left Portsmouth to pursue a practice in Upper Wimpole Street as an eye specialist.\n\n It was not successful, however, and it is rumoured that not a single patient called on his services. Fortunately by this time his writing was becoming more profitable and in 1891 he decided to give up medicine to concentrate on writing.\n\n His eldest son, Arthur Alleyne Kingsley, was born in 1892.Louise was diagnosed with tuberculosis in 1893 and, although she was only initially given a few months to live, Arthur took great care of her welfare until her death in 1906.\n\n He built a substantial new house, Undershaw, at Hindhead in Surrey for the family, as he believed that the air there would be beneficial.");
            case 2: return ThirdPageFragment.newInstance("In 1897 Arthur Conan Doyle. had met a striking younger woman, Jean Leckie, with whom he fell passionately in love. They remained friends for the following decade finally marrying in 1907, a year after Louise’s death.\n\n The family moved once more, this time to Windlesham in Crowborough, a house that Arthur and Jean substantially renovated. There were three more children born to this second family, namely, Denis (born 1909), Adrian (born 1910) and Lena Jean (1912) who was known as Billie.\n\nArthur was devastated by the death of his eldest son, known as Kingsley, in 1918. Although badly wounded on the first day of the battle of the Somme, Kingsley was in relatively good health when he was stuck down by the Spanish influenza epidemic.\n\nArthur remained very active throughout the 1920s, particularly promoting his spiritualist beliefs, before suffering from heart disease from which he died on the 7th July 1930. He was buried initially at Windlesham before being moved to Minstead in the New Forest to lie with his second wife, Jean.\n\n She died in 1940.His children continued his spiritualist interests after his death. His eldest daughter Mary continued to run the Psychic bookshop in London. She remained unmarried until her death in 1976.\n\n Denis and Adrian continued to give talks, promote spiritualism and to run the Conan Doyle estate. Denis married Nina M’divani, a Georgian princess, and travelled to world. He died relatively young while visiting India in 1955. Adrian married Anna Anderson and they settled first in Tangiers before opening the Conan Doyle Foundation in Switzerland.\n\n He continued to run the estate until his death in 1970. The youngest daughter, Lena Jean, after a long career, became the Director of the Women’s Royal Air Force, (hence acquiring the title ‘Dame’), in 1963. She married, late in life, Geoffrey Bromet, who was 20 years her senior. She died in 1997 at the age of 85.  None of Arthur’s children had offspring so he left no direct descendants.");
            default:return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }       
    }
}