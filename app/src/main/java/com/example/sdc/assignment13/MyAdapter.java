package com.example.sdc.assignment13;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int[] imgId;
    String[] titles;
    String[] desc;
    Context mContext;

    public MyAdapter(MainActivity mainActivity, int[] p1, String[] p2, String[] p3) {
        imgId = p1;
        titles = p2;
        desc = p3;
        mContext = mainActivity;
    }

    @Override
    public int getItemCount() {
        return imgId.length;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_cards,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.img.setImageResource(imgId[position]);
        holder.title_view.setText(titles[position]);
        holder.desc_view.setText(Html.fromHtml(desc[position]));
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title_view;
        TextView desc_view;
        ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            title_view = itemView.findViewById(R.id.text_title);
            desc_view = itemView.findViewById(R.id.text_desc);
            img = itemView.findViewById(R.id.imageView);
        }
    }
}
