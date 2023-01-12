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
 * Use the {@link MacStudio#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MacStudio extends Fragment {

    private ArrayList<MainList>FragmentMacStudio = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MacStudio() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentMacStudio.
     */
    // TODO: Rename and change types and number of parameters
    public static MacStudio newInstance(String param1, String param2) {
        MacStudio fragment = new MacStudio();
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
        View view = inflater.inflate(R.layout.fragment_mac_studio, container, false);

        initRecyclerView(view);
        buildInitalData();
        return view;
    }

    private void buildInitalData() {

        FragmentMacStudio.add(new MainList("Mac Studio M1 Max", R.drawable.macstudio));
        FragmentMacStudio.add(new MainList("Mac Studio M1 Ultra", R.drawable.macstudio));
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.FragmentMacStudio);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);


        AdapterWithText adapter = new AdapterWithText(FragmentMacStudio);
        recyclerView.setAdapter(adapter);

    }
}