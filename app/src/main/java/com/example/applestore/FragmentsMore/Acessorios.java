package com.example.applestore.FragmentsMore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
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
 * Use the {@link Acessorios#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Acessorios extends Fragment {

    private ArrayList<MainList> Acessorios = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Acessorios() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Acessorios.
     */
    // TODO: Rename and change types and number of parameters
    public static Acessorios newInstance(String param1, String param2) {
        Acessorios fragment = new Acessorios();
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
        View view = inflater.inflate(R.layout.fragment_acessorios, container, false);

        initRecyclerView(view);
        buildInitialData();
        return view;
    }

    private void buildInitialData() {

        Acessorios.add(new MainList("MagSafe", R.drawable.magsafe));
        Acessorios.add(new MainList("Capas e Proteção", R.drawable.capa_de_iphone));
        Acessorios.add(new MainList("Cerregadores sem fio", R.drawable.carregado_sem_fio));
        Acessorios.add(new MainList("Criatividade", R.drawable.criatividade_apple));
        Acessorios.add(new MainList("AirTag", R.drawable.airtag_icon));

    }

    private void initRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.acessorios);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterWithText adapter = new AdapterWithText(Acessorios);
        recyclerView.setAdapter(adapter);

    }
}