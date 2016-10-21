package com.lovecoding.recyclerviewdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailDictionaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dictionary);

        Intent intent = getIntent();
        String words = intent.getStringExtra("word");
        String difinitions = intent.getStringExtra("difinition");

        TextView word = (TextView) findViewById(R.id.tvWordDetail);
        TextView difinition = (TextView) findViewById(R.id.tvDifinitionDetail);
        word.setText(words);
        difinition.setText(difinitions);

    }

}
