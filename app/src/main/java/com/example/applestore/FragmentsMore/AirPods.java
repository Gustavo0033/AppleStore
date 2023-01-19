package com.example.applestore.FragmentsMore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
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
 * Use the {@link AirPods#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AirPods extends Fragment {

    public ArrayList<MainList> FragmentAirPods = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AirPods() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentAirPods.
     */
    // TODO: Rename and change types and number of parameters
    public static AirPods newInstance(String param1, String param2) {
        AirPods fragment = new AirPods();
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
        View view = inflater.inflate(R.layout.fragment_air_pods, container, false);

        buildListData();
        initRecyclerView(view);
        return view;

    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.fragmentAirPodsssss);
        GridLayoutManager GridLayout = new GridLayoutManager(getActivity(), 2);

        recyclerView.setLayoutManager(GridLayout);
        AdapterWithText adapter = new AdapterWithText(FragmentAirPods);
        recyclerView.setAdapter(adapter);
    }

    private void buildListData() {

        FragmentAirPods.add(new MainList("Airpods 2° Geração",R.drawable.airpods_2geracao_ph));
        FragmentAirPods.add(new MainList("Airpods 3° Geração", R.drawable.airpods_3geracao_ph));
        FragmentAirPods.add(new MainList("Airpods Pro 2° Geração",R.drawable.airpods_pro2geracao));
        FragmentAirPods.add(new MainList("Airpods Max", R.drawable.airpods_max));



    }
}