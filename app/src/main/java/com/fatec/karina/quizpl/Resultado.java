package com.fatec.karina.quizpl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        int pontos = getIntent().getIntExtra("pontos",0);
        TextView p2TextView = (TextView) findViewById(R.id.textView2);
        p2TextView.setText(" Resultado: " + pontos + " pontos");
    }
}
