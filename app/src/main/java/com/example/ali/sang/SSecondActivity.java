package com.example.ali.sang;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ali on 7/15/2017.
 */

public class SSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sfirst_activity);

        List<DataS> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sfirst);
        RecSViewAdapter adapter = new RecSViewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));



    }


    public List<DataS> fill_with_data () {

        List <DataS> datas = new ArrayList<>();

        datas.add(new DataS("مرمریت اباده", "قیمت 40×40 = 40000", R.drawable.marmarit_abade));
        datas.add(new DataS("مرمریت قرمز", "قیمت 40×40 = 55000", R.drawable.marmarit_ghermez));
        datas.add(new DataS("سنگ مرمریت جوشقان", "قیمت 40×40 = 70000", R.drawable.marmarit_j));
        datas.add(new DataS("مرمریت حمزاوه", "قیمت 40×40 = 35000", R.drawable.marmarit_h));
        datas.add(new DataS("مرمریت خوبسنگان", "قیمت 40×40 = 50000", R.drawable.marmarit_kh));
        datas.add(new DataS("مرمریت صلصالی", "قیمت 40×40 = 40000", R.drawable.marmarit_s));
        datas.add(new DataS("مرمریت لاشتر", "قیمت 40×40 = 40000", R.drawable.marmarit_l));
        datas.add(new DataS("مرمریت لاشتر تیشه ای", "قیمت 40×40 = 26000", R.drawable.marmarit_lt));
        datas.add(new DataS("مرمریت مشکی", "قیمت 40×40 = 70000", R.drawable.marmarit_m));
        datas.add(new DataS("مرمریت کرم طلایی", "قیمت 40×40 = 35000", R.drawable.marmarit_keremt));


        return datas;
    }
}