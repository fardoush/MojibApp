package com.example.mojibapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    //context+data
    private Context context;
    //model
    private List<Model> cricketerList;

    public RecyclerviewAdapter(Context context, List<Model> cricketerList) {
        this.context = context;
        this.cricketerList = cricketerList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {//call 1st step

        View view= LayoutInflater.from(context).inflate(R.layout.list_item,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {//set 3 rd step
// img,name set

        viewHolder.imageView.setImageResource(cricketerList.get(i).getImage());
      //  viewHolder.textView.setText(cricketerList.get(i).getName());

    }

    @Override
    public int getItemCount() {
        return cricketerList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{//find|hold 2nd step
        //find
        ImageView imageView;
     //  TextView textView;





        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView= itemView.findViewById(R.id.imageId);
//            textView= itemView.findViewById(R.id._name);
        }
    }

}