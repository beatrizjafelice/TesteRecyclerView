package com.jafan.recyclerteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jafan.recyclerteste.periodosrecycler.PeriodosAdapter;
import com.jafan.recyclerteste.recyclerview.Model;

import java.util.ArrayList;

public class PeriodosActivity extends AppCompatActivity {

    RecyclerView periodosRecycler;
    PeriodosAdapter periodosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodos);

        periodosRecycler = findViewById(R.id.periodosRecycler);
        periodosRecycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        periodosRecycler.setLayoutManager(linearLayoutManager);

        periodosAdapter = new PeriodosAdapter(this, listaPeriodos());
        periodosRecycler.setAdapter(periodosAdapter);


    }

    private ArrayList<Model> listaPeriodos() {
        ArrayList<Model> models = new ArrayList<>();

        Model p1 = new Model();
        p1.setIcone(R.drawable.lua);
        p1.setImagem(R.color.rosaMagenta);
        p1.setTitulo("Período atual");
        p1.setSubtitulo("Confira as matérias que você está cursando agora!");
        models.add(p1);

        Model p2 = new Model();
        p2.setIcone(R.drawable.constelacao);
        p2.setImagem(R.color.lilas);
        p2.setTitulo("Períodos anteriores");
        p2.setSubtitulo("Revise as matérias que você já cursou! Sempre precisamos de algo que já estudamos anteriormente né?");
        models.add(p2);

        Model p3 = new Model();
        p3.setIcone(R.drawable.foguete);
        p3.setImagem(R.color.begeRosado);
        p3.setTitulo("Períodos futuros");
        p3.setSubtitulo("Ansiose para as próximas matérias que vão vir aí? Vem dar uma olhadinha e já dar uma adiantada na matéria!");
        models.add(p3);

        Model p4 = new Model();
        p4.setIcone(R.drawable.tubo_de_ensaio);
        p4.setImagem(R.color.vermelhoAlaranjado);
        p4.setTitulo("Iniciação científica");
        p4.setSubtitulo("Separamos aqui algumas informações sobre como funciona a iniciação e como ela pode ajudar na sua carreira!");
        models.add(p4);

        return models;
    }
}