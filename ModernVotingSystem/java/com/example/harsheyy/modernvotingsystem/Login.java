package com.example.harsheyy.modernvotingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.harsheyy.modernvotingsystem.adhaarNumbersAndPassword.AdhaarNumbersAndPassword;

/**
 * Created by Harsheyy on 19-02-2017.
 */
public class Login extends AppCompatActivity implements View.OnClickListener {
        EditText adhaarNumber=null;
        Button submitButton=null;
        EditText password=null;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.login);
            adhaarNumber=(EditText)findViewById(R.id.loginAdhaarNumber);
            password=(EditText)findViewById(R.id.loginPassword);
            submitButton=(Button)findViewById(R.id.submitLoginDetails);
            submitButton.setOnClickListener(this);

        }
        public void onClick(View v)
        {
            AdhaarNumbersAndPassword setup = new AdhaarNumbersAndPassword();

            if ((Integer.parseInt(adhaarNumber.getText().toString())==setup.adhaarNumbers[0])&&(Integer.parseInt(password.getText().toString())==setup.passwords[0]))
            {
                Toast success = Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG);

                success.show();

                Intent intent = new Intent(this,voing.class);
                startActivity(intent);

            }
            else
            {
                Toast error = Toast.makeText(getApplicationContext(), "FAILURE", Toast.LENGTH_LONG);

                error.show();
            }
        }

    }

