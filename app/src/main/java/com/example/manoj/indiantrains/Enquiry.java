package com.example.manoj.indiantrains;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;

/**
 * Created by Manoj on 27-11-2015.
 */
public class Enquiry extends Activity {
WebView b ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enquiry);
        b = (WebView) findViewById(R.id.webView2);
        ;
        b.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        b.setScrollbarFadingEnabled(false);
        b.getSettings().setJavaScriptEnabled(true);
        b.getSettings().setLoadWithOverviewMode(true);
        b.getSettings().setUseWideViewPort(true);
        b.getSettings().setBuiltInZoomControls(false);
        b.setPadding(0, 0, 0, 0);
        b.setInitialScale(getScale());
        b.loadUrl("http://www.indianrail.gov.in/know_Station_Code.html");
    }
        private int getScale(){
            Display display=((WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
            int width=display.getWidth();Double val=new Double(width)/new Double(800);
            val=val*100d;return val.intValue();
        }




}
