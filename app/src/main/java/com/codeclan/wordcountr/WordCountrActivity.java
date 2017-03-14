package com.codeclan.wordcountr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountrActivity extends AppCompatActivity {

    EditText textToBeCounted;
    Button countButton;
    TextView enteredText;
    TextView wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_countr);

        textToBeCounted = (EditText)findViewById(R.id.text_to_be_counted)

    }
}
