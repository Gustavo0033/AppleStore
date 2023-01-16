package com.example.applestore.FragmentsForActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applestore.Adapters.MyAdapterPhones;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PhonesFragment_Activity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PhonesFragment_Activity extends Fragment {

    private ArrayList<MainList> PhonesArrayList = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;

    public PhonesFragment_Activity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment PhonesFragment_Activity.
     */
    // TODO: Rename and change types and number of parameters
    public static PhonesFragment_Activity newInstance(String param1) {
        PhonesFragment_Activity fragment = new PhonesFragment_Activity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phones__activity, container, false);




        buildListData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewiPhones);
        GridLayoutManager GridLayoutManager = new GridLayoutManager(getActivity(), 2);

        recyclerView.setLayoutManager(GridLayoutManager);
        MyAdapterPhones adapter = new MyAdapterPhones(PhonesArrayList);
        recyclerView.setAdapter(adapter);

    }

    private void buildListData() {
        PhonesArrayList.add(new MainList("iPhone 14 Plus",R.drawable.iphone_14plus));
        PhonesArrayList.add(new MainList("iPhone 14",R.drawable.iphone_14));
        PhonesArrayList.add(new MainList("iPhone 14 PRO",R.drawable.iphone_14_pro));
        PhonesArrayList.add(new MainList("iPhone 14 PRO MAX",R.drawable.iphone_14_promax));
        PhonesArrayList.add(new MainList("iPhone 13 Mini",R.drawable.iphone13_mini));
        PhonesArrayList.add(new MainList("iPhone 13",R.drawable.iphone_13));
        PhonesArrayList.add(new MainList("iPhone 13 Pro",R.drawable.iphone13_pro));
        PhonesArrayList.add(new MainList("iPhone 13 Pro Max",R.drawable.iphone13_promax));
        PhonesArrayList.add(new MainList("iPhone 12 Mini",R.drawable.iphone12_mini));
        PhonesArrayList.add(new MainList("iPhone 12",R.drawable.iphone12));
        PhonesArrayList.add(new MainList("iPhone 12 Pro",R.drawable.banner_iplace_quick_filter_iphone_12_pro_cat));
        PhonesArrayList.add(new MainList("iPhone 12 Pro Max",R.drawable.iphone12_promax));



    }


}