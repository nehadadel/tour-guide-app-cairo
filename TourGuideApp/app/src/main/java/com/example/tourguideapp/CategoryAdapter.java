package com.example.tourguideapp;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */


public class CategoryAdapter extends FragmentPagerAdapter {

    

 private Context mcontext;
    //title of fragment page
    private String tabTitles[];

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
     public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mcontext=context;
       tabTitles = new String[]{mcontext.getResources().getString(R.string.string_1),
                    mcontext.getResources().getString(R.string.string_2),
                    mcontext.getResources().getString(R.string.string_3),
                    mcontext.getResources().getString(R.string.string_4)};
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NationalParksFragment();
        } else if (position == 1) {
            return new MosquesFragment();
        } else if (position == 2) {
            return new HistoricalPlacesFragment();
        } else {
            return new MuseumsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}

