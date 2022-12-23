package com.example.applestore.FragmentsForActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applestore.Adapters.MyAdapterMac;
import com.example.applestore.Adapters.MyAdapterMain;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MacbookFragment_Activity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MacbookFragment_Activity extends Fragment {

    private ArrayList<MainList> MacArrayList = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MacbookFragment_Activity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MacbookFragment_Activity.
     */
    // TODO: Rename and change types and number of parameters
    public static MacbookFragment_Activity newInstance(String param1, String param2) {
        MacbookFragment_Activity fragment = new MacbookFragment_Activity();
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
        View view = inflater.inflate(R.layout.fragment_macbook__activity, container, false);

        buildListData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewMac);
        GridLayoutManager GridLayout = new GridLayoutManager(getActivity(), 2);

        recyclerView.setLayoutManager(GridLayout);
        MyAdapterMac adapter = new MyAdapterMac(MacArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void buildListData() {
        MacArrayList.add(new MainList("Macbook Air M1",R.drawable.macbook_air_m1));
        MacArrayList.add(new MainList("Macbook Air M2",R.drawable.macbook_air_m2));
        MacArrayList.add(new MainList("Macbook Pro M1 PRO 13 polegadas",R.drawable.mac_pro_13pol));
        MacArrayList.add(new MainList("Macbook Air M1 pro 14 polegadas",R.drawable.macpro_14pol));
        MacArrayList.add(new MainList("Macbook Air M1 pro 16 polegadas",R.drawable.macpro_16_pol));

    }
}