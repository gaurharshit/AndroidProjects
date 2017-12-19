package com.example.harsheyy.modernvotingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harsheyy.modernvotingsystem.adhaarNumbersAndPassword.AdhaarNumbersAndPassword;

import java.lang.reflect.Array;

/**
 * Created by Harsheyy on 19-02-2017.
 */
public class registration_password extends AppCompatActivity implements View.OnClickListener {



    EditText setPassword=null;
    Button submitPassword=null;
    String passwordSet=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.registration_password);
        setPassword=(EditText)findViewById(R.id.setPassword);
        submitPassword=(Button)findViewById(R.id.submitPassword);
        submitPassword.setOnClickListener(this);

    }
    public void onClick(View v)
    {
        passwordSet=setPassword.getText().toString();
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);


    }
}
