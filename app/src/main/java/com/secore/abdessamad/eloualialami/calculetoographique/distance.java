package com.secore.abdessamad.eloualialami.calculetoographique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




import java.text.DecimalFormat;

public class distance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        final EditText editText=(EditText) findViewById(R.id.editText);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
        final EditText editText3=(EditText) findViewById(R.id.editText3);
        final EditText editText4=(EditText) findViewById(R.id.editText4);
        final EditText editText5=(EditText) findViewById(R.id.editText5);



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
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                }

            }
        });




    }
}
