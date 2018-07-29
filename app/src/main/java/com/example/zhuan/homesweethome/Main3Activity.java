package com.example.zhuan.homesweethome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;

    List<IndividualFurniture> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lstBook = new ArrayList<>();
        lstBook.add(new IndividualFurniture("The Vegitarian","Categorie Book","Description book",R.drawable.chair1));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        IndividualRecyclerViewAdapter myAdapter = new IndividualRecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,1));
        myrv.setAdapter(myAdapter);

    }
}
