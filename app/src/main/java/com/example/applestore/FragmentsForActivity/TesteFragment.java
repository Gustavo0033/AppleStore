package com.example.applestore.FragmentsForActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applestore.Adapters.MyAdapterMain;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TesteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TesteFragment extends Fragment {
    private ArrayList<MainList> MainArrayListHome = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TesteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TesteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TesteFragment newInstance(String param1, String param2) {
        TesteFragment fragment = new TesteFragment();
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
        View view = inflater.inflate(R.layout.fragment_teste, container, false);
        buildListData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewWIthImage);
        LinearLayoutManager LinearLayout = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(LinearLayout);
        MyAdapterMain adapter = new MyAdapterMain(MainArrayListHome);
        recyclerView.setAdapter(adapter);
    }

    private void buildListData() {
        MainArrayListHome.add((new MainList("iPhone 14 Grande e grand??o", R.drawable._4iphone_phh)));
        MainArrayListHome.add((new MainList("iphone 14 Pro Pro. E al??m.", R.drawable.iphone14_pro_ph)));
        MainArrayListHome.add((new MainList("Watch Series 8", R.drawable.aw_series8_ph)));
        MainArrayListHome.add((new MainList("iPads", R.drawable.ipads_home_ph)));

    }

}