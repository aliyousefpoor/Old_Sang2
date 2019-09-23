package com.example.ali.sang;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ali on 7/19/2017.
 */

public class View_HolderF extends RecyclerView.ViewHolder{

    CardView cv;
    TextView title;
    TextView description;
    ImageView imageView;

    View_HolderF(View itemView) {
        super(itemView);

        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}