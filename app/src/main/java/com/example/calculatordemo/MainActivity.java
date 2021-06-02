package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textResult;
    private Button Add;
    private Button Sub;
    private Button Mult;
    private Button Div;
    private Button Modl;
    private Button Pow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.editText1);
        editText2=(EditText) findViewById(R.id.editText1);
        textResult=(TextView) findViewById(R.id.textResult);
        Add = (Button)findViewById(R.id.Add);
       Add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int Num1,Num2,Result;
               Num1 = Integer.parseInt(editText1.getText().toString());
               Num2 = Integer.parseInt(editText2.getText().toString());
               Result = Num1 + Num2;
               textResult.setText(Integer.toString(Result));
           }
       });
        Sub = (Button)findViewById(R.id.Sub);
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1,Num2,Result;
                Num1 = Integer.parseInt(editText1.getText().toString());
                Num2 = Integer.parseInt(editText2.getText().toString());
                Result = Num1 - Num2;
                textResult.setText(Integer.toString(Result));
            }
        });
        Mult = (Button)findViewById(R.id.Mult);
        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1,Num2,Result;
                Num1 = Integer.parseInt(editText1.getText().toString());
                Num2 = Integer.parseInt(editText2.getText().toString());
                Result = Num1 * Num2;
                textResult.setText(Integer.toString(Result));
            }
        });
        Div = (Button)findViewById(R.id.Div);
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1,Num2,Result;
                Num1 = Integer.parseInt(editText1.getText().toString());
                Num2 = Integer.parseInt(editText2.getText().toString());
                Result = Num1 / Num2;
                textResult.setText(Integer.toString(Result));
            }
        });
        Modl = (Button)findViewById(R.id.Mod);
        Modl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1,Num2,Result;
                Num1 = Integer.parseInt(editText1.getText().toString());
                Num2 = Integer.parseInt(editText2.getText().toString());
                Result = Num1 % Num2;
                textResult.setText(Integer.toString(Result));
            }
        });
        Pow = (Button)findViewById(R.id.Pow);
        Pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1,Num2;
                Double Result;
                Num1 = Integer.parseInt(editText1.getText().toString());
                Num2 = Integer.parseInt(editText2.getText().toString());
                Result = Math.pow(Num1,Num2);
                textResult.setText(Double.toString(Result));
            }
        });
    }

}