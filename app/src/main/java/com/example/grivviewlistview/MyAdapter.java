package com.example.grivviewlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<TechItem> techItemsList;
    private LayoutInflater inflater;
    public MyAdapter(Context context, List<TechItem> techItemsList) {
        this.context = context;
        this.techItemsList = techItemsList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return techItemsList.size();
    }

    @Override
    public TechItem getItem(int position) {
        return techItemsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item,null);
        TechItem currentItem = getItem(position);

        String itemImg = currentItem.getImg();
        String itemName = currentItem.getName();
        String itemDesc = currentItem.getDesc();

        TextView itemNameView =convertView.findViewById(R.id.name);
        itemNameView.setText(itemName);
        TextView itemDescView =convertView.findViewById(R.id.desc);
        itemDescView.setText(itemDesc);
        ImageView itemImgView =convertView.findViewById(R.id.image);
        @SuppressLint("DiscouragedApi") int resId=context.getResources().getIdentifier(itemImg,"drawable",context.getPackageName());
        itemImgView.setImageResource(resId);



        return convertView;
    }
}
