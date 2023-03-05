package com.example.implementcustomedialog;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText enterCurrency;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListener();
    }
    private void initViews(){
        enterCurrency = findViewById(R.id.enterCurrency);
        btnConvert = findViewById(R.id.btnConvert);
    }
    private void initListener(){
        btnConvert.setOnClickListener(view -> {
            CustomDialog customDialog = new CustomDialog(this,enterCurrency.getText().toString());
            customDialog.show();
        });
    }
}