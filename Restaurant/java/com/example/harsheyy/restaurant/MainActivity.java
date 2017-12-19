package com.example.harsheyy.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioButton one=null;
    RadioButton two=null;
    RadioButton three=null;
    RadioGroup all=null;
    EditText et=null;
    //EditText input=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(EditText)findViewById(R.id.input);
        one=(RadioButton)findViewById(R.id.radioButton1);
        two=(RadioButton)findViewById(R.id.radioButton2);
        three=(RadioButton)findViewById(R.id.radioButton3);
        all=(RadioGroup)findViewById(R.id.radioGroup);
        et=(EditText)findViewById(R.id.putEdit);
        all.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int principle=Integer.parseInt(input.getText().toString());

        if (i==one.getId())
        {
            //double amount=principle*.10;
             String num=et.getText().toString()
                     int a=Integer.parseInt(num)
                             if(a%2==0) {
                                 Toast.makeText(getApplicationContext()."even", Toast.LENGTH_LONG).show();
                             }
            else
                             Toast.makeText(getApplicationContext(),"odd",Toast)

            et.setText(String.valueOf(amount));
        }
        else if (i==two.getId())
        {
            double amount=principle*.20;
            et.setText(String.valueOf(amount));
        }
        else if (i==three.getId())
        {
            double amount=principle*.40;
            et.setText(String.valueOf(amount));
        }

    }
}
