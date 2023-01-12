package com.example.applestore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applestore.List.ListForImage;
import com.example.applestore.R;

import java.util.ArrayList;

public class AdaptersForProducts extends RecyclerView.Adapter<AdaptersForProducts.ViewHolderAdapters> {

    ArrayList<ListForImage> FragmenteIphone;

    public AdaptersForProducts(ArrayList<ListForImage> FragmenteIphone) {
        this.FragmenteIphone = FragmenteIphone;
    }

    @NonNull
    @Override
    public ViewHolderAdapters onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.produtos02_apenas_imagem,parent,false);
        return new AdaptersForProducts.ViewHolderAdapters(v);
    }

    @Override
    public int getItemCount() {
        return FragmenteIphone.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdapters holder, int position) {

        holder.imageProduct.setImageResource(FragmenteIphone.get(position).getImageProduct());

    }

    public class ViewHolderAdapters extends RecyclerView.ViewHolder{

        ImageView imageProduct;


        public ViewHolderAdapters(@NonNull View itemView) {
            super(itemView);

            imageProduct = itemView.findViewById(R.id.imageJustProduct);

        }
    }
}
