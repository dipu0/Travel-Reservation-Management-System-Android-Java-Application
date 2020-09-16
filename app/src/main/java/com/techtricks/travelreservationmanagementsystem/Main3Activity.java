package com.techtricks.travelreservationmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import static com.techtricks.travelreservationmanagementsystem.place.code;
import static com.techtricks.travelreservationmanagementsystem.place.image;
import static com.techtricks.travelreservationmanagementsystem.place.info;
import static com.techtricks.travelreservationmanagementsystem.place.price;

public class Main3Activity extends AppCompatActivity {

    Button button2,button4,b5,b6,b7,p1,p2,p5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView text_view = (TextView) findViewById(R.id.text_view1);
        TextView text_view2 = (TextView) findViewById(R.id.place_code);
        TextView text_view3 = (TextView) findViewById(R.id.place_price);

        ImageView Image=(ImageView) findViewById(R.id.infoimage1);
        ScrollView scrollView;

        Image.setImageDrawable(image);
        text_view.setText(info);
        text_view2.setText(code);
        text_view3.setText(price);

        text_view.setMovementMethod(new ScrollingMovementMethod());



        button2=(Button) findViewById(R.id.book);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(Main3Activity.this,MainActivity.class);
                place.setPlace=code;
                startActivities(new Intent[]{myintent});
            }
        });

        button4=(Button) findViewById(R.id.home);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(Main3Activity.this,Main6Activity.class);

                startActivities(new Intent[]{myintent});
            }
        });


        b5=(Button) findViewById(R.id.bus);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                place.setBus="Bus";

            }
        });

        b6=(Button) findViewById(R.id.train);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                place.setBus="Train";

            }
        });

        b7=(Button) findViewById(R.id.air);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                place.setBus="Air";

            }
        });

        p1=(Button) findViewById(R.id.s1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                place.setpeople="Single";
                place.setPrice= ""+price+"X"+1;

            }
        });

        p2=(Button) findViewById(R.id.s2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                place.setpeople="Couple";
                place.setPrice= ""+price+"X"+2;

            }
        });


        p5=(Button) findViewById(R.id.s5);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                place.setpeople="Quintuple(5)";
                place.setPrice= ""+price+"X"+5;

            }
        });

    }

}

