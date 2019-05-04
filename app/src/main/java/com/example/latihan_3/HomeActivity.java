package com.example.latihan_3;

/*
 * NIM      : 10116056
 * Nama     : Bagea Junan Muhammad
 * Kelas    : AKB2
 * CHANGELOG
 * Aplikasi V0.1 01/05/2019
 * Selesai 04/05/2019
 */

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {


    Button button;
    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        // fill list screen

        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("WELCOME","Terima Kasih telah Download aplikasi ini",R.drawable.m31));
        mList.add(new ScreenItem("MYSELF APPS","",R.drawable.m31));
        mList.add(new ScreenItem("FINISH","",R.drawable.m31));
        // setup viewpager
        screenPager =findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

        button = (Button) findViewById(R.id.btn_home);
        button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v){
                openMenuActivity();
            }
        });
    }

    public void openMenuActivity(){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }



}
