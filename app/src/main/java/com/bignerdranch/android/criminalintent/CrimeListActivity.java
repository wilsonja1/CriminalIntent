package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by battl on 10/21/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
