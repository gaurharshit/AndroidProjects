package com.example.harsheyy.urllauncher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Harsheyy on 17-09-2016.
 */
    public class mainContent extends AppCompatActivity implements View.OnClickListener {
    public final static String EXTRA_MESSAGE = "com.example.harsheyy.urllauncher";
        EditText urlInput=null;

        Button save=null;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            urlInput=(EditText)findViewById(R.id.urlName);
            save=(Button)findViewById(R.id.save);
            save.setOnClickListener(this);
        }
        public void onClick(View view)
        {
            String urlInfo=urlInput.getText().toString();
            Intent browser=new Intent (this,webChromeClass.class);
            if (!urlInfo.startsWith("https://") && !urlInfo.startsWith("http://"))
                urlInfo = "http://" + urlInfo;
            browser.putExtra(EXTRA_MESSAGE, urlInfo);
            startActivity(browser);
        }
    }


