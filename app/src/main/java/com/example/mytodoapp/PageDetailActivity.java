package com.example.mytodoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class PageDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_detail);

        Intent intent = getIntent();

        String selectedTitle = intent.getStringExtra("title");
        String selectedContent = intent.getStringExtra("content");

        TextView textView1 = findViewById(R.id.selected_title);
        textView1.setText(selectedTitle);

        TextView textView2 = findViewById(R.id.selected_content);
        textView2.setText(selectedContent);

        FloatingActionButton fab = findViewById(R.id.fabEditDetail);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fabintent = new Intent(PageDetailActivity.this, PageEditActivity.class);
                startActivity(fabintent);
            }
        });
    }
}
