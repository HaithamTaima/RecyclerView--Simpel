package com.example.recyclerview2022;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyleViewAdapter extends RecyclerView.Adapter<RecyleViewAdapter.MyViewHolder> {
    List<President> presidentList;

    Context context;

    public RecyleViewAdapter(List<President> presidentList, Context context) {
        this.presidentList = presidentList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_lin_president,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_presName.setText(presidentList.get(position).getName());
        holder.tv_number.setText(presidentList.get(position).getNumber());
        holder.tv_age.setText(String.valueOf(presidentList.get(position).getAge()));
        holder.tv_presElectionData.setText(String.valueOf(presidentList.get(position).getDateOfElection()));
        Glide.with(this.context).load(presidentList.get(position).getImageURL()).into(holder.iv_presPic);
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context,AddEditOne.class);
                intent.putExtra("id",presidentList.get(position).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_presPic;
        TextView tv_presElectionData,tv_presName,tv_age,tv_number;
        ConstraintLayout parentLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_presPic=itemView.findViewById(R.id.iv_presidentPicture);
            tv_presName=itemView.findViewById(R.id.tv_presName);
            tv_presElectionData=itemView.findViewById(R.id.tv_dateElection);
            tv_number=itemView.findViewById(R.id.tv_number);
            tv_age=itemView.findViewById(R.id.tv_age);
            parentLayout=itemView.findViewById(R.id.oneLinePresidentLayout);

        }
    }
}
