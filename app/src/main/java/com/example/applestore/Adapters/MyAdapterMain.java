package com.example.applestore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applestore.FragmentAppleWatch.FragmentAppleWatch8;
import com.example.applestore.FragmentsIphone.Fragment_iphone14;
import com.example.applestore.FragmentsIphone.fragment_iphone14Pro;
import com.example.applestore.FragmentsMore.iPad;
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


      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (position == 0){ //CLICK DO iphone 14
                  AppCompatActivity activity = (AppCompatActivity) view.getContext();
                  Fragment_iphone14 fragment_iphone14  = new Fragment_iphone14();
                  activity.getSupportFragmentManager().beginTransaction().replace(R.id.testeteste, fragment_iphone14).addToBackStack(null).commit();
              }
              else if(position ==1){ // CLICK NO IPHONE 14 PRO
                  AppCompatActivity activity = (AppCompatActivity) view.getContext();
                  fragment_iphone14Pro fragment_iphone14Pro  = new fragment_iphone14Pro();
                  activity.getSupportFragmentManager().beginTransaction().replace(R.id.testeteste, fragment_iphone14Pro).addToBackStack(null).commit();

              }else if(position ==2){ // CLICK NO applewatch
                  AppCompatActivity activity = (AppCompatActivity) view.getContext();
                  FragmentAppleWatch8 fragmentAppleWatch8  = new FragmentAppleWatch8();
                  activity.getSupportFragmentManager().beginTransaction().replace(R.id.testeteste, fragmentAppleWatch8).addToBackStack(null).commit();

              }else if(position ==3){ // CLICK NO iPad
              AppCompatActivity activity = (AppCompatActivity) view.getContext();
              iPad iPad  = new iPad();
              activity.getSupportFragmentManager().beginTransaction().replace(R.id.testeteste, iPad).addToBackStack(null).commit();
          }


          }
      });





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
