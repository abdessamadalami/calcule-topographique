package com.secore.abdessamad.eloualialami.calculetoographique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class rabattment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabattment);


        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final EditText editText9 = (EditText) findViewById(R.id.editText9);
        final EditText editText7 = (EditText) findViewById(R.id.editText7);
        final EditText editText8 = (EditText) findViewById(R.id.editText8);
        final EditText editText10 = (EditText) findViewById(R.id.editText10);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myString ="Entrez les informations requises (: ";
                try {

                    System.out.println("enter les cordonne DE POINT R1 ");

                    double XR1 = Double.parseDouble(editText2.getText().toString());
                    double YR1 = Double.parseDouble(editText3.getText().toString());
                    System.out.println("enter les cordonne DE POINT R2 ");

                    double XR2 = Double.parseDouble(editText4.getText().toString());
                    double YR2 = Double.parseDouble(editText5.getText().toString());
                    System.out.println("LA DESTANCE a ");
                    double a = Double.parseDouble(editText7.getText().toString());
                    System.out.println("enter les angles ");
                    System.out.println("enter alfa ");
                    double alf = Double.parseDouble(editText8.getText().toString());
                    System.out.println("enter bita ");
                    double bit = Double.parseDouble(editText9.getText().toString());
                    System.out.println("enter fi");
                    double fi = Double.parseDouble(editText10.getText().toString());

                    double dx1 = XR1 - XR2;
                    double dy1 = YR1 - YR2;
                    double D = Math.sqrt(dx1 * dx1 + dy1 * dy1);
                    double ggu = gism(dx1, dy1);

                    double land = 200 - (alf + bit);
                    double b = (a * Math.sin(bit * 3.141592653 / 200) / Math.sin(land * 3.141592653 / 200));
                    double sipsi = ((b * Math.sin(fi * 3.141592653 / 200)) / D);
                    double ipsi = 200 / 3.141592654 * Math.asin(sipsi);
                    double tita = 200 - (ipsi + fi);
                    double GR1S1 = ggu + tita;
                    double XS1 = XR2 + b * Math.sin(GR1S1 * 3.141592653 / 200);
                    double YS1 = YR2 + b * Math.cos(GR1S1 * 3.141592653 / 200);
                    System.out.println(XS1);
                    System.out.println(YS1);


                    Intent intent = new Intent(getApplicationContext(), rrabattement.class);
                    Bundle br = new Bundle();
                    Bundle bf = new Bundle();
                    Bundle bt = new Bundle();
                    Bundle by = new Bundle();
                    br.putDouble("xf", XS1);
                    bf.putDouble("yf", YS1);
                    bt.putDouble("gis", GR1S1);
                    by.putDouble("dis", b);
                    intent.putExtras(br);
                    intent.putExtras(bf);
                    intent.putExtras(bt);
                    intent.putExtras(by);
                    startActivity(intent);
                }
                catch (Exception  e){
                    Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                }


            }

            private double gism(double dx1, double dy1) {
                double GAB = 200 / 3.141592654 * Math.atan((dx1 / dy1));

                if (dx1 < 0 && dy1 < 0) {
                    double Gab = Math.abs(GAB) + 200;

                    System.out.println(Gab);
                    return Gab;

                } else if (dx1 > 0 && dy1 < 0) {
                    double Gab = 200 - Math.abs(GAB);

                    System.out.println(Gab);
                    return Gab;

                } else if (dx1 < 0 && dy1 > 0) {
                    double Gab = 400 - Math.abs(GAB);

                    System.out.println(Gab);
                    return Gab;

                } else if (dx1 > 0 && dy1 > 0) {
                    double Gab = Math.abs(GAB);

                    System.out.println(Gab);
                    return Gab;

                } else {
                    return 0;
                }


            }
        });

    }
}
