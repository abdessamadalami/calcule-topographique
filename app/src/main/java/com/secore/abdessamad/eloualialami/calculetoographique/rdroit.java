package com.secore.abdessamad.eloualialami.calculetoographique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;




public class rdroit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdroit);

        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        Bundle br=getIntent().getExtras();
        Bundle bf=getIntent().getExtras();
        Bundle bt=getIntent().getExtras();
        Bundle by=getIntent().getExtras();
        Double xf=br.getDouble("xf");
        Double yf=bf.getDouble("yf");
        double xff =(double)((int)(xf*100))/100;
        double yff =(double)((int)(yf*100))/100;
        editText3.setText((String.valueOf(xff)));
        editText4.setText((String.valueOf(yff)));

    }
}
