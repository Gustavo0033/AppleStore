package com.example.applestore.FragmentMacbook;

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
 * Use the {@link Fragment_Macbook_airm2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Macbook_airm2 extends Fragment {

    private ArrayList<ListForImage>MacbookAir_M2 = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Macbook_airm2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Macbook_airm2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Macbook_airm2 newInstance(String param1, String param2) {
        Fragment_Macbook_airm2 fragment = new Fragment_Macbook_airm2();
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
        View view = inflater.inflate(R.layout.fragment__macbook_airm2, container, false);

        initRecyclerView(view);
        buildInitialData();
        return view;
    }

    private void buildInitialData() {
        MacbookAir_M2.add(new ListForImage(R.drawable.macbook_air_m2));
        MacbookAir_M2.add(new ListForImage(R.drawable.macbook_air_m2_ph02));
        MacbookAir_M2.add(new ListForImage(R.drawable.macbooks_ph));
    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_macbookAIR_M2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        AdaptersForProducts adapter = new AdaptersForProducts(MacbookAir_M2);
        recyclerView.setAdapter(adapter);

    }
}