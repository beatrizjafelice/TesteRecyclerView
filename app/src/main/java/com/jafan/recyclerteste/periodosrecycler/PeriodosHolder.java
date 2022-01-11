package com.jafan.recyclerteste.periodosrecycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jafan.recyclerteste.R;
import com.jafan.recyclerteste.recyclerview.ItemClickListener;

import org.jetbrains.annotations.NotNull;

public class PeriodosHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView icone, imgFundo;
    TextView titulo, subtitulo;
    ItemClickListener itemClickListener;

    public PeriodosHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        this.icone = itemView.findViewById(R.id.imgCardIcone);
        this.imgFundo = itemView.findViewById(R.id.imgCardBackground);
        this.titulo = itemView.findViewById(R.id.txtCard);
        this.subtitulo = itemView.findViewById(R.id.descricaoCard);

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
