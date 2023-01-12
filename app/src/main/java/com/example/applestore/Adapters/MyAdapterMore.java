package com.example.applestore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applestore.FragmentsMore.AirPods;
import com.example.applestore.FragmentsMore.MacMini;
import com.example.applestore.FragmentsMore.StudioDisplay;
import com.example.applestore.FragmentsMore.iMac;
import com.example.applestore.FragmentsMore.iPad;
import com.example.applestore.FragmentsMore.MacStudio;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

public class MyAdapterMore extends RecyclerView.Adapter<MyAdapterMore.MyViewHolderMore> {

    private ArrayList<MainList> MoreArrayList;

    public MyAdapterMore(ArrayList<MainList> MoreArrayList) {
        this.MoreArrayList = MoreArrayList;
    }


    @NonNull
    @Override
    public MyViewHolderMore onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_nameproducts,parent,false);
        return new MyAdapterMore.MyViewHolderMore(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderMore holder, int position) {

        holder.imageProduct.setImageResource(MoreArrayList.get(position).getImageProduct());
        holder.TextProduct.setText(MoreArrayList.get(position).getTextProduct());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0){ //CLICK DO AIR PODS
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    AirPods FragmentAirPods  = new AirPods();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec02, FragmentAirPods).addToBackStack(null).commit();
                }
                else if (position ==1){ //CLICK DO IPAD
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    iPad fragmentIPAD  = new iPad();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec02, fragmentIPAD).addToBackStack(null).commit();
                }
                else if (position ==2){ // CLICK DO iMAC
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    iMac fragmentIMAC  = new iMac();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec02, fragmentIMAC).addToBackStack(null).commit();
                }
                else if (position ==3){ // CLICK DO MACSTUDIO
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    MacStudio fragmentMacStudio  = new MacStudio();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec02, fragmentMacStudio).addToBackStack(null).commit();

                }
                else if (position ==4){ // CLICK DO macmini
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    MacMini macMini  = new MacMini();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec02, macMini).addToBackStack(null).commit();

                }
                else if (position ==5){ // CLICK DO macmini
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    StudioDisplay studioDisplay  = new StudioDisplay();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec02, studioDisplay).addToBackStack(null).commit();
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return MoreArrayList.size();
    }

    public class MyViewHolderMore extends RecyclerView.ViewHolder{
        ImageView imageProduct;
        TextView TextProduct;


        public MyViewHolderMore(@NonNull View itemView) {
            super(itemView);

            imageProduct = itemView.findViewById(R.id.ImageHorizontal);
            TextProduct = itemView.findViewById(R.id.Text_Horizontal);
        }
    }
}
