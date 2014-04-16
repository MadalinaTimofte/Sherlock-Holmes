package com.example.sherlockholmes.articles_spiritualism;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.sherlockholmes.R;
import com.example.sherlockholmes.articles_spiritualism.FirstPageFragment;
import com.example.sherlockholmes.articles_spiritualism.SecondPageFragment;

public class SpiritualismArticleActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_view);     

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
            case 0: return FirstPageFragment.newInstance("With the exception of Sherlock Holmes perhaps the most significant aspect of Conan Doyle’s later life was his conversion to the cause of spiritualism. He became one of the leading voices of the spiritualist movement after the First World War, when, like many people of his time, he lost close family members as a result of the war. Much of Arthur Conan Doyle’s later life was devoted to a crusade to spread the word of spiritualism across the world, through public speaking, and works such as The Land of Mists (1926) and The History of Spiritualism (1926).He toured the globe speaking about what he saw as the ‘truth’ of séances, mediums, and visitations from the dead.");
            case 1:return SecondPageFragment.newInstance("Conan Doyle's faith in spiritualism was strong, and he cared little whether others agreed with him or not. His friendship with Harry Houdini, the famous escapologist, ended because of their disagreements about spiritualism. Many people ridiculed Conan Doyle’s faith in spiritualism, which seemed to them to contradict the rational, objective science of the Holmes stories. The ridicule increased when he published The Coming of the Fairies, in which he supported the existence of fairies on the basis of the ‘eye-witness’ account of two young girls from Yorkshire. Their tale of ‘The Cottingley Fairies,’ later made into a 1997 film, Fairy Tale: A True Story, confirmed to many the idea that Conan Doyle was losing his grip on reality.Yet Conan Doyle’s importance within the history of spiritualism cannot be overestimated. Just days after his death, a spiritualist meeting at the Royal Albert Hall was organized so that he could make one final appearance from beyond the grave. Thousands attended, including Lady Conan Doyle and several of the Conan Doyle children. A row of chairs was arranged on the stage for the family, with one left empty for Sir Arthur himself. And even when he did not himself appear, there were many people in the audience who claimed they had felt his presence among them.");
            default:return null;          
  }
        }

        @Override
        public int getCount() {
            return 2;
        }       
    }
}