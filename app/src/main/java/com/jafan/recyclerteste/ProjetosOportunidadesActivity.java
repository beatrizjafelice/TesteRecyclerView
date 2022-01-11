package com.jafan.recyclerteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.jafan.recyclerteste.dashboardrecycler.DashboardAdapter;
import com.jafan.recyclerteste.recyclerview.AutoFitGridLayoutManager;
import com.jafan.recyclerteste.recyclerview.Model;

import java.util.ArrayList;

public class ProjetosOportunidadesActivity extends AppCompatActivity {

    RecyclerView projetosRecycler;
    DashboardAdapter dashboardAdapter;
    ImageView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetos_oportunidades);

        projetosRecycler = findViewById(R.id.projetosRecycler);
        AutoFitGridLayoutManager manager = new AutoFitGridLayoutManager(this, 500);
        projetosRecycler.setLayoutManager(manager);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        //projetosRecycler.setLayoutManager(gridLayoutManager);

        dashboardAdapter = new DashboardAdapter(this, listaProjetos());
        projetosRecycler.setAdapter(dashboardAdapter);


        botaoVoltar = findViewById(R.id.projetos_voltar);
        botaoVoltar.setOnClickListener(view -> startActivity(new Intent(ProjetosOportunidadesActivity.this, MainActivity.class)));

        botaoVoltar = findViewById(R.id.projetos_voltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProjetosOportunidadesActivity.this, MainActivity.class));
            }
        });
    }

    private ArrayList<Model> listaProjetos() {
        ArrayList<Model> models = new ArrayList<>();

        Model m1 = new Model();
        m1.setIcone(R.drawable.ic_ciencion);
        m1.setTitulo("UFABC - Podcast\n" +
                "CIENCEON");
        models.add(m1);

        Model m2 = new Model();
        m2.setIcone(R.drawable.ic_ciencia_2_1);
        m2.setTitulo("UFABC - IPT\n");
        models.add(m2);

        Model m3 = new Model();
        m3.setIcone(R.drawable.ic_ciencia_1);
        m3.setTitulo("UFABC \n" +
                "++C&TPM");
        models.add(m3);

        Model m4 = new Model();
        m4.setIcone(R.drawable.ic_atomo);
        m4.setTitulo("Projeto SIRUS\n");
        models.add(m4);

        Model m5 = new Model();
        m5.setIcone(R.drawable.ic_livro_de_matematica_1);
        m5.setTitulo("Olimpíada de\nMatemática");
        models.add(m5);

        Model m6 = new Model();
        m6.setIcone(R.drawable.ic_fisica_1);
        m6.setTitulo("Olimpíada BR\nde Física");
        models.add(m6);


        return models;
    }
}