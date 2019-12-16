package com.secore.abdessamad.eloualialami.calculetoographique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class rlevemnt extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rlevemnt);

        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final EditText editText6 = (EditText) findViewById(R.id.editText6);
        final EditText editText7 = (EditText) findViewById(R.id.editText7);
        final EditText editText8 = (EditText) findViewById(R.id.editText8);
        final EditText editText10 = (EditText) findViewById(R.id.editText10);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                System.out.println("enter les cordonne DE POINT A ");

                double XA = Double.parseDouble(editText2.getText().toString());
                double YA = Double.parseDouble(editText3.getText().toString());
                System.out.println("enter les cordonne DE POINT B ");

                double XB = Double.parseDouble(editText4.getText().toString());
                double YB = Double.parseDouble(editText5.getText().toString());
                System.out.println("enter les cordonne DE POINT C ");

                double XC = Double.parseDouble(editText6.getText().toString());
                double YC = Double.parseDouble(editText7.getText().toString());
                System.out.println("enter les angles ");
                System.out.println("enter alfa ");
                double alf = Double.parseDouble(editText8.getText().toString());

                System.out.println("enter bita ");
                double bit = Double.parseDouble(editText10.getText().toString());

                double dx1 = XB - XA;
                double dy1 = YB - YA;
                double b = Math.sqrt(dx1 * dx1 + dy1 * dy1);
                double dx2 = XC - XA;
                double dy2 = YC - YA;
                double a = Math.sqrt(dx2 * dx2 + dy2 * dy2);
                double ggo = giism(  dx2,dy2);
                double ggu = gism(  dx1,  dy1);
                double A = ANGLE(ggo, ggu);
                double anA = A;
                double vv = (b * Math.sin(alf * 3.141592653 / 200));
                double vvv = (a * Math.sin(bit * 3.141592653 / 200));
                double fi = (vv / vvv);
                double fie = 200 / 3.141592654 * Math.atan(fi);
                double xy2 = ((400 - (alf + bit + anA)) / 2);
                System.out.println("x+y2    " + xy2);
                double rr = 50;
                double yx = (Math.tan((fie - rr) * 3.141592653 / 200)) * (Math.tan(xy2 * 3.141592653 / 200));
                System.out.println("yx           " + yx);
                double y2x = 200 / 3.141592654 * Math.atan(yx);
                System.out.println("y_x           " + y2x);
                double X = xy2 + y2x;
                double x = (X);
                double Y = xy2 - y2x;
                double y = (Y);
                System.out.println("x" + x);
                System.out.println("y" + y);
                double ma = Math.sin(x * 3.141592653 / 200) * a / (Math.sin(alf * 3.141592653 / 200));
                double MA = Math.sin(y * 3.141592653 / 200) * b / (Math.sin(bit));

                double tita = 200 - (x + alf);
                double land = 200 - (y + bit);
                double gisM = ggo - tita;


                double xf = XA + ma * Math.sin(gisM * 3.141592653 / 200);
                double yf = YA + ma * Math.cos(gisM * 3.141592653 / 200);
                System.out.println(xf);
                System.out.println(yf);
                Intent intent=new Intent(getApplicationContext(), rrlevment.class);
                Bundle br= new Bundle();
                Bundle bf= new Bundle();
                Bundle bt= new Bundle();
                Bundle by= new Bundle();
                br.putDouble("xf",xf);
                bf.putDouble("yf",yf);
                bt.putDouble("gis",gisM);
                by.putDouble("dis",ma);

                intent.putExtras(br);
                intent.putExtras(bf);
                intent.putExtras(bt);
                intent.putExtras(by);
                startActivity(intent);



            }

            private double ANGLE(double ggo, double ggu) {
                double anglea = ggo - ggu;
                if (anglea < 0) {

                    double a = anglea + 400;
                    return a;
                } else {
                    return anglea;
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

            private double giism( double dx2,double dy2) {
                double GAC = 200 / 3.141592654 * Math.atan((dx2 / dy2));
                if (dx2 < 0 && dy2 < 0) {
                    double Gac = Math.abs(GAC) + 200;

                    System.out.println(Gac);
                    return Gac;

                } else if (dx2 > 0 && dy2 < 0) {

                    double Gac = 200 - Math.abs(GAC);

                    System.out.println(Gac);
                    return Gac;
                } else if (dx2 < 0 && dy2 > 0) {

                    double Gac = 400 - Math.abs(GAC);

                    System.out.println(Gac);
                    return Gac;

                } else if (dx2 > 0 && dy2 > 0) {

                    double Gac = Math.abs(GAC);

                    System.out.println(Gac);

                    return Gac;
                } else {
                    System.out.println("enter les cordonne DE POINT A ");
                    return 0;
                }



            }
        });

    }
}
