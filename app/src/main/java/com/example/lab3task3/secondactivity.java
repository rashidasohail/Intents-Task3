package com.example.lab3task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class secondactivity extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        editText=(EditText) findViewById(R.id.editText);
    }

    public void submit_btn(View v){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("Message", editText.getText().toString());
        setResult(RESULT_OK,returnIntent);
        finish();

    }
}