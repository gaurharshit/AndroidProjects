package com.example.harsheyy.modernvotingsystem;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harsheyy.modernvotingsystem.adhaarNumbersAndPassword.AdhaarNumbersAndPassword;

public class Registration extends AppCompatActivity implements View.OnClickListener{
    EditText adhaarNumber=null;
    Button submitButton=null;
    int adhaar=123456789;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration);
        adhaarNumber=(EditText)findViewById(R.id.AdhaarNumber);
        submitButton=(Button)findViewById(R.id.submitAdhaar);
        submitButton.setOnClickListener(this);

    }
    public void onClick(View v)
    {AdhaarNumbersAndPassword setup=new AdhaarNumbersAndPassword();
        adhaar=setup.adhaarNumbers[0];
        if (Integer.parseInt(adhaarNumber.getText().toString())==adhaar)
        {
            Intent intent = new Intent(this,registration_password.class);
            startActivity(intent);


        }
        else
        {
            Toast error = Toast.makeText(getApplicationContext(), "Enter valid Adhaar Number", Toast.LENGTH_LONG);

            error.show();
        }
    }

}

