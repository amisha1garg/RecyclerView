package com.ford.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;

    private ArrayList<Menu> menuArrayList;

    public MyAdapter() {
        this.menuArrayList = new ArrayList<Menu>();
    }

    public MyAdapter(Context ct, ArrayList<Menu> menuArrayList) {
        context = ct;
        this.menuArrayList = menuArrayList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.nameText.setText(menuArrayList.get(position).getName());
        holder.priceText.setText(menuArrayList.get(position).getPrice());
        holder.imageView.setImageResource(menuArrayList.get(position).getImageIcon());

    }

    @Override
    public int getItemCount() {
        return menuArrayList.size();
    }

    public void updateMenu(final ArrayList<Menu> menuArrayList) {
        this.menuArrayList.clear();
        this.menuArrayList =  menuArrayList;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameText;
        TextView priceText;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.food_item);
            priceText = itemView.findViewById(R.id.price);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
