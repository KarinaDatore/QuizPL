package com.fatec.karina.quizpl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarTeste(View view){
        int qtde = (R.id.editText2);
        Intent i = new Intent(getApplicationContext(), QuizActivity.class);
        i.putExtra("quantidade", qtde);
        startActivity(i);

    }


    public void iniciarClassificacao(View view){
        Intent i = new Intent(getApplicationContext(), HistoryActivity.class);
        startActivity(i);

    }
}
