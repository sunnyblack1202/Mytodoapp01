package com.example.mytodoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    private static final String[] titles = {
            "あかさたな",
            "はまやらわ",
            "やゆよ"
    };

    private static final String[] contents = {
            "あいうえおかきくけこさしすせそたちつてとなにぬねの",
            "はひふえほまみむめもやゆよらりるれろわをん",
            "よ"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ListView yulistView = (ListView) findViewById(R.id.listView1);

        ArrayAdapter yuadapter = new ArrayAdapter(this.getApplicationContext(), R.layout.simple_list_item_1, titles);

        yulistView.setAdapter(yuadapter);

        yulistView.setOnItemClickListener(this);

        FloatingActionButton fab = findViewById(R.id.fabaddMain);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fabintent = new Intent(MainActivity.this, PageNewActivity.class);
                startActivity(fabintent);
            }
        });
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent yuintent = new Intent(getApplication(), PageDetailActivity.class);

        String selectedtitle = titles[position];
        String selectedcontent = contents[position];

        yuintent.putExtra("title", selectedtitle);
        yuintent.putExtra("content", selectedcontent);

        startActivity(yuintent);
    }




}