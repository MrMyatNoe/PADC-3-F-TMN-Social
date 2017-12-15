package com.myanmar.tmn.movies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.movies.R;
import com.myanmar.tmn.movies.viewHolder.ItemDetailsViewHolder;

/**
 * Created by msi on 12/15/2017.
 */

public class ItemsDetailsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItems = inflater.inflate(R.layout.item_details_image,parent,false);
        ItemDetailsViewHolder itemDetailsViewHolder = new ItemDetailsViewHolder(newsItems);
        return itemDetailsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
