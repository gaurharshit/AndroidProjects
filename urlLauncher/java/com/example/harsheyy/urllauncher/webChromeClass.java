package com.example.harsheyy.urllauncher;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

/**
 * Created by Harsheyy on 18-09-2016.
 */
public class webChromeClass extends Activity {
    final Activity activity = this;
    ProgressBar progres=null;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Intent intent = getIntent();
        String message = intent.getStringExtra(mainContent.EXTRA_MESSAGE);
        super.onCreate(savedInstanceState);
        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.webview_test);
        getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);
        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        progres=(ProgressBar)findViewById(R.id.progress1);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setSupportMultipleWindows(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)
            {
                findViewById(R.id.progress1).setVisibility(View.VISIBLE);
                activity.setTitle("Loading...");
                activity.setProgress(progress * 100);
                progres.setDrawingCacheQuality(progress);
//               if (progress==10)
//                    progres.setProgress(10);
//                if (progress==20)
//                    progres.setProgress(20);
//                if (progress==30)
//                   progres.setProgress(30);
//                 if (progress==40)
//                    progres.setProgress(40);
//                 if (progress==50)
//                    progres.setProgress(50);
//                 if (progress==60)
//                    progres.setProgress(60);
//                 if (progress==70)
//                    progres.setProgress(70);
//                 if (progress==80)
//                   progres.setProgress(80);
//                 if (progress==90)
//                    progres.setProgress(90);
                if(progress!=100)
                {
                    progres.incrementProgressBy(10);
                }
                 if(progress == 100) {
                     progres.setProgress(100);
                     progres.setVisibility(View.GONE);
                 }

                    activity.setTitle(R.string.app_name);

            }

        });

//        webView.setWebViewClient(new WebViewClient() {
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//
//                super.onPageStarted(view, url, favicon);
//                findViewById(R.id.progress1).setVisibility(View.VISIBLE);
//                progres.setProgress(50);
//            }
//            on
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                progres.setProgress(50);
//                findViewById(R.id.progress1).setVisibility(View.GONE);
//            }
//            @Override
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
//            {
//                // Handle the error
//            }
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url)
//            {
//                view.loadUrl(url);
//                return true;
//            }
//        });


        webView.loadUrl(message);
    }


}
