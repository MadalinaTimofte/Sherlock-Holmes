package uk.co.conandoylecollection.articles_spiritualism;



import uk.co.conandoylecollection.articles_spiritualism.FirstPageFragment;
import uk.co.conandoylecollection.articles_spiritualism.SecondPageFragment;
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

public class SpiritualismArticleActivity extends FragmentActivity {
	private ViewPager mPager;
	private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);   
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Spiritualism");

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
            case 0: return FirstPageFragment.newInstance("With the exception of Sherlock Holmes perhaps the most significant aspect of Conan Doyle’s later life was his conversion to the cause of spiritualism.\n\n He became one of the leading voices of the spiritualist movement after the First World War, when, like many people of his time, he lost close family members as a result of the war.\n\n Much of Arthur Conan Doyle’s later life was devoted to a crusade to spread the word of spiritualism across the world, through public speaking, and works such as The Land of Mists (1926) and The History of Spiritualism (1926).\n\nHe toured the globe speaking about what he saw as the ‘truth’ of séances, mediums, and visitations from the dead.");
            case 1:return SecondPageFragment.newInstance("Conan Doyle's faith in spiritualism was strong, and he cared little whether others agreed with him or not.\n\n His friendship with Harry Houdini, the famous escapologist, ended because of their disagreements about spiritualism. Many people ridiculed Conan Doyle’s faith in spiritualism, which seemed to them to contradict the rational, objective science of the Holmes stories.\n\n The ridicule increased when he published The Coming of the Fairies, in which he supported the existence of fairies on the basis of the ‘eye-witness’ account of two young girls from Yorkshire. Their tale of ‘The Cottingley Fairies,’ later made into a 1997 film, Fairy Tale: A True Story, confirmed to many the idea that Conan Doyle was losing his grip on reality.\n\nYet Conan Doyle’s importance within the history of spiritualism cannot be overestimated. Just days after his death, a spiritualist meeting at the Royal Albert Hall was organized so that he could make one final appearance from beyond the grave.\n\n Thousands attended, including Lady Conan Doyle and several of the Conan Doyle children. A row of chairs was arranged on the stage for the family, with one left empty for Sir Arthur himself. And even when he did not himself appear, there were many people in the audience who claimed they had felt his presence among them.");
            default:return null;          
  }
        }

        @Override
        public int getCount() {
            return 2;
        }       
    }
}