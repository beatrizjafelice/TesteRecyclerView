package com.jafan.recyclerteste;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jafan.recyclerteste.recyclerview.Model;
import com.jafan.recyclerteste.perfilrecycler.PerfilAdapter;

import java.util.ArrayList;


public class PerfilActivity extends AppCompatActivity {
    RecyclerView perfilRecycler;
    PerfilAdapter perfilAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        perfilRecycler = findViewById(R.id.perfilRecycler);
        perfilRecycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        perfilRecycler.setLayoutManager(linearLayoutManager);

        perfilAdapter = new PerfilAdapter(this, listaPerfil());
        perfilRecycler.setAdapter(perfilAdapter);
    }

    private ArrayList<Model> listaPerfil() {
        ArrayList<Model> items = new ArrayList<>();

        Model i1 = new Model();
        i1.setIcone(R.drawable.ic_mural_icon);
        i1.setTitulo("Mural de Estudos");
        items.add(i1);

        Model i2 = new Model();
        i2.setIcone(R.drawable.ic_materias_concluidas);
        i2.setTitulo("Matérias Concluídas");
        items.add(i2);

        Model i3 = new Model();
        i3.setIcone(R.drawable.ic_salvos_marcador);
        i3.setTitulo("Artigos e notícias salvos");
        items.add(i3);

        Model i4 = new Model();
        i4.setIcone(R.drawable.ic_podcast_salvos);
        i4.setTitulo("Podcasts salvos");
        items.add(i4);

        return items;
    }
}