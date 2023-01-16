package com.example.applestore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applestore.FragmentsIphone.Fragment_iphone14;
import com.example.applestore.FragmentsIphone.fragment_iphone14Pro;
import com.example.applestore.FragmentsIphone.fragmente_iphone14plus;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

public class MyAdapterPhones extends RecyclerView.Adapter<MyAdapterPhones.MyViewHolderPhones>{

     private ArrayList<MainList> PhonesArrayList;


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


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position ==0) {  //FAZER PARA O IPHONE 14 AGORA
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                fragmente_iphone14plus fragmenteiphone14plus = new fragmente_iphone14plus();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, fragmenteiphone14plus).addToBackStack(null).commit();
            }
                else if(position==1){ // iphone 14
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment_iphone14 fragment_iphone14 = new Fragment_iphone14();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, fragment_iphone14).addToBackStack(null).commit();
                }
                else if(position ==2){ //iphone14_pro
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    fragment_iphone14Pro fragment_iphone14 = new fragment_iphone14Pro();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec, fragment_iphone14).addToBackStack(null).commit();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return PhonesArrayList.size();
    }

    public static class MyViewHolderPhones extends RecyclerView.ViewHolder{

        TextView textProduct;
        ImageView imageProduct;
        View Colorback;


        public MyViewHolderPhones(@NonNull View itemView) {
            super(itemView);

            textProduct = itemView.findViewById(R.id.TextProdut);
            imageProduct = itemView.findViewById(R.id.imageProduct);


        }
    }


}
