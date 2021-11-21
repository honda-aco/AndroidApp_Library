package com.ns.aco.sp.common.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class UtilityActivity {

    public static void addFragmentToActivity (FragmentManager fragmentManager,
                                                Fragment fragment,
                                                int frameId) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }

    public static void addFragmentToActivity (FragmentManager fragmentManager,
                                                Fragment fragment,
                                                int frameId,
                                                String stackName) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.addToBackStack(stackName);
        transaction.commit();
    }

    public static void removeFragmentToActivity (FragmentManager fragmentManager,
                                                   Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.remove(fragment);
        transaction.commit();
    }
}
