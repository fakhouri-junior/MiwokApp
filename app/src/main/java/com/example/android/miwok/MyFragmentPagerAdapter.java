package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableString;

/**
 * Created by salim on 12/10/2016.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] titles = {"Numbers",
    "Colors", "Family", "Phrases"};

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new NumbersFragment();
        }else if(position == 1){
            return new ColorsFragment();
        }else if(position == 2){
            return new FamilyFragment();
        }else{
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        SpannableString sb = new SpannableString(titles[position]);
        return sb;

        /*
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
         */
    }
}
