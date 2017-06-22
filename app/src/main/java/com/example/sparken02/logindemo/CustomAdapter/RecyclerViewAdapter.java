package com.example.sparken02.logindemo.CustomAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sparken02.logindemo.R;

import java.util.ArrayList;

/**
 * Created by sparken02 on 21/6/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList images;

   public RecyclerViewAdapter(Context context, ArrayList images) {
        this.context = context;
        this.images = images;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_row, parent, false);
        MyViewHolder myholder = new MyViewHolder(view);
        return myholder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.myimage.setImageResource((Integer) images.get(position));
    }
    @Override
    public int getItemCount() {
        return images.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView myimage;
        public MyViewHolder(View itemView) {
            super(itemView);
            myimage = (ImageView)itemView.findViewById(R.id.imagerecycle);
        }
    }
}
