package com.example.a2laboratorinisdarbasft2023;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a2laboratorinisdarbasft2023.extra.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spCountingOptions;
    private EditText edMain;
    private TextView tvResult;
    private String wordsSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.tvResult = (TextView) findViewById(R.id.tvResult);
        this.edMain = (EditText) findViewById(R.id.edMain);
        this.spCountingOptions = (Spinner) findViewById(R.id.spCountingOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOptions.setAdapter(adapter);
    }

    public void btnCountOnClick(View view) {
        String userInput = this.edMain.getText().toString();
        String selectedOption = spCountingOptions.getSelectedItem().toString();
        if(selectedOption.equalsIgnoreCase(getResources().getString(R.string.chars_selection))){
            this.tvResult.setText(String.valueOf(userInput.length()));
        }
        else{
            Toast.makeText(getApplicationContext(), "Not implemented", Toast.LENGTH_LONG).show();
        }
        if(selectedOption.equalsIgnoreCase(getResources().getString(R.string.chars_selection)));
        else{
            if(this.spCountingOptions.getSelectedItem().toString().equalsIgnoreCase(wordsSelected)){
                int wordsCount = TextCounter.getWordsCount(this.edMain.getText().toString());
                String wordsCountFormatted = String.valueOf(wordsCount);
                this.tvResult.setText(wordsCountFormatted);
            }


    }
}}