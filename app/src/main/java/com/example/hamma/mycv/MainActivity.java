package com.example.hamma.mycv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button mBtLaunchActivity;
    private Button mBtLaunchActivity1;
    private Button mBtLaunchActivity2;
    private Button mBtLaunchActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtLaunchActivity = (Button) findViewById(R.id.bt_launch_activity);
        mBtLaunchActivity1 = (Button) findViewById(R.id.button);
        mBtLaunchActivity2 = (Button) findViewById(R.id.button2);
        mBtLaunchActivity3 = (Button) findViewById(R.id.button3);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();

            }
        });

        mBtLaunchActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity1();

            }
        });

        mBtLaunchActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity2();

            }
        });


        mBtLaunchActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity3();

            }
        });


    }

    private void launchActivity() {

        Intent intent = new Intent(this, ObjectiveActivity.class);
        startActivity(intent);
    }
    private void launchActivity1() {

        Intent intent = new Intent(this, EduucationActivity.class);
        startActivity(intent);
    }
    private void launchActivity2() {

        Intent intent = new Intent(this, TechnologicalSkillsActivity.class);
        startActivity(intent);
    }
    private void launchActivity3() {

        Intent intent = new Intent(this, HobbiesActivity.class);
        startActivity(intent);
    }



}
