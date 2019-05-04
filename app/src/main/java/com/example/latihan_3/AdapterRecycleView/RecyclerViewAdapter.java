package com.example.latihan_3.AdapterRecycleView;


/*
 * NIM      : 10116056
 * Nama     : Bagea Junan Muhammad
 * Kelas    : AKB2
 * CHANGELOG
 * Aplikasi V0.1 01/05/2019
 * Selesai 04/05/2019
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.latihan_3.Fragment.Contact;
import com.example.latihan_3.R;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> mData;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return  vHolder;


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;
        public  MyViewHolder (View itemView){
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.name1);
            tv_phone = (TextView) itemView.findViewById(R.id.deskripsi1);
            img = (ImageView) itemView.findViewById(R.id.itemImage);

        }

    }


}
