package com.example.opa.myapplication;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Opa on 23/10/2016.
 */
public class Database extends Perguntas {

   ArrayList<Integer> resposta = new ArrayList<>();

    public void criarTeste(){
        questoes = new ArrayList<>();

        Perguntas p1 = new Perguntas();
        p1.pergunta="Quanto é um mais um?";
        p1.resposta=2;
        p1.opcoes=new String[]{"um","dois","três","quatro","cinco"};
        questoes.add(p1);
        resposta.add(p1.resposta);

        Perguntas p2 = new Perguntas();
        p2.pergunta="Quanto é dois mais dois?";
        p2.resposta=4;
        p2.opcoes=new String[]{"I","II","III","IV","V"};
        questoes.add(p2);
        resposta.add(p2.resposta);

        Perguntas p3 = new Perguntas();
        p3.pergunta="Quanto é dois mais um?";
        p3.resposta=3;
        p3.opcoes=new String[]{"1","2","3","4","5"};
        questoes.add(p3);
        resposta.add(p3.resposta);

    }
}
