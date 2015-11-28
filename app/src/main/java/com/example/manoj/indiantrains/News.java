package com.example.manoj.indiantrains;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Manoj on 27-11-2015.
 */
public class News extends Activity {


    WebView ww;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        ww = (WebView) findViewById(R.id.webView3);

        ww.getSettings().setLoadWithOverviewMode(true);
        ww.getSettings().setUseWideViewPort(true);
        ww.loadUrl("http://www.indianrail.gov.in/pnr_Enq.html");
    }

}
