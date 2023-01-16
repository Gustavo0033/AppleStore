package com.example.applestore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applestore.FragmentAppleWatch.FragmentAppleWatchUltra;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

public class MyAdapterAW extends RecyclerView.Adapter<MyAdapterAW.MyViewHolderAW> {

    ArrayList<MainList> AppleWatchArrayList;

    public MyAdapterAW(ArrayList<MainList> appleWatchArrayList) {
        AppleWatchArrayList = appleWatchArrayList;
    }

    @NonNull
    @Override
    public MyViewHolderAW onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.produtos,parent,false);
        return new MyViewHolderAW(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderAW holder, int position) {
        holder.imageProduct.setImageResource(AppleWatchArrayList.get(position).getImageProduct());
        holder.TextProduct.setText(AppleWatchArrayList.get(position).getTextProduct());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position==0){
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    FragmentAppleWatchUltra fragmentAppleWatchUltra  = new FragmentAppleWatchUltra();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.applewatch_activity, fragmentAppleWatchUltra).addToBackStack(null).commit();

                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return AppleWatchArrayList.size();
    }

    public static class MyViewHolderAW extends RecyclerView.ViewHolder{

        ImageView imageProduct;
        TextView TextProduct;

        public MyViewHolderAW(@NonNull View itemView) {
            super(itemView);

            imageProduct = itemView.findViewById(R.id.imageProduct);
            TextProduct = itemView.findViewById(R.id.TextProdut);
        }
    }
}
