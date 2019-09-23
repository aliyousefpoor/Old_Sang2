package com.example.ali.sang;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Ali on 7/19/2017.
 */

public class View_HolderT extends RecyclerView.ViewHolder{

    CardView cv;
    TextView title;
    TextView description;
    ImageView imageView;

    View_HolderT(View itemView) {
        super(itemView);

        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}