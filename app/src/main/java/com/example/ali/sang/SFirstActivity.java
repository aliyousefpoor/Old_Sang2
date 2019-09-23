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

public class SFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sfirst_activity);

        List<DataF> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sfirst);
        RecFViewAdapter adapter = new RecFViewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));



    }


    public List<DataF> fill_with_data () {

        List <DataF> dataf = new ArrayList<>();

        dataf.add(new DataF("تراونتن حاجی اباد", "", R.drawable.travanten_haji));
        dataf.add(new DataF("تراونتن قرمز آذرشهر موجدار", "", R.drawable.travanten_ghermez));
        dataf.add(new DataF("تراونتن عباس اباد", "", R.drawable.travanten_abasabad));
        dataf.add(new DataF("تراونتن عباس اباد", "", R.drawable.travanten_abasabad2));
        dataf.add(new DataF("تراونتن رامشه", "", R.drawable.travanten_ramshe));
        dataf.add(new DataF("تراونتن چرمی بی موج", "", R.drawable.travanten_charmi));
        dataf.add(new DataF("تراونتن رامشه", "", R.drawable.travanten_ramshe2));
        dataf.add(new DataF("تراونتن تیشه ای سفید", "", R.drawable.travanten_tishes));
        dataf.add(new DataF("تراونتن حاجی اباد", "", R.drawable.travanten_haji2));
        dataf.add(new DataF("تراونتن تکاب", "", R.drawable.travanten_taktab));
        dataf.add(new DataF("تراونتن ترشاب چرمی", "", R.drawable.travanten_torshab));
        dataf.add(new DataF("تراونتن کلاسیک چرمی", "", R.drawable.travanten_clasiccharm));
        dataf.add(new DataF("تراونتن مهاباد", "", R.drawable.travanten_mahabad));
        dataf.add(new DataF("تراونتن عباس اباد", "", R.drawable.travanten_abasabad3));
        dataf.add(new DataF("راونتن ابیانه", "", R.drawable.travanten_abiane));
        dataf.add(new DataF("تراونتن رامشه", "", R.drawable.travanten_ramshe3));
        dataf.add(new DataF("تراونتن مهاباد", "", R.drawable.travanten_mahabad2));
        dataf.add(new DataF("تراونتن شکلاتی موج دار", "", R.drawable.travanten_shokolati));
        dataf.add(new DataF("تراونتن عباس اباد", "", R.drawable.travanten_abasabad4));
        dataf.add(new DataF("تراونتن عباس اباد", "", R.drawable.travanten_abasabad5));
        dataf.add(new DataF("تراونتن چرمی موج پیچ", "", R.drawable.travanten_charmib));
        dataf.add(new DataF("تراونتن عباس اباد", "", R.drawable.travanten_abasabad6));
        dataf.add(new DataF("تراونتن حاجی اباد", "", R.drawable.travanten_haji3));
        dataf.add(new DataF("تراونتن شکلاتی بی موج", "", R.drawable.travanten_shokolati2));
        dataf.add(new DataF("تراونتن ترشاب", "", R.drawable.travanten_torshab2));
        dataf.add(new DataF("تراونتن شکلاتی موج دار", "", R.drawable.travanten_shokolatimoji));
        dataf.add(new DataF("تراونتن ابیانه", "", R.drawable.travanten_abiane2));





        return dataf;
    }
}