package com.codeclan.wordcountr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CountedActivity extends AppCompatActivity {

    TextView enteredText;
    TextView wordCount;
    Integer result;
    WordCount wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counted);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String entered_text = extras.getString("entered_text");


        enteredText= (TextView)findViewById(R.id.entered_text);
        enteredText.setText(entered_text);

        wordCounter = new WordCount();
        wordCount = (TextView)findViewById(R.id.word_count);
        result = wordCounter.wordCount(entered_text);
        wordCount.setText(result);
    }
}
