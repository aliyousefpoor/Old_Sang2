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

public class TravantenExplaneActivity extends AppCompatActivity {
    Button travanten1;
    Button mtravanten;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travanten_layout);

        travanten1 = (Button) findViewById(R.id.travanten1);
        mtravanten = (Button) findViewById(R.id.mtravanten);


        travanten1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "نمونه سنگ ها ", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(TravantenExplaneActivity.this, SFirstActivity.class));

            }
        });


        mtravanten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "توضیحات ", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(TravantenExplaneActivity.this, MTravantenActivity.class));

            }
        });
    }

}
