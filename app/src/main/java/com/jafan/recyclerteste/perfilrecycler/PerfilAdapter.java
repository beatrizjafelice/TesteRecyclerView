package com.jafan.recyclerteste.perfilrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jafan.recyclerteste.R;
import com.jafan.recyclerteste.recyclerview.Model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PerfilAdapter extends RecyclerView.Adapter<PerfilHolder> {

    Context context;
    ArrayList<Model> items;

    public PerfilAdapter(Context context, ArrayList<Model> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @NotNull
    @Override
    public PerfilHolder onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_perfil, viewGroup, false);
        return new PerfilHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PerfilHolder perfilHolder, int i) {
        perfilHolder.icone.setImageResource(items.get(i).getIcone());
        perfilHolder.titulo.setText(items.get(i).getTitulo());

        /*perfilHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                if (items.get(position).getTitulo().equals(""))
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
