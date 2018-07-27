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

        Furn.add(new Furniture("Armchair", R.drawable.armchair));
        Furn.add(new Furniture("Bookshelf", R.drawable.bookshelf));
        Furn.add(new Furniture("Chair", R.drawable.chair));
        Furn.add(new Furniture("Sofa", R.drawable.sofa));
        Furn.add(new Furniture("Desk", R.drawable.desk));
        Furn.add(new Furniture("Dining Table", R.drawable.table));
        Furn.add(new Furniture("Refrigerator", R.drawable.fridge));
        Furn.add(new Furniture("Washing Machine", R.drawable.washing_machine));
        Furn.add(new Furniture("Double Bed", R.drawable.bed));

        View view = inflater.inflate(R.layout.fragment_brands, null);

        RecyclerView rv = view.findViewById(R.id.recycler_view);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getActivity(), Furn);

        GridLayout mainGrid;
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        //mainGrid = rv.layout;

        rv.setAdapter(myAdapter);

        return view;
    }
}
