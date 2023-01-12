package com.example.applestore.FragmentsMore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applestore.Adapters.AdapterWithText;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentIMAC#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentIMAC extends Fragment {

    private ArrayList<MainList>FragmentImac = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentIMAC() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentIMAC.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentIMAC newInstance(String param1, String param2) {
        FragmentIMAC fragment = new FragmentIMAC();
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
        View view = inflater.inflate(R.layout.fragment_i_m_a_c2, container, false);

        initRecyclerView(view);
        buildInitialData();
        return view;
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.FragmentIMAC);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(linearLayoutManager);
        AdapterWithText adapter = new AdapterWithText(FragmentImac);
        recyclerView.setAdapter(adapter);
    }

    private void buildInitialData() {

        FragmentImac.add(new MainList("iMac 2021 24 Polegadas", R.drawable.imac_24pol_m1));
        FragmentImac.add(new MainList("iMac 2021 24 Polegadas", R.drawable.imac_24pol_m1_segundo));
        FragmentImac.add(new MainList("iMac 2020 27 Polegadas", R.drawable.imac_2020));
        FragmentImac.add(new MainList("iMac 2019 27 Polegadas", R.drawable.imac_2019_27pol));
        FragmentImac.add(new MainList("iMac 2019 21,5 Polegadas", R.drawable.imac_2019_21_5pol));
        FragmentImac.add(new MainList("iMac Pro 2017", R.drawable.mac_pro_2017));
        FragmentImac.add(new MainList("iMac 2017 27 Polegadas", R.drawable.imac_2017));
        FragmentImac.add(new MainList("iMac 2017 21,5 Polegadas", R.drawable.imac_2017_21_5));
        FragmentImac.add(new MainList("iMac 2015 27 Polegadas", R.drawable.imac_2015_27pol));
        FragmentImac.add(new MainList("iMac 2015 21,5 Polegadas", R.drawable.imac_2015_21_5));


    }
    }



