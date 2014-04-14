package com.example.sherlockholmes.articles_rlg;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.sherlockholmes.R;

public class RLGArticleActivity extends FragmentActivity {

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

            case 0: return FirstPageFragment.newInstance("Richard Lancelyn Green was born in Bebington, Cheshire to Roger and June Lancelyn Green. His father was renowned as an author for his popular adaptations of traditional myths and legends while his mother was well known in dramatic circles. He attended Bradfield College in Berkshire and then University College, Oxford where he earned a degree in English.Richard devoted his life to the study of Sherlock Holmes and Sir Arthur Conan Doyle. He was recognised world-wide as one of the leading experts in this field. Over four decades he had amassed the most wide-ranging collection of Conan Doyle and Holmes material anywhere in the world, buying up first editions of books, related letters, film and television memorabilia, merchandising and paraphernalia, in addition to recreating the 221b Baker Street study in his attic.Throughout his life, Richard Lancelyn Green was also a prolific writer on Holmes and Conan Doyle, producing over two hundred separate publications.");
            case 1: return SecondPageFragment.newInstance("These included the definitive Conan Doyle bibliography, as well as the Letters to Sherlock Holmes, made up of correspondences from readers all over the world sent to Holmes, c/o 221 b Baker Street. This address, unbeknown to those who wrote the letters, was for many years the headquarters of the Abbey National Building Society in London. Other works included Uncollected Stories, Essays on Photography and Letters to the Press which were co-edited with another expert John Gibson. Lancelyn Green also published other books on his own such as The Uncollected Sherlock Holmes and The Further Adventures of Sherlock Holmes, which is a selected collection of pastiches and parodies on the Sherlock Holmes stories.Richard was an active member of many of the groups associated with Sherlock Holmes and Conan Doyle. He was Chairman of the Sherlock Holmes Society of London for the period 1996-1999 and was well respected and liked for his good sense of humour and generosity to other scholars with his collection and his encyclopaedic knowledge.Richard Lancelyn Green was born in 1954.");
            case 2: return ThirdPageFragment.newInstance("He died unexpectedly in 2004 at the early age of 50. During his life he had acquired both an encyclopaedic knowledge of, and an extraordinarily wide ranging collection pertaining to Sherlock Holmes, and Sir Arthur Conan Doyle.Richard decided to bequeath his collection to Portsmouth after visiting the city’s Central Library as part of his research into Conan Doyle. He was so impressed by how knowledgeable and helpful the staff were he made his mind up that Portsmouth should eventually become home to his life’s work.");
            case 3: return FourthPageFragment.newInstance("Portsmouth also forms a fitting place for this extraordinary collection through the formulative years that Conan Doyle spent in the city. During the period 1882 – 1890 he not only started a small a doctor’s practice but also wrote the first two Sherlock Holmes stories. He met his first wife while living here and participated widely in the life of the town through a wide range of activities. There were as diverse as being a regular contributor to the Portsmouth Literary and Scientific Society as well as being goal keeper for the local football team.Richard’s friends and acquaintances describe him as being a generous man, always willing to help out others who shared his passion for Holmes and Conan Doyle. By insisting, as a condition of his bequest, that his collection remains available to the general public as well as to scholars and aficionados, Richard illustrated this generosity all over again.");
            default: return null;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }       
    }
}