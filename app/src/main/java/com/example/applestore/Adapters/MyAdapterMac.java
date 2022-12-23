package com.example.applestore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyAdapterMac extends RecyclerView.Adapter<MyAdapterMac.MyViewHolderMac>{

    ArrayList<MainList> MacArrayList;


    public MyAdapterMac(ArrayList<MainList> MacArrayList) {
        this.MacArrayList = MacArrayList;
    }

    @NonNull
    @Override
    public MyViewHolderMac onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.produtos,parent,false);
        return new MyAdapterMac.MyViewHolderMac(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderMac holder, int position) {

        holder.imageProduct.setImageResource(MacArrayList.get(position).getImageProduct());
        holder.TextProduct.setText(MacArrayList.get(position).getTextProduct());
    }

    @Override
    public int getItemCount() {
        return MacArrayList.size();
    }

    public static class MyViewHolderMac extends RecyclerView.ViewHolder{

        ImageView imageProduct;
        TextView TextProduct;

        public MyViewHolderMac(@NonNull View itemView) {
            super(itemView);


            imageProduct = itemView.findViewById(R.id.imageProduct);
            TextProduct = itemView.findViewById(R.id.TextProdut);
        }
    }
}
