package com.example.ali.sang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ali on 7/15/2017.
 */

public class SThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sfirst_activity);

        List<DataT> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sfirst);
        RecTViewAdapter adapter = new RecTViewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));



    }


    public List<DataT> fill_with_data () {

        List <DataT> datat = new ArrayList<>();

        datat.add(new DataT("گرانیت مشکی نطنز", "قیمت 40×40= 65000", R.drawable.granit_meshkinatanz));
        datat.add(new DataT("گرانیت خرمدره طلایی", "قیمت 40×40= 33000", R.drawable.granit_khoramdaret));
        datat.add(new DataT("گرانیت مروارید", "قیمت40×40=17000", R.drawable.granit_morvarid));
        datat.add(new DataT(" گرانیت قرمز نطنز", "قیمت 40×40= 75000", R.drawable.granit_ghermeznatanz));
        datat.add(new DataT("گرانیت قرمز گوجه ای ", "قیمت40×40= 105000", R.drawable.granit_ghermezgoje));
        datat.add(new DataT(" گرانیت سفید تکاب", "قیمت 40×40= 35000", R.drawable.granit_sefidt));
        datat.add(new DataT(" گرانیت خرمدره صدری", "قیمت 40×40= 30000", R.drawable.granit_khoramdaresadri));
        datat.add(new DataT(" گرانیت خرمدره", "قیمت 40×40= 30000", R.drawable.granitkhoramdare));
        datat.add(new DataT("گرانیت نهبندان پرتغالی ", "قیمت 40×40= 55000", R.drawable.granit_np));
        datat.add(new DataT("گرانیت مشکی نطنز ", "قیمت 40×40= 75000", R.drawable.granit_meshkinatanz2));
        datat.add(new DataT("گرانیت قرمز نهبندان ", "قیمت 40×40= 95000", R.drawable.granit_ghermeznahbandan));



        return datat;
    }
}