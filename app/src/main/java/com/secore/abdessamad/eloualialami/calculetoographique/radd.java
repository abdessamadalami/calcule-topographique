package com.secore.abdessamad.eloualialami.calculetoographique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class radd extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radd);

        final EditText editText=(EditText) findViewById(R.id.editText);
        final EditText editText1=(EditText) findViewById(R.id.editText1);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
        final EditText editText3=(EditText) findViewById(R.id.editText3);
        final EditText editText4=(EditText) findViewById(R.id.editText4);
        final EditText editText5=(EditText) findViewById(R.id.editText5);
        final EditText editText6=(EditText) findViewById(R.id.editText6);
        final EditText editText7=(EditText) findViewById(R.id.editText7);
        final EditText editText8=(EditText) findViewById(R.id.editText8);
        final EditText editText9=(EditText) findViewById(R.id.editText9);
        Button button=(Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myString ="Entrez les informations requises (: ";
                try {

                    double x1 = Double.parseDouble(editText.getText().toString());
                    double j = Math.toDegrees(x1);
                    System.out.println(j);
                    double k = (int) j;
                    System.out.println(k);
                    double d = j - k;
                    System.out.println(d);
                    double minut = d * 60;
                    int mminut = (int) minut;
                    System.out.println("minut" + mminut);
                    double gss = (double) ((int) (j * 100000)) / 100000;
                    editText2.setText((String.valueOf(gss + "")));
                    editText3.setText((String.valueOf(k + "degree")));
                    editText4.setText((String.valueOf(mminut + " minute")));
                    double s = d * 10;
                    double V = (int) s;
                    double x = (s - V) / 10;
                    double z = x * 3600;
                    int zz = (int) z;
                    System.out.println("scond" + zz);
                    editText5.setText((String.valueOf(zz + "second")));
                    double grad = (j * 200) / 180;
                    double giss = (double) ((int) (grad * 100000)) / 100000;
                    System.out.println("grad" + grad);
                    editText6.setText((String.valueOf(giss + "")));

                    int ggrad = (int) grad;
                    System.out.println("grad" + ggrad);
                    editText7.setText((String.valueOf(ggrad + "grad")));
                    double mg = (int) grad;
                    double grr = grad - mg;
                    double mgrad = grr * 100;
                    int mmgrad = (int) mgrad;
                    System.out.println("minut" + mmgrad);
                    editText8.setText((String.valueOf(mmgrad + "Minute")));
                    int secondd = (int) mgrad;
                    double vrsecond = secondd * 10000;
                    int vvrsecond = (int) vrsecond;
                    System.out.println("second" + vvrsecond);
                    editText9.setText((String.valueOf(vvrsecond + "Minute")));

                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
