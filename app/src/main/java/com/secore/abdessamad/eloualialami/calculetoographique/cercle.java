package com.secore.abdessamad.eloualialami.calculetoographique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class cercle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cercle);

        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final EditText editText7 = (EditText) findViewById(R.id.editText7);

        final EditText editText8 = (EditText) findViewById(R.id.editText8);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String myString ="Entrez les informations requises (: ";
                try {

                    System.out.println("enter les cordonne DE POINT O1 ");

                    double XO1 = Double.parseDouble(editText2.getText().toString());
                    double YO1 = Double.parseDouble(editText3.getText().toString());
                    System.out.println("enter les cordonne DE POINT O2 ");

                    double XO2 = Double.parseDouble(editText4.getText().toString());
                    double YO2 = Double.parseDouble(editText5.getText().toString());
                    System.out.println("R1 ");
                    double r1 = Double.parseDouble(editText7.getText().toString());
                    System.out.println("R2");
                    double r2 = Double.parseDouble(editText8.getText().toString());
                    double dx1 = XO2 - XO1;
                    double dy1 = YO2 - YO1;
                    double b = Math.sqrt(dx1 * dx1 + dy1 * dy1);
                    double alfa = (b * b) + (r1 * r1) - (r2 * r2);
                    double bita = 2 * b * r1;
                    double fie = 200 / 3.141592654 * Math.acos(alfa / bita);

                    double ggu = gism(dx1, dy1);

                    double gis = ggu - fie;

                    double xf = XO1 + r1 * Math.sin(gis * 3.141592653 / 200);
                    double yf = YO1 + r1 * Math.cos(gis * 3.141592653 / 200);
                    System.out.println(xf);
                    System.out.println(yf);
                    Intent intent = new Intent(getApplicationContext(), rcercle.class);
                    Bundle br = new Bundle();
                    Bundle bf = new Bundle();

                    br.putDouble("xf", xf);
                    bf.putDouble("yf", yf);


                    intent.putExtras(br);
                    intent.putExtras(bf);

                    startActivity(intent);
                }
                catch (Exception e){
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
