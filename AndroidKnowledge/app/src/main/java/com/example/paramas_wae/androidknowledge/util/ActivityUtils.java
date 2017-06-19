package com.example.paramas_wae.androidknowledge.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by paramas_wae on 6/19/2017.
 */

public class ActivityUtils {
    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager , @NonNull Fragment fragment , int frameID){
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameID, fragment);
        transaction.commit();
    }


}
