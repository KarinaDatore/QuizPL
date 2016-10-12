package com.fatec.karina.quizpl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private ArrayList<Perguntas> questoes;
    private String[] respostas = new String[5];
    private String[] tela;
    private int[] minhaResposta = new int[5];
    private int posicao = 0;
    int pontos = 0;

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

        Perguntas p1 = new Perguntas();
        p1.pergunta="Quanto é um mais um?";
        p1.resposta=2;
        p1.opcoes=new String[]{"um","dois","três","quatro","cinco"};
        questoes.add(p1);

        Perguntas p2 = new Perguntas();
        p2.pergunta="Quanto é dois mais dois?";
        p2.resposta=4;
        p2.opcoes=new String[]{"I","II","III","IV","V"};
        questoes.add(p2);

        Perguntas p3 = new Perguntas();
        p3.pergunta="Quanto é dois mais um?";
        p3.resposta=3;
        p3.opcoes=new String[]{"1","2","3","4","5"};
        questoes.add(p3);

    }

    public void atualizarQuestao(){
        Perguntas p = questoes.get(posicao);

        TextView pTextView = (TextView)findViewById(R.id.posicaoTextView);
        pTextView.setText((posicao+1)+" de "+questoes.size());

        TextView pergTextView = (TextView)findViewById(R.id.perguntaTextView);
        pergTextView.setText(p.pergunta);

        RadioButton op1 = (RadioButton)findViewById(R.id.op1Radio);
        op1.setText(p.opcoes[0]);
        op1.setSelected(false);

        RadioButton op2 = (RadioButton)findViewById(R.id.op2Radio);
        op2.setText(p.opcoes[1]);
        op2.setSelected(false);

        RadioButton op3 = (RadioButton)findViewById(R.id.op3Radio);
        op3.setText(p.opcoes[2]);
        op3.setSelected(false);

        RadioButton op4 = (RadioButton)findViewById(R.id.op4Radio);
        op4.setText(p.opcoes[3]);
        op4.setSelected(false);

        RadioButton op5 = (RadioButton)findViewById(R.id.op5Radio);
        op5.setText(p.opcoes[4]);
        op5.setSelected(false);

        int i=0;
        for(int c = 1; c < 5; c++){
            Random rdn = new Random();
            int min = 1;
            int max = 5;
            i = rdn.nextInt(max - min + 1) + min;
            System.out.println(i);
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

    public void armazenaResposta(int valor){
        minhaResposta[valor] = valor;



        Perguntas p1 = new Perguntas();
        p1.respDoUsuario=valor;
        if(p1.respDoUsuario == p1.resposta){
            pontos+=1;
        }

        Perguntas p2 = new Perguntas();
        p2.respDoUsuario=valor;
        if(p2.respDoUsuario == p2.resposta){
            pontos+=1;
        }

        Perguntas p3 = new Perguntas();
        p3.respDoUsuario=valor;
        if(p3.respDoUsuario == p3.resposta){
            pontos+=1;
        }

        TextView exibindo = (TextView)findViewById(R.id.exibeResposta);
        exibindo.setText("pontos: "+ pontos);
    }

    public void selecionarOp(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.op1Radio:
                TextView exibe = (TextView)findViewById(R.id.exibeResposta);
                exibe.setText("op1Radio");
                armazenaResposta(1);
                break;
            case R.id.op2Radio:
                exibe = (TextView)findViewById(R.id.exibeResposta);
                exibe.setText("op2Radio");
                armazenaResposta(2);
                break;
            case R.id.op3Radio:
                exibe = (TextView)findViewById(R.id.exibeResposta);
                exibe.setText("op3Radio");
                armazenaResposta(3);
                break;
            case R.id.op4Radio:
                exibe = (TextView)findViewById(R.id.exibeResposta);
                exibe.setText("op4Radio");
                armazenaResposta(4);
                break;
            case R.id.op5Radio:
                exibe = (TextView)findViewById(R.id.exibeResposta);
                exibe.setText("op5Radio");
                armazenaResposta(5);
                break;
        }

    }


}
