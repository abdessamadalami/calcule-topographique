package com.secore.abdessamad.eloualialami.calculetoographique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class droit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droit);


        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);

        final EditText editText10 = (EditText) findViewById(R.id.editText10);
        final EditText editText8 = (EditText) findViewById(R.id.editText8);
        Button button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("enter les cordonne DE POINT A ");
                String myString ="Entrez les informations requises (: ";
                try {


                    double XA = Double.parseDouble(editText2.getText().toString());
                    double YA = Double.parseDouble(editText3.getText().toString());
                    System.out.println("enter les cordonne DE POINT B ");
                    double XB = Double.parseDouble(editText4.getText().toString());
                    double YB = Double.parseDouble(editText5.getText().toString());
                    System.out.println("enter les gisement ");
                    double Gam = Double.parseDouble(editText8.getText().toString());
                    double Gbm = Double.parseDouble(editText10.getText().toString());
                    double bast = (XA - XB) - (YA - YB) * Math.tan(Gbm * 3.141592653 / 200);
                    double mkam = Math.tan(Gbm * 3.141592653 / 200) * Math.tan(Gam * 3.141592653 / 200);
                    double ym = (bast / mkam) + YA;
                    double xm = (ym - YA) * Math.tan(Gam);
                    System.out.println("xm " + xm);
                    System.out.println("ym" + ym);

                    Intent intent = new Intent(getApplicationContext(), rdroit.class);
                    Bundle br = new Bundle();
                    Bundle bf = new Bundle();
                    br.putDouble("xf", xm);
                    bf.putDouble("yf", ym);
                    intent.putExtras(br);
                    intent.putExtras(bf);
                    startActivity(intent);
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                }

            }
        });





    }
}
