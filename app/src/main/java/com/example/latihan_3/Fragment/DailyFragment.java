package com.example.latihan_3.Fragment;

/*
 * NIM      : 10116056
 * Nama     : Bagea Junan Muhammad
 * Kelas    : AKB2
 * CHANGELOG
 * Aplikasi V0.1 01/05/2019
 * Selesai 04/05/2019
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihan_3.AdapterRecycleView.RecyclerViewAdapter;
import com.example.latihan_3.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DailyFragment extends Fragment {



    View v;
    private RecyclerView myrecycleview;
    private List<Contact> name;

    public static DailyFragment newInstance(){return  new DailyFragment(); }

    public DailyFragment() {

        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        myrecycleview = (RecyclerView) view.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),name);
        myrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycleview.setAdapter(recyclerAdapter);




    return view;


    }



    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        name = new ArrayList<>();
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));
        name.add(new Contact("Budi","Saya Sedang berada di pantai",R.drawable.profile));
        name.add(new Contact("Sarah","Saya Sedang bernyanyi di cafe tadi malam",R.drawable.m31));


    }



}



