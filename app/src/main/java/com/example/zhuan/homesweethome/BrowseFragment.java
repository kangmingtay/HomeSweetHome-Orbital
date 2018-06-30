package com.example.zhuan.homesweethome;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class BrowseFragment extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_browse, null);
        ListView category = view.findViewById(R.id.browseListView);
        String[] items;
        String[] prices;
        String[] descriptions;

        Resources res = getResources();

        items = res.getStringArray(R.array.items);
        prices = res.getStringArray(R.array.prices);
        descriptions = res.getStringArray(R.array.descriptions);

        ItemAdapter custom = new ItemAdapter(getContext(), items, prices, descriptions);

        //String[] menu = {items[1], prices[1], descriptions[1]};

        /*
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_view,
                menu
        );
        */

        category.setAdapter(custom);
        category.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Intent startIntent = new Intent(getActivity().getApplicationContext(), HelloSceneformActivity.class);
                startActivity(startIntent);
            }
        });
        return view;
    }
}
