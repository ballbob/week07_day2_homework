package com.codeclan.wordcountr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountrActivity extends AppCompatActivity {

    EditText enteredEditText;
    Button countButton;
    TextView entered_text;
    TextView word_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_countr);

        entered_text = (EditText)findViewById(R.id.entered_text);
        enteredEditText = (EditText)findViewById(R.id.entered_text);
        countButton = (Button)findViewById(R.id.count_button);
        word_count = (TextView)findViewById(R.id.word_count);

    }

    public void onCountButtonClicked(View button){
        String entered_text = enteredEditText.getText().toString();

        Intent intent = new Intent(this, CountedActivity.class);
        intent.putExtra("entered_text",entered_text);

        startActivity(intent);
    }
}
