package com.fatec.karina.quizpl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private ArrayList<Perguntas> questoes;
    private String[] respostas = new String[5];
    private int posicao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        criarTeste();
        Collections.shuffle(questoes);
        atualizarQuestao();
    }

    public void criarTeste(){
        questoes = new ArrayList<>();

        Perguntas p = new Perguntas();
        p.pergunta="Quanto é um mais um?";
        p.resposta="dois";
        p.opcoes=new String[]{"um","dois","três","quatro","cinco"};
        questoes.add(p);

        p = new Perguntas();
        p.pergunta="Quanto é dois mais dois?";
        p.resposta="dois";
        p.opcoes=new String[]{"I","II","III","IV","V"};
        questoes.add(p);

        p = new Perguntas();
        p.pergunta="Quanto é dois mais um?";
        p.resposta="dois";
        p.opcoes=new String[]{"1","2","3","4","5"};
        questoes.add(p);

    }

    public void atualizarQuestao(){
        Perguntas p = questoes.get(posicao);

        TextView pTextView = (TextView)findViewById(R.id.posicaoTextView);
        pTextView.setText((posicao+1)+" de "+questoes.size());

        TextView pergTextView = (TextView)findViewById(R.id.perguntaTextView);
        pergTextView.setText(p.pergunta);

        RadioButton op1 = (RadioButton)findViewById(R.id.op1Radio);
        RadioButton op2 = (RadioButton)findViewById(R.id.op2Radio);
        RadioButton op3 = (RadioButton)findViewById(R.id.op3Radio);
        RadioButton op4 = (RadioButton)findViewById(R.id.op4Radio);
        RadioButton op5 = (RadioButton)findViewById(R.id.op5Radio);

        int i;
        for(int c = 1; c < 5; c++){
            Random rdn = new Random();
            int min = 1;
            int max = 5;
            i = rdn.nextInt(max - min + 1) + min;
            System.out.println(i);

            op1.setText(p.opcoes[i]);
            op1.setSelected(false);

            op2.setText(p.opcoes[i]);
            op2.setSelected(false);

            op3.setText(p.opcoes[i]);
            op3.setSelected(false);

            op4.setText(p.opcoes[i]);
            op4.setSelected(false);

            op5.setText(p.opcoes[i]);
            op5.setSelected(false);
        }

    }

    public void voltar(View view){
        if(posicao>0){
            posicao--;
            atualizarQuestao();
        }
    }

    public void avancar(View view){
        if(posicao<questoes.size()-1){
            posicao++;
            atualizarQuestao();
        }
    }

    public void selecionarOp(View view){
        RadioButton r = (RadioButton)findViewById(view.getId());
        respostas[posicao] = r.getText().toString();
    }
}
