package com.techtricks.travelreservationmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText e1, e2, e3, e4, e5, e6,e7;

    String a, b, c, d, e, f, g, h,x;

    int j;

    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    ArrayList<String> add = new ArrayList<>();
    ArrayList<String> number = new ArrayList<>();
    ArrayList<String> bus = new ArrayList<>();
    ArrayList<String> code = new ArrayList<>();
    ArrayList<String> date = new ArrayList<>();
    ArrayList<String> people = new ArrayList<>();
    ArrayList<String> price = new ArrayList<>();


    Button button,button2,button3, button4;

    DatePickerDialog picker;
    EditText eText;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.namebox);
        e2 = (EditText) findViewById(R.id.mailbox);
        e3 = (EditText) findViewById(R.id.addressbox);
        e4 = (EditText) findViewById(R.id.numberbox);
        e5 = (EditText) findViewById(R.id.Vehiclebox);
        e5.setText(place.setBus);
        e6 = (EditText) findViewById(R.id.tourbox);
        e6.setText(place.setPlace);
        e7 = (EditText) findViewById(R.id.people);
        e7.setText(place.setpeople);


        j =name.size();

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                startActivities(new Intent[]{myintent});
            }
        });

        button2 = (Button) findViewById(R.id.booking);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reStoreData();
                getData();
                storeData();

            }
        });
        button3=(Button) findViewById(R.id.home);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(MainActivity.this,Main6Activity.class);
                startActivities(new Intent[]{myintent});
            }
        });

        eText=(EditText) findViewById(R.id.editText1);
        eText.setInputType(InputType.TYPE_NULL);

        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);

                // date picker dialog
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

    }

    public void getData() {


        a = e1.getText().toString();
        b = e2.getText().toString();
        c = e3.getText().toString();
        d = e4.getText().toString();
        e = e5.getText().toString();
        f = e6.getText().toString();
        g=eText.getText().toString();
        h= e7.getText().toString();
        x=place.setPrice;


        name.add(a);
        email.add(b);
        add.add(c);
        number.add(d);
        bus.add(e);
        code.add(f);
        date.add(g);
        people.add(h);
        price.add(x);



    }

    public void storeData() {

        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new
                    File(getFilesDir() + File.separator + "MyFile.txt")));
            for (int i = 0; i < name.size(); i++) {
                Toast.makeText(getApplicationContext(),name.get(i),Toast.LENGTH_LONG).show();
                bufferedWriter.write(name.get(i) + ","
                        + email.get(i) + "," + add.get(i) + "," + number.get(i) + "," + bus.get(i) +
                        "," + code.get(i)+","+date.get(i)+","+people.get(i)+","+price.get(i)+"\n");
            }


            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void reStoreData(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new
                    File(getFilesDir() + File.separator + "MyFile.txt")));
            String read,tm;
            StringBuilder builder = new StringBuilder("");
            while ((read = bufferedReader.readLine()) != null) {
                String[] t=new String[6];
                t=read.split(",");
                tm=t[0];
                name.add(tm);

                tm=t[1];
                email.add(tm);

                tm=t[2];
                add.add(tm);

                tm=t[3];
                number.add(tm);

                tm=t[4];
                bus.add(tm);

                tm=t[5];
                code.add(tm);

                tm=t[6];
                date.add(tm);

                tm=t[7];
                people.add(tm);

                tm=t[8];
                price.add(tm);


                builder.append(read);
            }
            Log.d("Output", builder.toString());
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
