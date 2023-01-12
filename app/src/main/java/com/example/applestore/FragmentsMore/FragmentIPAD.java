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
 * Use the {@link FragmentIPAD#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentIPAD extends Fragment {

    private ArrayList<MainList> FragmentIPAD = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentIPAD() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentIPAD.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentIPAD newInstance(String param1, String param2) {
        FragmentIPAD fragment = new FragmentIPAD();
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
        View view = inflater.inflate(R.layout.fragment_i_p_a_d, container, false);

        initRecyclerView(view);
        buildInitalData();
        return view;
    }

    private void buildInitalData() {


        FragmentIPAD.add(new MainList("iPad Air", R.drawable.ipad_air));
        FragmentIPAD.add(new MainList("iPad Pro", R.drawable.ipad_pro));
        FragmentIPAD.add(new MainList("iPad mini 6", R.drawable.ipad_mini_6));
        FragmentIPAD.add(new MainList("iPad 9", R.drawable.ipad9));
        FragmentIPAD.add(new MainList("iPad 10", R.drawable.ipad10));



    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.fragmentIPAD);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);

        recyclerView.setLayoutManager(gridLayoutManager);
        AdapterWithText adapter = new AdapterWithText(FragmentIPAD);
        recyclerView.setAdapter(adapter);
    }


}