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

public class CubeActivity extends AppCompatActivity {

    EditText side;
    TextView title, result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        side = findViewById(R.id.editTextSphere);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String side1 = side.getText().toString();

                int a = Integer.parseInt(side1);

                double volume = a*a*a;

                result.setText("V = "+volume+" m^3");


            }
        });


    }
}