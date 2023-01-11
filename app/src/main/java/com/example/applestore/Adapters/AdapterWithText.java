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

public class AdapterWithText extends RecyclerView.Adapter<AdapterWithText.ViewHolderText>{

    ArrayList<MainList> FragmentText;

    public AdapterWithText(ArrayList<MainList> fragmentText) {
        this.FragmentText = fragmentText;
    }

    @NonNull
    @Override
    public ViewHolderText onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.produtos,parent,false);
        return new AdapterWithText.ViewHolderText(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderText holder, int position) {
        holder.imageProduct.setImageResource(FragmentText.get(position).getImageProduct());
        holder.textProduct.setText(FragmentText.get(position).getTextProduct());

    }

    @Override
    public int getItemCount() {
        return FragmentText.size();
    }

    public class ViewHolderText extends RecyclerView.ViewHolder{

        ImageView imageProduct;
        TextView textProduct;

        public ViewHolderText(@NonNull View itemView) {
            super(itemView);

            imageProduct = itemView.findViewById(R.id.imageProduct);
            textProduct = itemView.findViewById(R.id.TextProdut);
        }
    }
}
