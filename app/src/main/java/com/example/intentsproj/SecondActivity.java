package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText et_n1;
    EditText et_n2;
    TextView tv_solution;
    Button btn_add;
    Button btn_sub;
    Button btn_mul;
    Button btn_div;
    String number1;
    Float number_1;
    String number2;
    Float number_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_n1 = findViewById(R.id.et_n1);
        et_n2 = findViewById(R.id.et_n2);
        tv_solution = findViewById(R.id.tv_solution);
        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        et_n1.setText(number1);
        et_n2.setText(number2);

        number_1 = Float.parseFloat(number1);
        number_2 = Float.parseFloat(number2);
    }

    public void Add(View view){
        Float add = number_1 + number_2;
        String addString = new Float(add).toString();
        tv_solution.setText(number1 + " + " + number2 + " = " + addString);
    }

    public void Sub(View view){
        Float sub = number_1 - number_2;
        String subString = new Float(sub).toString();
        tv_solution.setText(number1 + " - " + number2 + " = " + subString);
    }

    public void Mul(View view){
        Float mul = number_1 * number_2;
        String mulString = new Float(mul).toString();
        tv_solution.setText(number1 + " * " + number2 + " = " + mulString);
    }

    public void Div(View view){
        Float div = number_1 / number_2;
        String divString = new Float(div).toString();
        tv_solution.setText(number1 + " / " + number2 + " = " + divString);
    }
}