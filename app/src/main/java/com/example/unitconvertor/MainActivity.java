package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private Button cmtom, mtocm, gtokg, kgtog;
        private TextView result;
        private EditText value;

        double result0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cmtom=findViewById(R.id.cmtom);
        mtocm=findViewById(R.id.mtocm);
        gtokg=findViewById(R.id.gtokg);
        kgtog=findViewById(R.id.kgtog);
        result=findViewById(R.id.result);
        value=findViewById(R.id.value);
        cmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double values=Double.parseDouble(value.getText().toString());
                result0 = (values/100);
                result.setText(String.valueOf(result0+"m"));
            }
        });
        mtocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double values=Double.parseDouble(value.getText().toString());
                result0 = (values*100);
                result.setText(String.valueOf(result0+"cm"));
            }
        });
        gtokg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double values=Double.parseDouble(value.getText().toString());
                result0 = (values/1000);
                result.setText(String.valueOf(result0+"kg"));
            }
        });
        kgtog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double values=Double.parseDouble(value.getText().toString());
                result0 = (values*1000);
                result.setText(String.valueOf(result0+"gm"));
            }
        });
    }
}