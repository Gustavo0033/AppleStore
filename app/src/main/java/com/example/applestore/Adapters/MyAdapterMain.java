package com.example.applestore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applestore.List.ListForImage;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

public class MyAdapterMain extends RecyclerView.Adapter<MyAdapterMain.MyViewHolderMain> {


    ArrayList<MainList> MainArrayListHome;


    public MyAdapterMain(ArrayList<MainList> MainArrayListHome){
        this.MainArrayListHome = MainArrayListHome;

    }

    @NonNull
    @Override
    public MyViewHolderMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.produtos,parent,false);
        return new MyViewHolderMain(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderMain holder, int position) {

      holder.imageProduct.setImageResource(MainArrayListHome.get(position).getImageProduct());
      holder.TextProduct.setText(MainArrayListHome.get(position).getTextProduct());





    }

    @Override
    public int getItemCount() {
        return MainArrayListHome.size();
    }

    public static class MyViewHolderMain extends RecyclerView.ViewHolder{

        ImageView imageProduct;
        TextView TextProduct;


        public MyViewHolderMain(@NonNull View itemView) {
            super(itemView);


            imageProduct = itemView.findViewById(R.id.imageProduct);
            TextProduct = itemView.findViewById(R.id.TextProdut);

        }
    }
}
