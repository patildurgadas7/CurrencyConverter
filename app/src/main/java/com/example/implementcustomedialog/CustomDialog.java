package com.example.implementcustomedialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
public class CustomDialog extends Dialog {
    TextView editCurrency,ConvertText;
    RadioButton btnUk,btnUSA,btnEURO,btnAUS;
    Button btnOK;
    String string1;
    Context context;

    public CustomDialog(@NonNull Context context, String MainActivityEditText){
        super(context);
        this.context = context;
        string1 = MainActivityEditText;
        setContentView(R.layout.custome_dialog);
        initViews();
        editCurrency.setText(string1);
        initListener();
    }
    public void initViews(){
        editCurrency = findViewById(R.id.editCurrency);
        ConvertText = findViewById(R.id.ConvertText);
        btnOK = findViewById(R.id.btnOK);
        btnUk = findViewById(R.id.btnUK);
        btnUSA = findViewById(R.id.btnUSA);
        btnEURO = findViewById(R.id.btnEURO);
        btnAUS = findViewById(R.id.btnAUS);
    }
    public void initListener (){
        btnUk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double k = Double.parseDouble(editCurrency.getText().toString());

                double k1=k/99;
                ConvertText.setText(k1+"");
            }
        });

        btnUSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double k = Double.parseDouble(editCurrency.getText().toString());

                double k1=k/82;
                ConvertText.setText(k1+"");
            }
        });

        btnEURO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double k = Double.parseDouble(editCurrency.getText().toString());

                double k1=k/87;
                ConvertText.setText(k1+"");
            }
        });
        btnAUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double k = Double.parseDouble(editCurrency.getText().toString());

                double k1=k/11;
                ConvertText.setText(k1+"");
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

    }
}