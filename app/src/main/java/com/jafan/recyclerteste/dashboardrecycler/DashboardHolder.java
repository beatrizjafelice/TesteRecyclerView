package com.jafan.recyclerteste.dashboardrecycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jafan.recyclerteste.R;
import com.jafan.recyclerteste.recyclerview.ItemClickListener;

public class DashboardHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView icone;
    TextView titulo;
    ItemClickListener itemClickListener;

    DashboardHolder(@NonNull View itemView) {
        super(itemView);

        this.icone = itemView.findViewById(R.id.imgIconeDash);
        this.titulo = itemView.findViewById(R.id.txtTituloDash);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClickListener(view, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
