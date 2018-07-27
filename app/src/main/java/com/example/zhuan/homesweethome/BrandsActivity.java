package com.example.zhuan.homesweethome;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class BrandsActivity extends android.support.v4.app.Fragment {

    List<Furniture> Furn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Furn = new ArrayList<>();

        Furn.add(new Furniture("Ikea", R.drawable.ikea_logo));
        Furn.add(new Furniture("King Koil", R.drawable.kingkoil_logo));
        Furn.add(new Furniture("Scan Teak", R.drawable.scanteak_logo));
        Furn.add(new Furniture("Naiise", R.drawable.naiise_logo));
        Furn.add(new Furniture("Tempur", R.drawable.tempur_logo));

        View view = inflater.inflate(R.layout.fragment_brands, null);

        RecyclerView rv = view.findViewById(R.id.recycler_view2);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getActivity(), Furn);

        GridLayout mainGrid;
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        //mainGrid = rv.layout;

        rv.setAdapter(myAdapter);

        return view;
    }
}
