package com.example.zhuan.homesweethome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;

    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d){

        items = i;
        prices = p;
        descriptions = d;

        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.list_view, null);
        TextView nameText = v.findViewById(R.id.nameText);
        TextView descriptionText = v.findViewById(R.id.descriptionText);
        TextView priceText = v.findViewById(R.id.priceText);

        String name = items[i];
        String description = descriptions[i];
        String price = prices[i];

        nameText.setText(name);
        descriptionText.setText(description);
        priceText.setText(price);

        return v;
    }
}
