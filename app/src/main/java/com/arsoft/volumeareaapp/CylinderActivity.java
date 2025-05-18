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

public class CylinderActivity extends AppCompatActivity {

    EditText radius, height;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        radius = findViewById(R.id.editTextRadius);
        height = findViewById(R.id.editTextHeight);
        btn = findViewById(R.id.btn1);
        result = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = radius.getText().toString();
                String h = height.getText().toString();

                int r1 = Integer.parseInt(r);
                int h1 = Integer.parseInt(h);

                double volume = 3.14159 * (r1*r1) * h1;

                result.setText("V = "+volume+" m^3");

            }
        });





    }
}