package com.jafan.recyclerteste.periodosrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jafan.recyclerteste.R;
import com.jafan.recyclerteste.recyclerview.ItemClickListener;
import com.jafan.recyclerteste.recyclerview.Model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PeriodosAdapter extends RecyclerView.Adapter<PeriodosHolder> {

    Context context;
    ArrayList<Model> models;

    public PeriodosAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @NotNull
    @Override
    public PeriodosHolder onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_com_img, viewGroup, false);
        return new PeriodosHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PeriodosHolder periodosHolder, int i) {
        periodosHolder.icone.setImageResource(models.get(i).getIcone());
        periodosHolder.imgFundo.setImageResource(models.get(i).getImagem());
        periodosHolder.titulo.setText(models.get(i).getTitulo());
        periodosHolder.subtitulo.setText(models.get(i).getSubtitulo());

        /*periodosHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {


            }
        });*/
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
