package com.example.tourgo;


import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;
    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TopSightsFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else if (position == 2) {
            return new ThingstodoFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_topsight);
        } else if (position == 1) {
            return mContext.getString(R.string.category_event);
        } else if (position == 2) {
            return mContext.getString(R.string.category_thingstodo);
        } else {
            return mContext.getString(R.string.category_restaurant);
        }
    }
    }

