package com.example.ali.sang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Ali on 7/21/2017.
 */

public class MarmaritExplaneActivity extends AppCompatActivity {
    Button marmarit1;
    Button mmarmarit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marmarit_layout);

        marmarit1 = (Button) findViewById(R.id.marmarit1);
        mmarmarit =(Button)findViewById(R.id.mmarmarit) ;


        marmarit1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "نمونه سنگ ها ", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MarmaritExplaneActivity.this, SSecondActivity.class));

            }
        });

        mmarmarit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "توضیحات ", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MarmaritExplaneActivity.this, MMarmaritActivity.class));
            }
        });

    }

}
