package com.example.recylerviewapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class RecyclerViewHolder extends RecyclerView.ViewHolder {
TextView txtname,txtaddress;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        txtname=itemView.findViewById(R.id.txtName);
        txtaddress=itemView.findViewById(R.id.txtAddress);
    }
}
