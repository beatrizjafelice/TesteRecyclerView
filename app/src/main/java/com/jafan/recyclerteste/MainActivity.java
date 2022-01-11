package com.jafan.recyclerteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jafan.recyclerteste.recyclerview.Model;
import com.jafan.recyclerteste.dashboardrecycler.DashboardAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView cardsRecyclerView;
    DashboardAdapter dashboardAdapter;
    CardView cardEspDDU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // configuração do RecyclerView com LinearLayout horizontal:
        cardsRecyclerView = findViewById(R.id.dashboardRecyclerView);
        cardsRecyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        cardsRecyclerView.setLayoutManager(layoutManager);

        // configuração do adapter:
        dashboardAdapter = new DashboardAdapter(this, listaDashboard());
        cardsRecyclerView.setAdapter(dashboardAdapter);

        // evento de clique para o card abaixo do RecyclerView:
        cardEspDDU = findViewById(R.id.cardViewEspDDU);
        cardEspDDU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PeriodosActivity.class));
            }
        });


    }

    // configuração do título e ícone de cada card:
    private ArrayList<Model> listaDashboard() {
        ArrayList<Model> models = new ArrayList<>();

        Model m1 = new Model();
        m1.setIcone(R.drawable.ic_lampada);
        m1.setTitulo("Projetos e Oportunidades");
        models.add(m1);

        Model m2 = new Model();
        m2.setIcone(R.drawable.ic_jornal);
        m2.setTitulo("Notícias\n");
        models.add(m2);

        return models;


    }
}