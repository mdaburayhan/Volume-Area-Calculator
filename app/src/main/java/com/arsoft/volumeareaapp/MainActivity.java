package com.arsoft.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1- AdapterView: GridView
    GridView gridView;

    // 2- Data Source
    ArrayList<Shape> shapeArrayList;

    // 3- Adapter: My CustomAdapter
    MyCustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapeArrayList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.sphere, "Sphere");
        Shape s2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape s3 = new Shape(R.drawable.cube, "Cube");
        Shape s4 = new Shape(R.drawable.prism, "Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);


        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;

                switch (position){
                    case 0:
                        i = new Intent(getApplicationContext(), SphereActivity.class);
                        break;
                    case 1:
                        i = new Intent(getApplicationContext(), CylinderActivity.class);
                        break;
                    case 2:
                        i = new Intent(getApplicationContext(), CubeActivity.class);
                        break;
                    case 3:
                        i = new Intent(getApplicationContext(), PrismActivity.class);
                        break;
                    default:
                        return;
                }
                startActivity(i);

            }
        });



    }
}