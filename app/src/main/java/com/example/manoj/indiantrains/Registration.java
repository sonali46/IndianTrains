package com.example.manoj.indiantrains;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Manoj on 27-11-2015.
 */
public class Registration extends Activity {
    WebView ws;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resgis);
        ws = (WebView) findViewById(R.id.webView4);

        ws.getSettings().setLoadWithOverviewMode(true);
        ws.getSettings().setUseWideViewPort(true);
        ws.loadUrl("https://www.irctc.co.in/eticketing/loginHome.jsf");
    }
}
