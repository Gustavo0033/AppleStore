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

import java.util.ArrayList;

public class MyAdapterPhones extends RecyclerView.Adapter<MyAdapterPhones.MyViewHolderPhones>{

    ArrayList<MainList> PhonesArrayList;

    public MyAdapterPhones(ArrayList<MainList> phonesArrayList) {
        PhonesArrayList = phonesArrayList;
    }

    @NonNull
    @Override
    public MyViewHolderPhones onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.produtos,parent,false);
        return new MyViewHolderPhones(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderPhones holder, int position) {

        holder.imageProduct.setImageResource(PhonesArrayList.get(position).getImageProduct());
        holder.textProduct.setText(PhonesArrayList.get(position).getTextProduct());
    }

    @Override
    public int getItemCount() {
        return PhonesArrayList.size();
    }

    public static class MyViewHolderPhones extends RecyclerView.ViewHolder{

        TextView textProduct;
        ImageView imageProduct;

        public MyViewHolderPhones(@NonNull View itemView) {
            super(itemView);

            textProduct = itemView.findViewById(R.id.TextProdut);
            imageProduct = itemView.findViewById(R.id.imageProduct);
        }
    }
}
