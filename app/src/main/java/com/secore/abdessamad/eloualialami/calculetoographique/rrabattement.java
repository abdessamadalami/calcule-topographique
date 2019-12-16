package com.secore.abdessamad.eloualialami.calculetoographique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;




public class rrabattement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rrabattement);



        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText eeditText5 = (EditText) findViewById(R.id.editText5);

        Bundle br=getIntent().getExtras();
        Bundle bf=getIntent().getExtras();
        Bundle bt=getIntent().getExtras();
        Bundle by=getIntent().getExtras();

        Double xf=br.getDouble("xf");
        Double yf=bf.getDouble("yf");
        Double gis=bt.getDouble("gis");
        Double dis=by.getDouble("dis");

        double xff =(double)((int)(xf*100))/100;
        double yff =(double)((int)(yf*100))/100;
        double giss =(double)((int)(gis*100000))/100000;
        double diss =(double)((int)(dis*100))/100;


        eeditText5.setText((String.valueOf(diss)));
        editText.setText((String.valueOf(giss)));
        editText3.setText((String.valueOf(xff)));
        editText4.setText((String.valueOf(yff)));


    }
}
