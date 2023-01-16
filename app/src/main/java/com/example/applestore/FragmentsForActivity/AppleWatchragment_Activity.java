package com.example.applestore.FragmentsForActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applestore.Adapters.MyAdapterAW;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AppleWatchragment_Activity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AppleWatchragment_Activity extends Fragment {

    private ArrayList<MainList> AppleWatchArrayList = new java.util.ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AppleWatchragment_Activity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AppleWatchragment_Activity.
     */
    // TODO: Rename and change types and number of parameters
    public static AppleWatchragment_Activity newInstance(String param1, String param2) {
        AppleWatchragment_Activity fragment = new AppleWatchragment_Activity();
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
        View view = inflater.inflate(R.layout.fragment_apple_watchragment__activity, container, false);

        buildListData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewAppleWatch);
        GridLayoutManager Grid = new GridLayoutManager(getActivity(),2 );

        recyclerView.setLayoutManager(Grid);
        MyAdapterAW adapter = new MyAdapterAW(AppleWatchArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void buildListData() {
        AppleWatchArrayList.add(new MainList("Apple Watch Ultra",R.drawable.applewatch_ultra));
        AppleWatchArrayList.add(new MainList("Apple Watch Series 8",R.drawable.applewatch_series8));
        AppleWatchArrayList.add(new MainList("Apple Watch SE",R.drawable.applewatchse));
        AppleWatchArrayList.add(new MainList("Apple Watch Series 7",R.drawable.applewatch_series7));
        AppleWatchArrayList.add(new MainList("Apple Watch Series 6",R.drawable.applewatch6));
        AppleWatchArrayList.add(new MainList("Apple Watch Series 5",R.drawable.applewatch5));
        AppleWatchArrayList.add(new MainList("Apple Watch Series 3",R.drawable.applewatch3));
        AppleWatchArrayList.add(new MainList("Apple Watch Nike+",R.drawable.applewatchnike));



    }
}