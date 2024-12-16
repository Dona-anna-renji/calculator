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

public class SubActivity extends AppCompatActivity {


    Button b6,subbtn;
    EditText es1,es2;
    String getNum1,getNum2,result;
    int num1,num2,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        b6=(Button) findViewById(R.id.back2);
        subbtn=(Button) findViewById(R.id.subbt);
        es1=(EditText)  findViewById(R.id.snum1);
        es2=(EditText)  findViewById(R.id.snum2);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o6=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(o6);
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=es1.getText().toString();
                getNum2=es2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sub=num1-num2;
                result=String.valueOf(sub);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });

    }
}