package com.secore.abdessamad.eloualialami.calculetoographique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class degr extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degr);
        final EditText editText25=(EditText) findViewById(R.id.editText25);
        final EditText editText1=(EditText) findViewById(R.id.editText1);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
        final EditText editText3=(EditText) findViewById(R.id.editText3);
        final EditText editText4=(EditText) findViewById(R.id.editText4);
        final EditText editText5=(EditText) findViewById(R.id.editText5);
        final EditText editText6=(EditText) findViewById(R.id.editText6);
        final EditText editText13=(EditText) findViewById(R.id.editText13);



        Button button=(Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myString ="Entrez les informations requises (: ";
                try {
                    double x1 = Double.parseDouble(editText25.getText().toString());
                    System.out.println(x1);
                    double k = (int) x1;
                    System.out.println(k);
                    double d = x1 - k;
                    System.out.println(d);
                    double minut = d * 60;
                    int mminut = (int) minut;
                    System.out.println("minut" + mminut);
                    editText1.setText((String.valueOf(k + " degree")));
                    editText2.setText((String.valueOf(mminut + " minute")));
                    double s = d * 10;
                    double V = (int) s;
                    double x = (s - V) / 10;
                    double z = x * 3600;
                    int zz = (int) z;
                    System.out.println("scond" + zz);
                    editText3.setText((String.valueOf(zz + "second")));
                    double grad = (x1 * 200) / 180;
                    System.out.println("grad" + grad);
                    double giss = (double) ((int) (grad * 100000)) / 100000;
                    editText4.setText((String.valueOf(giss + "")));

                    int ggrad = (int) grad;
                    System.out.println("grad" + ggrad);
                    editText5.setText((String.valueOf(ggrad + "grad")));
                    double mg = (int) grad;
                    double grr = grad - mg;
                    double mgrad = grr * 100;
                    int mmgrad = (int) mgrad;
                    System.out.println("minut" + mmgrad);
                    editText6.setText((String.valueOf(mmgrad + "Minute")));
                    int secondd = (int) mgrad;
                    double vrsecond = secondd * 10000;
                    int vvrsecond = (int) vrsecond;
                    System.out.println("second" + vvrsecond);
                    editText13.setText((String.valueOf(vvrsecond + "Minute")));

                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
