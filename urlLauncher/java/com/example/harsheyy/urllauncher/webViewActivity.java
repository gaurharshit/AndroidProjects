package com.example.harsheyy.urllauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by Harsheyy on 17-09-2016.
 */
public class webViewActivity extends Activity {


    private WebView webView;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_test);

        Intent intent = getIntent();
        String message = intent.getStringExtra(mainContent.EXTRA_MESSAGE);
        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;

        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        webView.loadUrl(message);
        setContentView(webView);

    }
}
