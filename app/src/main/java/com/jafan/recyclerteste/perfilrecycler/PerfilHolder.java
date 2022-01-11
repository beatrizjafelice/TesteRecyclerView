package com.jafan.recyclerteste.perfilrecycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jafan.recyclerteste.R;
import com.jafan.recyclerteste.recyclerview.ItemClickListener;

import org.jetbrains.annotations.NotNull;

public class PerfilHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView icone;
    TextView titulo;
    ItemClickListener itemClickListener;

    public PerfilHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        this.icone = itemView.findViewById(R.id.iconeMenuPerfil);
        this.titulo = itemView.findViewById(R.id.txtMenuPerfil);

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

