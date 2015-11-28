package com.example.manoj.indiantrains;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Manoj on 27-11-2015.
 */
public class Home extends Activity {
WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        wb= (WebView) findViewById(R.id.webView);
        wb.getSettings().setLoadWithOverviewMode(true);
        wb.getSettings().setUseWideViewPort(true);
        wb.loadUrl("http://www.indianrail.gov.in");

    }

    }
