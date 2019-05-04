package com.example.latihan_3.Fragment;

/*
 * NIM      : 10116056
 * Nama     : Bagea Junan Muhammad
 * Kelas    : AKB2
 * CHANGELOG
 * Aplikasi V0.1 01/05/2019
 * Selesai 04/05/2019
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.latihan_3.Email;
import com.example.latihan_3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilePragment extends Fragment {


    public  static  ProfilePragment newIstance(){return new ProfilePragment();}

    public ProfilePragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button btn = (Button) view.findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View view){
            Intent intent = new Intent(getActivity(), Email.class);
            intent.putExtra("Some","some data");
            startActivity(intent);
        }
        });

        return view;



    }



}
