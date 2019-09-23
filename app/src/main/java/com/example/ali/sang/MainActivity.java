package com.example.ali.sang;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button moghadame;
    Button sangha;
    Button contact;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sangha = (Button) findViewById(R.id.sangha);
        contact = (Button) findViewById(R.id.contact);
        exit = (Button)findViewById(R.id.exit);
        moghadame =(Button) findViewById(R.id.moghadame);


        moghadame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MoghadameActivity.class));

            }
        });

        sangha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, SangActivity.class));

            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "ارتباط با ما ", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainActivity.this, ContactActivity.class));

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "از برنامه خارج شدید. ", Toast.LENGTH_SHORT).show();

                moveTaskToBack(true);
                Process.killProcess(Process.myPid());
                System.exit(1);
            }

        });
    }


}
