package com.example.webviewimgbutton;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.webView);
        String url = getIntent().getStringExtra("url");

        if (url != null && !url.isEmpty()) {
            webView.loadUrl(url);
        }
    }
}
