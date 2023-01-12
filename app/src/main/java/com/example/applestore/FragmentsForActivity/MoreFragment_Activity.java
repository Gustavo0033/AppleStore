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
import com.example.applestore.Adapters.MyAdapterMore;
import com.example.applestore.List.MainList;
import com.example.applestore.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MoreFragment_Activity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MoreFragment_Activity extends Fragment {
    private ArrayList<MainList> MoreArrayList = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MoreFragment_Activity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MoreFragment_Activity.
     */
    // TODO: Rename and change types and number of parameters
    public static MoreFragment_Activity newInstance(String param1, String param2) {
        MoreFragment_Activity fragment = new MoreFragment_Activity();
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

        View view = inflater.inflate(R.layout.fragment_more__activity, container, false);

        buildListData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewMore);
        LinearLayoutManager LinearLayout = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(LinearLayout);
        MyAdapterMore adapter = new MyAdapterMore(MoreArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void buildListData() {
        MoreArrayList.add(new MainList("Airpods",R.drawable.airpods_home));
        MoreArrayList.add(new MainList("iPad",R.drawable.ipads_home));
        MoreArrayList.add(new MainList("iMac",R.drawable.imaac));
        MoreArrayList.add(new MainList("Mac Studio",R.drawable.macstudio));
        MoreArrayList.add(new MainList("Mac Mini",R.drawable.macmini));
        MoreArrayList.add(new MainList("Studio Display",R.drawable.studiodisplay));
        MoreArrayList.add(new MainList("Acessórios",R.drawable.acessorios));


    }
}