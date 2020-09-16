package com.techtricks.travelreservationmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main6Activity extends AppCompatActivity {
    Dialog myDialog;
    Button button,button2,button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        myDialog = new Dialog(this);

        button = (Button) findViewById(R.id.place);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(Main6Activity.this,Main2Activity.class);
                startActivities(new Intent[]{myintent});
            }
        });

        button2 = (Button) findViewById(R.id.booking);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent=new Intent(Main6Activity.this,MainActivity.class);
                startActivities(new Intent[]{myintent});

            }
        });

        button3 = (Button) findViewById(R.id.list);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(Main6Activity.this, Main5Activity.class);
                startActivities(new Intent[]{myintent});
            }
        });

        button4 = (Button) findViewById(R.id.clr);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    delete_data();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

            }
        });


    }


    public void delete_data() throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(getFilesDir() + File.separator + "MyFile.txt");
        writer.print("");
        writer.close();
    }

    public void ShowPopup(View v) {
        TextView txtclose;
        Button btnFb,btnLn,btnGh;
        myDialog.setContentView(R.layout.about_popup);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

        txtclose.setText("X");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        btnFb = (Button) myDialog.findViewById(R.id.fb);
        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/c.dipu0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnLn = (Button) myDialog.findViewById(R.id.Ln);
        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/md-asad-chowdhury-dipu-38a618147/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnGh = (Button) myDialog.findViewById(R.id.github);
        btnGh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/dipu0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}




