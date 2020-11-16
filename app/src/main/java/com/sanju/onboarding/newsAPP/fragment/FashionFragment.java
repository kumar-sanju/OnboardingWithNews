package com.sanju.onboarding.newsAPP.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;

import android.util.Log;

import com.sanju.onboarding.newsAPP.News;
import com.sanju.onboarding.newsAPP.NewsLoader;
import com.sanju.onboarding.newsAPP.NewsPreferences;
import com.sanju.onboarding.R;

import java.util.List;

/**
 * The FashionFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class FashionFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = FashionFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String fashionUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.fashion));
        Log.e(LOG_TAG, fashionUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), fashionUrl);
    }
}