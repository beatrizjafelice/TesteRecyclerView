package com.jafan.recyclerteste.dashboardrecycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jafan.recyclerteste.PerfilActivity;
import com.jafan.recyclerteste.ProjetosOportunidadesActivity;
import com.jafan.recyclerteste.R;
import com.jafan.recyclerteste.recyclerview.ItemClickListener;
import com.jafan.recyclerteste.recyclerview.Model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardHolder> {

    Context context;
    ArrayList<Model> models;

    public DashboardAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @NotNull
    @Override
    public DashboardHolder onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);

        return new DashboardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DashboardHolder dashboardHolder, int i) {
        dashboardHolder.icone.setImageResource(models.get(i).getIcone());
        dashboardHolder.titulo.setText(models.get(i).getTitulo());

        dashboardHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                if (models.get(position).getTitulo().equals("Projetos e Oportunidades")) {
                    Intent intent = new Intent(context, ProjetosOportunidadesActivity.class);
                    context.startActivity(intent);
                } else if (models.get(position).getTitulo().equals("Notícias\n")) {
                        Intent intent = new Intent(context, PerfilActivity.class);
                        context.startActivity(intent);
                    }

                }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
