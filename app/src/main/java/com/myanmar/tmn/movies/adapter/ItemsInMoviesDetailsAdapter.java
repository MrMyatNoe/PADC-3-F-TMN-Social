package com.myanmar.tmn.movies.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.viewItems.ItemsInMoviesDetailsViewImage;

/**
 * Created by msi on 12/14/2017.
 */

public class ItemsInMoviesDetailsAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view ==  object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context = container.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ItemsInMoviesDetailsViewImage inflater = (ItemsInMoviesDetailsViewImage) layoutInflater.
                inflate(R.layout.movie_trailer_images,container,false);
        container.addView(inflater);
        return inflater;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
