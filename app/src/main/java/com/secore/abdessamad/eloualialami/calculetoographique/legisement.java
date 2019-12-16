package com.secore.abdessamad.eloualialami.calculetoographique;

import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class legisement extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legisement);


        final EditText editText=(EditText) findViewById(R.id.editText);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
        final EditText editText3=(EditText) findViewById(R.id.editText3);
        final EditText editText4=(EditText) findViewById(R.id.editText4);
        final EditText editText5=(EditText) findViewById(R.id.editText5);
        final EditText editText6=(EditText) findViewById(R.id.editText6);


        Button button=(Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String myString ="Entrez les informations requises (: ";
                try {


                double x1 = Double.parseDouble(editText.getText().toString());
                double y1 = Double.parseDouble(editText2.getText().toString());
                double x2 = Double.parseDouble(editText3.getText().toString());
                double y2 = Double.parseDouble(editText4.getText().toString());

                double z1 = x1 - x2;
                double z2 = y1 - y2;
                double d = Math.sqrt(z2 * z2 + z1 * z1);
                editText5.setText((String.valueOf(d)));
                double g = 200 / 3.141592654 * Math.atan((z1 / z2));
                if (z1 < 0 && z2 < 0) {
                    double G = Math.abs(g) + 200;
                    editText6.setText((String.valueOf(G)));


                }
                if (z1 > 0 && z2 < 0) {
                    double G = 200 - Math.abs(g);
                    editText6.setText((String.valueOf(G)));

                }
                if (z1 < 0 && z2 > 0) {
                    double G = 400 - Math.abs(g);
                    editText6.setText((String.valueOf(G)));

                }
                if (z1 > 0 && z2 > 0) {
                    double G = Math.abs(g);
                    editText6.setText((String.valueOf(G)));

                }


            }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                }
        }



        });

    }
}
