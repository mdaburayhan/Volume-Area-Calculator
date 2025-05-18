package com.arsoft.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrismActivity extends AppCompatActivity {

    EditText base, height;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        base = findViewById(R.id.editTextRadius);
        height = findViewById(R.id.editTextHeight);
        btn = findViewById(R.id.btn1);
        result = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = base.getText().toString();
                String h = height.getText().toString();

                int b1 = Integer.parseInt(b);
                int h1 = Integer.parseInt(h);


                double volume =  b1*h1;

                result.setText("V = "+volume+" m^3");


            }
        });



    }
}