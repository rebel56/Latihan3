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
import android.net.Uri;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.example.latihan_3.Fragment.DailyFragment;
import com.example.latihan_3.Fragment.GalleryFragment;
import com.example.latihan_3.Fragment.HomeFragment;
import com.example.latihan_3.Fragment.MusicFragment;
import com.example.latihan_3.Fragment.ProfilePragment;


public class MenuActivity extends AppCompatActivity {


    private BottomNavigationView btm_nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        init();

        cambiarFragment(HomeFragment.newInstance());



        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                switch (menuItem.getItemId()) {
                    case R.id.homes:
                        cambiarFragment(HomeFragment.newInstance());
                        return true;
                    case R.id.profile:
                        cambiarFragment(ProfilePragment.newIstance());
                        return true;
                    case R.id.gallery:
                        cambiarFragment(GalleryFragment.newInstance());
                        return  true;
                    case R.id.daily:
                        cambiarFragment(DailyFragment.newInstance());
                        return  true;
                    case R.id.music:
                        cambiarFragment(MusicFragment.newInstance());
                        return  true;
                }



                return false;

            }



        });



    }



    public void openFB(View view){
        Intent openFBapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/shet.california"));
        startActivity(openFBapp);
    }

    public void openIG(View view){
        Intent openIGapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/junan.m/"));
        startActivity(openIGapp);
    }





    private void init() {
        this.btm_nav = findViewById(R.id.btm_nav);


    }



    private void cambiarFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, fragment);
        transaction.commit();



    }





}
