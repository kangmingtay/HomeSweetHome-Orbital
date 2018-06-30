package com.example.zhuan.homesweethome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class PicAdapter extends PagerAdapter {

    private int image_resource[] ={
            R.drawable.chair1,
            R.drawable.chair2
    };

    private Context ctx;

    private LayoutInflater layoutInflater;

    public PicAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int pos){layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View items = layoutInflater.inflate(R.layout.slider_pictures, container, false);
        ImageView image = items.findViewById(R.id.sliderImage);

        image.setImageResource(image_resource[pos]);

        container.addView(items);

        return items;

    }

    @Override
    public void destroyItem(ViewGroup container, int pos, Object obj){
        container.removeView((LinearLayout)obj);
    }
}
