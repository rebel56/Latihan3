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
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private int wkt=2000;

    //2000= 2 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    //setelah loading maka akan pindah ke HomeActivity

                    Intent home = new Intent(MainActivity.this, HomeActivity.class);

                    startActivity(home);
                    finish();
                }
            },wkt);
    }

}
