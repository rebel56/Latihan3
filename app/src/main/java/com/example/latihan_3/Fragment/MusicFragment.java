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
public class MusicFragment extends Fragment {

    View v;
    private RecyclerView myrecycleview;
    private List<Contact> name1;

    public static MusicFragment newInstance() {
        return new MusicFragment();
    }

    public MusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        myrecycleview = (RecyclerView) view.findViewById(R.id.contact_recyclerview1);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), name1);
        myrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycleview.setAdapter(recyclerAdapter);
        return view;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        name1 = new ArrayList<>();
        name1.add(new Contact("Fur", "fur if you know that i'm lonely", R.drawable.download));
        name1.add(new Contact("Fur", "fur if you know that i'm lonely", R.drawable.download));
        name1.add(new Contact("Fur", "fur if you know that i'm lonely", R.drawable.download));
        name1.add(new Contact("Fur", "fur if you know that i'm lonely", R.drawable.download));
        name1.add(new Contact("Fur", "fur if you know that i'm lonely", R.drawable.download));
        name1.add(new Contact("Fur", "fur if you know that i'm lonely", R.drawable.download));
    }
}
