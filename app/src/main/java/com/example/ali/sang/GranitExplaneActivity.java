package com.example.ali.sang;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Ali on 7/21/2017.
 */

public class GranitExplaneActivity extends AppCompatActivity {
    Button granit1;
    Button mgranit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.granit_layout);

        granit1 = (Button) findViewById(R.id.granit1);
        mgranit = (Button) findViewById(R.id.mgranit);


        granit1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "نمونه سنگ ها ", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(GranitExplaneActivity.this, SThirdActivity.class));

            }
        });

        mgranit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "توضیحات ", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(GranitExplaneActivity.this, MGranitActivity.class));

            }
        });
    }

}
