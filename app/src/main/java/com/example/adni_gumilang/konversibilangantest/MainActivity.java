package com.example.adni_gumilang.konversibilangantest;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;





public class MainActivity extends AppCompatActivity {

    public String masuk,obiner,ooctal,ohexa;
    public int a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText dob    =   (EditText) findViewById(R.id.input);
        final TextView biner  =   (TextView) findViewById(R.id.biner);
        final TextView octal  =   (TextView) findViewById(R.id.octal);
        final TextView hexa   =   (TextView) findViewById(R.id.hexa);
        Button convert  =   (Button) findViewById(R.id.convert);
        Button reset      =   (Button) findViewById(R.id.reset);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk   =   dob.getText().toString();
                a       =   Integer.parseInt(masuk);
                obiner  =   Integer.toBinaryString(a);
                ohexa   =   Integer.toHexString(a);
                ooctal  =   Integer.toOctalString(a);
                biner.setText("Biner\t\t\t\t\t\t\t: "+ obiner);
                octal.setText("Octal\t\t\t\t\t\t\t: "+ ooctal);
                hexa.setText("Hexadecimal \t : "+ ohexa);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dob.setText("0");
                biner.setText("Biner\t\t\t\t\t\t\t: ");
                octal.setText("Octal\t\t\t\t\t\t\t: ");
                hexa.setText("Hexadecimal \t : ");

            }
        });

    }
    //public void konversi()
    //{


    //}

}

