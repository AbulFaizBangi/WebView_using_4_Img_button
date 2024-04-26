package com.example.webviewimgbutton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButtonOption1 = findViewById(R.id.imageButtonOption1);
        ImageButton imageButtonOption2 = findViewById(R.id.imageButtonOption2);
        ImageButton imageButtonOption3 = findViewById(R.id.imageButtonOption3);
        ImageButton imageButtonOption4 = findViewById(R.id.imageButtonOption4);

        imageButtonOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebViewActivity("https://google.com/option1");
            }
        });

        imageButtonOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebViewActivity("https://youtube.com/option2");
            }
        });

        imageButtonOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebViewActivity("https://github.com/option3");
            }
        });

        imageButtonOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebViewActivity("https://amazon.com/option4");
            }
        });
    }

    private void openWebViewActivity(String url) {
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
