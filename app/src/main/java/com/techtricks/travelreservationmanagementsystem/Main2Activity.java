package com.techtricks.travelreservationmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    ImageView cover,place_1,place_2,place_3,place_4,place_5,place_6,place_7,place_8;

    String str_1,str_2,str_3,str_4,str_5,str_6,str_7,str_8;
    Drawable image_1,image_2,image_3,image_4,image_5,image_6,image_7,image_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Resources res= getResources();


        cover = (ImageView) findViewById(R.id.cover);

        cover.animate().translationY(-1900).setDuration(800).setStartDelay(300);


        str_1=res.getString(R.string.birishiri);
        image_1 = res.getDrawable(R.drawable.biri1);

        str_2=res.getString(R.string.golapgram);
        image_2 = res.getDrawable(R.drawable.golap);

        str_3=res.getString(R.string.sajek);
        image_3 = res.getDrawable(R.drawable.sajekv);

        str_4=res.getString(R.string.moinot);
        image_4 = res.getDrawable(R.drawable.moinot);

        str_5=res.getString(R.string.cox);
        image_5 = res.getDrawable(R.drawable.bazar1);

        str_6=res.getString(R.string.srimangal);
        image_6 = res.getDrawable(R.drawable.srimangal1);

        str_7=res.getString(R.string.sundarban);
        image_7 = res.getDrawable(R.drawable.sundarban1);

        str_8=res.getString(R.string.sylhet);
        image_8 = res.getDrawable(R.drawable.sylhet1);


        place_1 = (ImageView)findViewById(R.id.place_1);
        place_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_1;
                place.image=image_1;
                place.code="Location Code:"+6092+" Birishiri";
                place.price="Cost:"+2000+" Taka";
                startActivities(new Intent[]{intent});

            }
        });

        place_2 = (ImageView)findViewById(R.id.place_2);
        place_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_2;
                place.image=image_2;
                place.code="Location Code:"+6093+" Golap Gram";
                place.price="Cost:"+500+" Taka";
                startActivities(new Intent[]{intent});

            }
        });

        place_3 = (ImageView)findViewById(R.id.place_3);
        place_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_3;
                place.image=image_3;
                place.code="Location Code:"+6094+" Sajek Valley";
                place.price="Cost:"+5000+" Taka";
                startActivities(new Intent[]{intent});

            }
        });

        place_4 = (ImageView)findViewById(R.id.place_4);
        place_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_4;
                place.image=image_4;
                place.code="Location Code:"+6095+" Moinot Ghat";
                place.price="Cost:"+1000+" Taka";
                startActivities(new Intent[]{intent});

            }
        });
        place_5 = (ImageView)findViewById(R.id.place_5);
       place_5.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_5;
                place.image=image_5;
                place.code="Location Code:"+6096+" Cox's Bazar";
                place.price="Cost:"+6000+" Taka";
                startActivities(new Intent[]{intent});
           }
        });

        place_6 = (ImageView)findViewById(R.id.place_6);
        place_6.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_6;
                place.image=image_6;
                place.code="Location Code:"+6097+" Srimangal";
                place.price="Cost:"+3000+" Taka";
               startActivities(new Intent[]{intent});
            }
        });

        place_7 = (ImageView)findViewById(R.id.place_7);
        place_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_7;
                place.image=image_7;
                place.code="Location Code:"+6098+" Sundarban";
                place.price="Cost:"+4000+" Taka";
                startActivities(new Intent[]{intent});
            }
        });

        place_8 = (ImageView)findViewById(R.id.place_8);
        place_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                place.info=str_8;
                place.image=image_8;
                place.code="Location Code:"+6099+" Sylhet";
                place.price="Cost:"+3500+" Taka";
                startActivities(new Intent[]{intent});
            }
        });


    }

}

