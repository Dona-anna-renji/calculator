package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MultActivity extends AppCompatActivity {
    Button b8,mulbtn;
    EditText em1,em2;
    String getNum1,getNum2,result;

    int num1,num2,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mult);

        b8=(Button) findViewById(R.id.back4);
        em1=(EditText) findViewById(R.id.mnum1);
        em2=(EditText) findViewById(R.id.mnum2);
        mulbtn=(Button) findViewById(R.id.mulbt);
        b8=(Button) findViewById(R.id.back4);


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o8=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(o8);
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=em1.getText().toString();
                getNum2=em2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                mul=num1*num2;
                result= String.valueOf(mul);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

    }
}