package com.arsoft.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapeArrayList;
    Context context;

    public MyCustomAdapter (ArrayList<Shape> shapeArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    // View Holder
    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImage;
    }

    // GetView()


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 1- Get the shape object for the current position
        Shape shape = getItem(position);

        // 2- Inflating Layout
        MyViewHolder myViewHolder;


        final View result;

        if (convertView == null){
            // No view went off-screen --> Create a new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            // Finding the Views
            myViewHolder.shapeName = convertView.findViewById(R.id.textView);
            myViewHolder.shapeImage = convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);

            result = convertView;

        }else {
            // a view went off-screen --> re-use it

            myViewHolder = (MyViewHolder) convertView.getTag();

            result = convertView;


        }

        myViewHolder.shapeName.setText(shape.getShapeName());
        myViewHolder.shapeImage.setImageResource(shape.getShapeImg());



        return result;

    }
}
