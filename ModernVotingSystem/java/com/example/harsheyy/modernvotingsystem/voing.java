package com.example.harsheyy.modernvotingsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Harsheyy on 19-02-2017.
 */
public class voing extends AppCompatActivity {
    EditText adhaarNumber = null;
    Button submitButton = null;
    EditText password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.votingmenu);

    }
}