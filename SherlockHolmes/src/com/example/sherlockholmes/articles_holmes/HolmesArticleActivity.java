package com.example.sherlockholmes.articles_holmes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.sherlockholmes.R;
import com.example.sherlockholmes.articles_rlg.FirstPageFragment;
import com.example.sherlockholmes.articles_rlg.SecondPageFragment;
import com.example.sherlockholmes.articles_rlg.ThirdPageFragment;

public class HolmesArticleActivity extends FragmentActivity {

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
            case 0: return FirstPageFragment.newInstance("Detective fiction was a relatively new genre of writing when Sir Arthur Conan Doyle first turned his hand to it. It had emerged through the shortstories of Edgar Allan Poe, notably ‘The Murders in the Rue Morgue,’ ‘The Purloined Letter,’ and ‘The Myster of Marie Roget’ in the 1840s. In the following decades, popular English writers such as Charles Dickens and Wilkie Collins, and continental writers such as Emile Gaboriau, explored detection and detectives within their work.");
            case 1: return SecondPageFragment.newInstance("It was Conan Doyle who firmly established detective fiction as perhaps the most popular genre of all. The first Sherlock Holmes story, A Study in Scarlet, initially appeared in Beeton’s Christmas Annual in 1887. It was later published in volume edition, illustrated by Conan Doyle’s father, the artist Charles Altamount Doyle. The story is about the events following the kidnap, forced marriage, and later death of a young woman in the United States. The young woman’s fiancé, it turns out, decides to take his revenge on the two men whom he sees as responsible for her death, and so tracks them across the world before eventually killing them both");
            case 2: return ThirdPageFragment.newInstance("In solving the mystery, Sherlock Holmes introduced himself to the Victorian readership as an extraordinary English reasoning-machine, a man using the latest forensic techniques and a method of deduction that taken from Conan Doyle’s friend, Joseph Bell. Holmes interprets footprints, shoe prints, carriage-wheel tracks, horseshoe prints, bicycle tracks, and tobacco ash. In later Holmes stories he would also examine cigar butts, typefaces, human remains, gunpowder residue, bullet marks and fingerprints, all as crucial forensic evidence in the solving of cases. His investigations were the Victorian equivalent of the modern CSI series.Conan Doyle. produced The Sign of Four, the second of the two Sherlock Holmes novels written in Portsmouth, at the request of the editor of Lippincott’s Magazine, who he had met at a dinner party in London. Conan Doyle agreed to the request to write a story, as did another member of the dinner party, Oscar Wilde. Wilde’s ‘story’ became the novel The Picture of Dorian Gray.");
           default: return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }       
    }
}