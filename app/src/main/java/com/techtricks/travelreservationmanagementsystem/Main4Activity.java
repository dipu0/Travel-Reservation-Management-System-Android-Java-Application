package com.techtricks.travelreservationmanagementsystem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Main4Activity extends RecyclerView.Adapter<Main4Activity.AdaView> {
    String[] a,b,c,d,e,f,g,h,x;
    public Main4Activity(String[] a, String[] b, String[] c, String[] d, String[] e, String[] f,String[] g, String[] h,  String[] x) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.x = x;

    }

    @NonNull
    @Override
    public AdaView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.activity_main4,parent,false);
        return new AdaView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaView holder, int position) {
        String a1=a[position];
        holder.t1.setText(a1);

        String b1=b[position];
        holder.t2.setText(b1);

        String c1=c[position];
        holder.t3.setText(c1);

        String d1=d[position];
        holder.t4.setText(d1);

        String e1=e[position];
        holder.t5.setText(e1);

        String f1=f[position];
        holder.t6.setText(f1);

        String g1=g[position];
        holder.t7.setText(g1);

        String h1=h[position];
        holder.t8.setText(h1);

        String x1=x[position];
        holder.t9.setText(x1);



    }

    @Override
    public int getItemCount() {
        return a.length;
    }

    public class AdaView extends RecyclerView.ViewHolder{
        TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;

        public AdaView(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            t3=itemView.findViewById(R.id.t3);
            t4=itemView.findViewById(R.id.t4);
            t5=itemView.findViewById(R.id.t5);
            t6=itemView.findViewById(R.id.t6);
            t7=itemView.findViewById(R.id.t7);
            t8=itemView.findViewById(R.id.t8);
            t9=itemView.findViewById(R.id.t9);

        }
    }


}
