package com.techtricks.travelreservationmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    private RecyclerView rv;
    String tm;
    String[] a={"A"}, b={"A"}, c={"A"}, d={"A"} , e={"A"} , f={"A"} , g={"A"},h={"A"},x={"A"} ;

    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    ArrayList<String> add = new ArrayList<>();
    ArrayList<String> number = new ArrayList<>();
    ArrayList<String> bus = new ArrayList<>();
    ArrayList<String> code = new ArrayList<>();
    ArrayList<String> date = new ArrayList<>();
    ArrayList<String> people = new ArrayList<>();
    ArrayList<String> price = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new
                    File(getFilesDir() + File.separator + "MyFile.txt")));
            String read;
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

        a=new String[name.size()];
        b=new String[name.size()];
        c=new String[name.size()];
        d=new String[name.size()];
        e=new String[name.size()];
        f=new String[name.size()];
        g=new String[name.size()];
        h=new String[name.size()];
        x=new String[name.size()];


        for(int i=0;i<name.size();i++){
            tm=name.get(i);
            a[i]=tm;

            tm=email.get(i);
            b[i]=tm;

            tm=add.get(i);
            c[i]=tm;

            tm=number.get(i);
            d[i]=tm;

            tm=bus.get(i);
            e[i]=tm;

            tm=code.get(i);
            f[i]=tm;

            tm=date.get(i);
            g[i]=tm;

            tm=people.get(i);
            h[i]=tm;

            tm=price.get(i);
            x[i]=tm;


        }

        rv = findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new Main4Activity(a, b, c, d, e, f, g, h, x));



    }
}
