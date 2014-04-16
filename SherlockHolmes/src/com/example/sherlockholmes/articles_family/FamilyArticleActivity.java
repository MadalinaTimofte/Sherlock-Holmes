package com.example.sherlockholmes.articles_family;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.sherlockholmes.R;
import com.example.sherlockholmes.articles_family.FirstPageFragment;
import com.example.sherlockholmes.articles_family.SecondPageFragment;
import com.example.sherlockholmes.articles_family.ThirdPageFragment;

public class FamilyArticleActivity extends FragmentActivity {

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
            case 0:return FirstPageFragment.newInstance("Arthur Ignatius Conan Doyle was born in Edinburgh on the 22 May 1859 to an English father, Charles Altamont Doyle, and an Irish mother, Mary (nee Foley). His father came from a prosperous Catholic family, which also originated from Ireland, many of whom were noted artists and illustrators. Mary was a devoted mother, and fantastic story teller, who filled his childhood with wonderful tales she had invented. Unfortunately Charles suffered from alcoholism and his erratic behaviour meant that there was little money during Arthur’s upbringing.Arthur was the eldest of son of 9 siblings seven of whom survived into adulthood. His sisters became governess’ before marrying well. One of his sisters, Connie, married a friend and fellow author, Ernest Hornung, who created the gentleman thief, Raffles. Arthur’s only brother, Innes, joined him during his time in Portsmouth for part of his schooling before joining the army. He was awarded a DSO before dying in the Spanish flu epidemic of 1919 at the early age of 45.");
            case 1: return SecondPageFragment.newInstance("It was during his time spent in Portsmouth as a doctor that Arthur met and fell in love with a sister of one of his patients, Louise Hawkins (known as Touie). They married at St Oswald’s church, Thornton in Lonsdale, in August 1885. A daughter, Mary, was born in Portsmouth in 1889.In 1890 Arthur left Portsmouth to pursue a practice in Upper Wimpole Street as an eye specialist. It was not successful, however, and it is rumoured that not a single patient called on his services. Fortunately by this time his writing was becoming more profitable and in 1891 he decided to give up medicine to concentrate on writing. His eldest son, Arthur Alleyne Kingsley, was born in 1892.Louise was diagnosed with tuberculosis in 1893 and, although she was only initially given a few months to live, Arthur took great care of her welfare until her death in 1906. He built a substantial new house, Undershaw, at Hindhead in Surrey for the family, as he believed that the air there would be beneficial.");
            case 2: return ThirdPageFragment.newInstance("In 1897 Arthur Conan Doyle. had met a striking younger woman, Jean Leckie, with whom he fell passionately in love. They remained friends for the following decade finally marrying in 1907, a year after Louise’s death. The family moved once more, this time to Windlesham in Crowborough, a house that Arthur and Jean substantially renovated. There were three more children born to this second family, namely, Denis (born 1909), Adrian (born 1910) and Lena Jean (1912) who was known as Billie.Arthur was devastated by the death of his eldest son, known as Kingsley, in 1918. Although badly wounded on the first day of the battle of the Somme, Kingsley was in relatively good health when he was stuck down by the Spanish influenza epidemic.Arthur remained very active throughout the 1920s, particularly promoting his spiritualist beliefs, before suffering from heart disease from which he died on the 7th July 1930. He was buried initially at Windlesham before being moved to Minstead in the New Forest to lie with his second wife, Jean. She died in 1940.His children continued his spiritualist interests after his death. His eldest daughter Mary continued to run the Psychic bookshop in London. She remained unmarried until her death in 1976. Denis and Adrian continued to give talks, promote spiritualism and to run the Conan Doyle estate. Denis married Nina M’divani, a Georgian princess, and travelled to world. He died relatively young while visiting India in 1955. Adrian married Anna Anderson and they settled first in Tangiers before opening the Conan Doyle Foundation in Switzerland. He continued to run the estate until his death in 1970. The youngest daughter, Lena Jean, after a long career, became the Director of the Women’s Royal Air Force, (hence acquiring the title ‘Dame’), in 1963. She married, late in life, Geoffrey Bromet, who was 20 years her senior. She died in 1997 at the age of 85.  None of Arthur’s children had offspring so he left no direct descendants.");
            default:return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }       
    }
}