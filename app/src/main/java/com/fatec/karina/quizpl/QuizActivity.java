package com.fatec.karina.quizpl;

import android.content.Intent;
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

    MainActivity a = new MainActivity();
    Database dados = new Database();
    //EditText nome = (EditText) findViewById(R.id.nomeDoInfeliz);
    RadioButton qtPerguntas15, qtPerguntas27;
    private int posicao = 0;
    int pontos= 0;
    int prox = 27 ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        dados.criarTeste();
        Collections.shuffle(dados.questoes);
        atualizarQuestao();
    }


    public void limparRadios() {
        RadioGroup r1 = (RadioGroup) findViewById(R.id.radioGroup);
        r1.clearFocus();
        r1.clearCheck();
    }

    public void atualizarQuestao() {
        Perguntas p = dados.questoes.get(posicao);
        limparRadios();

        TextView pTextView = (TextView) findViewById(R.id.posicaoTextView);
        pTextView.setText((posicao + 1) + " de " + prox);

        TextView pergTextView = (TextView) findViewById(R.id.perguntaTextView);
        pergTextView.setText(p.pergunta);

        RadioButton op1 = (RadioButton) findViewById(R.id.op1Radio);
        op1.setText(p.opcoes[0]);

        RadioButton op2 = (RadioButton) findViewById(R.id.op2Radio);
        op2.setText(p.opcoes[1]);

        RadioButton op3 = (RadioButton) findViewById(R.id.op3Radio);
        op3.setText(p.opcoes[2]);

        RadioButton op4 = (RadioButton) findViewById(R.id.op4Radio);
        op4.setText(p.opcoes[3]);

        RadioButton op5 = (RadioButton) findViewById(R.id.x);
        op5.setText(p.opcoes[4]);

    }

    public void voltar(View view) {
        limparRadios();
        if (posicao > 0) {
            posicao--;
            atualizarQuestao();
        }
    }
    public void Resultado(View view){
        Intent i = new Intent(getApplicationContext(), Resultado.class);
        startActivity(i);

    }
    public void avancar(View view) {
        limparRadios();
        if (posicao < prox-1) {
            posicao++;
            atualizarQuestao();
        }else if(posicao==prox-1){
            try {
                Resultado(view);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void armazenaResposta(int valor) {
        Perguntas p = dados.questoes.get(posicao);
        if (valor == p.resposta) {
            pontos += 1;
        }
        limparRadios();
        avancar(findViewById(R.id.activity_quiz));

        TextView exibindo = (TextView) findViewById(R.id.exibeResposta);
        exibindo.setText("pontos: " + pontos);
    }
    public int getPontos(){
        int ponto= pontos;
        return ponto;
    }

    public void selecionarOp(View view) {

        switch (view.getId()) {
            case R.id.op1Radio:
                TextView exibe = (TextView) findViewById(R.id.exibeResposta);
                exibe.setText("op1Radio");
                armazenaResposta(1);
                break;
            case R.id.op2Radio:
                exibe = (TextView) findViewById(R.id.exibeResposta);
                exibe.setText("op2Radio");
                armazenaResposta(2);
                break;
            case R.id.op3Radio:
                exibe = (TextView) findViewById(R.id.exibeResposta);
                exibe.setText("op3Radio");
                armazenaResposta(3);
                break;
            case R.id.op4Radio:
                exibe = (TextView) findViewById(R.id.exibeResposta);
                exibe.setText("op4Radio");
                armazenaResposta(4);
                break;
            case R.id.x:
                exibe = (TextView) findViewById(R.id.exibeResposta);
                exibe.setText("x");
                armazenaResposta(5);
                break;
            default:
                setContentView(R.layout.activity_quiz);
        }
    }

}