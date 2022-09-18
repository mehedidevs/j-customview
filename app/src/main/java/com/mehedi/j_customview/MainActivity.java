package com.mehedi.j_customview;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.mehedi.j_customview.views.FirstCustomView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirstCustomView customView = findViewById(R.id.cv);
        Button button = findViewById(R.id.swapColorBtn);

        button.setOnClickListener(v -> {

            customView.swapColor();
        });

    }
}