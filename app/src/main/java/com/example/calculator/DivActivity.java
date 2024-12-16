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

public class DivActivity extends AppCompatActivity {

    Button b7,div;
    EditText ed1,ed2;

    String getNum1,getNum2,result;
    Integer  num1,num2,diva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);

        b7=(Button) findViewById(R.id.back3);
        div=(Button) findViewById(R.id.divbt);
        ed1=(EditText) findViewById(R.id.dnum1);
        ed2=(EditText) findViewById(R.id.dnum2);



        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent o7=new Intent(getApplicationContext(),MainActivity.class);
               startActivity(o7);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=ed1.getText().toString();
                getNum2=ed2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                diva=num1/num2;
                result= String.valueOf(diva);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });


    }
}