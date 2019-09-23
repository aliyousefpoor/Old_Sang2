package com.example.ali.sang;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;


/**
 * Created by Ali on 7/15/2017.
 */

public class RecTViewAdapter extends RecyclerView.Adapter<View_HolderT> {

    List<DataT> list = Collections.emptyList();
    Context context;

    public RecTViewAdapter(List<DataT> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View_HolderT onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_f_layout, parent, false);
        View_HolderT holder = new View_HolderT(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(View_HolderT holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        holder.description.setText(list.get(position).description);
        Glide.with(context).load(list.get(position).imageId).into( holder.imageView);



    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }


}