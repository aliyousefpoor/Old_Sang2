package com.example.ali.sang;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Ali on 7/21/2017.
 */

public class SangActivity extends AppCompatActivity {

    Button travanten;
    Button marmarit;
    Button granit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sang_activity);

        travanten = (Button) findViewById(R.id.travanten);
        marmarit = (Button) findViewById(R.id.marmarit);
        granit = (Button)findViewById(R.id.granit);

        Animation anim_m_right = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
        Animation anim_m_left = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);

        travanten.startAnimation(anim_m_right);
        marmarit.startAnimation(anim_m_left);
        granit.startAnimation(anim_m_right);

        travanten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(),
                        "تراورتن را انتخاب کردید .", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(SangActivity.this, TravantenExplaneActivity.class));


            }
        });

        marmarit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "مرمریت را انتخاب کردید .", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(SangActivity.this, MarmaritExplaneActivity.class));


            }
        });

        granit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "گرانیت را انتخاب کردید .", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(SangActivity.this, GranitExplaneActivity.class));

            }
        });

    }
}