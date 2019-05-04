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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Email extends AppCompatActivity {

    EditText mRecived, mSubject, mMessage;
    Button mSendEmailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if(bundle.getString("some")!= null){
                Toast.makeText(getApplicationContext(),"data:"+ bundle.getString("some"),
                        Toast.LENGTH_SHORT).show();
            }
        }

        mRecived = findViewById(R.id.email);
        mSubject = findViewById(R.id.subject);
        mMessage = findViewById(R.id.enterhere);
        mSendEmailBtn = findViewById(R.id.sendEmailBtn);

        mSendEmailBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick (View view){

                String  recived = mRecived.getText().toString().trim();
                String subject = mSubject.getText().toString().trim();
                String message = mMessage.getText().toString().trim();

                sendEmail(recived, subject, message);


            }
        });

    }

    private void sendEmail(String recived, String subject, String message) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{recived});

        intent.putExtra(Intent.EXTRA_SUBJECT, subject);

        intent.putExtra(Intent.EXTRA_TEXT, message);

        try {
            startActivity(Intent.createChooser(intent, "Choose an Email Client"));
        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
