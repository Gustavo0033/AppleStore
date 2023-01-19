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
 * Use the {@link Fragment_MacbookPro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_MacbookPro extends Fragment {

    private ArrayList<ListForImage> MacbookPro14Pol = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_MacbookPro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_MacbookPro.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_MacbookPro newInstance(String param1, String param2) {
        Fragment_MacbookPro fragment = new Fragment_MacbookPro();
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
        View view = inflater.inflate(R.layout.fragment__macbook_pro, container, false);

        buildInitialData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_macbookPro14Pol);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        AdaptersForProducts adapter = new AdaptersForProducts(MacbookPro14Pol);
        recyclerView.setAdapter(adapter);

    }

    private void buildInitialData() {

        MacbookPro14Pol.add(new ListForImage(R.drawable._4pol_macbook_pro));
        MacbookPro14Pol.add(new ListForImage(R.drawable._4pol_macbook_pro02));
        MacbookPro14Pol.add(new ListForImage(R.drawable._4pol_macbook_pro03));


    }
}