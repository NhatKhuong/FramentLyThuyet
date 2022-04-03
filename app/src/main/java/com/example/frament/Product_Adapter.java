package com.example.frament;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Product_Adapter extends BaseAdapter {
    private int idLayout;
    private Context context;
    private List<Product> products;

    public Product_Adapter(int idLayout, Context context, List<Product> products) {
        this.idLayout = idLayout;
        this.context = context;
        this.products = products;
    }

    @Override
    public int getCount() {
        if(products == null){
            return 0;
        }
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout,viewGroup,false);

        }

        TextView name =view.findViewById(R.id.name);
        TextView des  =view.findViewById(R.id.description);
        ImageView img = view.findViewById(R.id.img);

        name.setText(products.get(i).getName());
        des.setText(products.get(i).getDescription());
        img.setImageResource(products.get(i).getImg());

        return view;
    }
}
