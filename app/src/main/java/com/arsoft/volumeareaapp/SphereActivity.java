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

public class SphereActivity extends AppCompatActivity {

    EditText sphereRadius;
    TextView title, result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereRadius = findViewById(R.id.editTextSphere);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphereRadius.getText().toString();

                int r = Integer.parseInt(radius);

                double volume = (4/3) * 3.14159 * (r*r*r);
                result.setText("V = "+volume+" m^3");

            }
        });


    }
}