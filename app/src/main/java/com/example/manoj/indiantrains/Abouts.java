package com.example.manoj.indiantrains;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Manoj on 27-11-2015.
 */
public class Abouts extends Activity {
    TextView tv;
    WebView wn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
       // wn = (WebView) findViewById(R.id.webView4);
        tv= (TextView) findViewById(R.id.textView2);


    }
}
