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

public class AddActivity extends AppCompatActivity {

    Button b5,add;
    EditText ea1,ea2;
    String getNum1,getNum2,result;
    int num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
    b5=(Button) findViewById(R.id.back1);
    add=(Button) findViewById(R.id.addbtn);
    ea1=(EditText) findViewById(R.id.anum1);
    ea2=(EditText) findViewById(R.id.anum2);


    b5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent o5=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(o5);
        }
    });

    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getNum1=ea1.getText().toString();
            getNum2=ea2.getText().toString();
            num1=Integer.parseInt(getNum1);
            num2=Integer.parseInt(getNum2);
            sum=num1+num2;
            result= String.valueOf(sum);
            Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();


        }
    });
    }
}