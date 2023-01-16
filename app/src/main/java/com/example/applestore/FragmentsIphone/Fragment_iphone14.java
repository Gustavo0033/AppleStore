package com.example.applestore.FragmentsIphone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applestore.Adapters.AdaptersForProducts;
import com.example.applestore.List.ListForImage;
import com.example.applestore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_iphone14#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_iphone14 extends Fragment {

    private ArrayList<ListForImage> Fragment_iphone14 = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_iphone14() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_iphone14.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_iphone14 newInstance(String param1, String param2) {
        Fragment_iphone14 fragment = new Fragment_iphone14();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_iphone14, container, false);


        initRecyclerView(view);
        buildInitialData();
        return view;
    }

    private void buildInitialData() {

        Fragment_iphone14.add(new ListForImage(R.drawable.iphone_14));
        Fragment_iphone14.add(new ListForImage(R.drawable.iphone_14));
        Fragment_iphone14.add(new ListForImage(R.drawable.iphone_14));
        Fragment_iphone14.add(new ListForImage(R.drawable.iphone_14));
        Fragment_iphone14.add(new ListForImage(R.drawable.iphone_14));


    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_iphone14);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        AdaptersForProducts adaptersForProducts = new AdaptersForProducts(Fragment_iphone14);
        recyclerView.setAdapter(adaptersForProducts);

    }
}