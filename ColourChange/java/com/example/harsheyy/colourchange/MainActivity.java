package com.example.harsheyy.colourchange;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button red=null;
    Button blue=null;
    Button green=null;
    RelativeLayout object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("android", "onCreate: ");
        setContentView(R.layout.activity_main);
        red=(Button)findViewById(R.id.redButton);
        blue=(Button)findViewById(R.id.blueButton);
        green=(Button)findViewById(R.id.greenButton);
        red.setOnClickListener(this);

        blue.setOnClickListener(this);

        green.setOnClickListener(this);

        object=(RelativeLayout)findViewById(R.id.lay);

    }
    protected void onStart()
    {
        super.onStart();
        Log.i("android", "onStart()");
    }
    protected void onResume()
    {
        super.onResume();
        Log.i("android", "onResume: ");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("android", "onPause: ");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("android","On stop()");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("android", "onDestroy: ");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("android","on restart");
    }
    @Override
    public void onClick(View view) {
        if (view==red)
        {
            object.setBackgroundColor(Color.RED);
            Log.i("android","Setting red colour");
        }
        else if(view==blue)
        {
            object.setBackgroundColor(Color.BLUE);
            Log.i("android","Setting blue colour");
        }
        else if(view==green)
        {
            object.setBackgroundColor(Color.GREEN);
            Log.i("android","Setting green colour");
        }
    }
}
