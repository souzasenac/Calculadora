package br.senac.es.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String visor = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView txtVisor = (TextView) findViewById(R.id.textVisor);
        final Button botao0 = (Button) findViewById(R.id.button18);
        final Button botao1 = (Button) findViewById(R.id.button13);
        final Button botao2 = (Button) findViewById(R.id.button14);
        final Button botao3 = (Button) findViewById(R.id.button15);
        final Button botao4 = (Button) findViewById(R.id.button9);
        final Button botao5 = (Button) findViewById(R.id.button10);
        final Button botao6 = (Button) findViewById(R.id.button11);
        final Button botao7 = (Button) findViewById(R.id.button5);
        final Button botao8 = (Button) findViewById(R.id.button6);
        final Button botao9 = (Button) findViewById(R.id.button7);
        final Button botaoC = (Button) findViewById(R.id.button1);
        final Button botaoVirg = (Button) findViewById(R.id.button19);
        final Button botaoX = (Button) findViewById(R.id.button8);
        final Button botaoMenos = (Button) findViewById(R.id.button12);
        final Button botaoMais = (Button) findViewById(R.id.button16);
        final Button botaoBarra = (Button) findViewById(R.id.button4);
        final Button botaoDell = (Button) findViewById(R.id.button21);


        botaoVirg.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + ",";
                txtVisor.setText(visor);
            }
        });
        txtVisor.setText(visor);

        botao0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "0";
                txtVisor.setText(visor);
            }

        });
        botao1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                //é a mesma coisa que visor += "1"
                visor = visor + "1";
                txtVisor.setText(visor);
            }

        });
        botao2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "2";
                txtVisor.setText(visor);
            }

        });
        botao3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "3";
                txtVisor.setText(visor);
            }

        });
        botao4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "4";
                txtVisor.setText(visor);
            }

        });
        botao5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "5";
                txtVisor.setText(visor);
            }

        });
        botao6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "6";
                txtVisor.setText(visor);
            }

        });
        botao7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor + "7";
                txtVisor.setText(visor);
            }

        });
        botao8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "8";
                txtVisor.setText(visor);
            }

        });
        botao9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "9";
                txtVisor.setText(visor);
            }

        });
        botaoC.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = "";
                txtVisor.setText(visor);
            }

        });


        botaoMais.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
              String lastNumero = visor.charAt(visor.length());
                if()){

              }
                visor = visor + "+";
                txtVisor.setText(visor);
            }
        });
        botaoX.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "X";
                txtVisor.setText(visor);
            }
        });
        botaoMenos.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "-";
                txtVisor.setText(visor);
            }
        });
        botaoBarra.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor = visor + "/";
                txtVisor.setText(visor);
            }
        });
        botaoDell.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String modificado = visor.substring(0, visor.length() - 1);


                visor = modificado;
                txtVisor.setText(visor);

            if( visor.length() == 0 ){
                visor = "";
                txtVisor.setText(visor);
            }
            }
        });
    }
}