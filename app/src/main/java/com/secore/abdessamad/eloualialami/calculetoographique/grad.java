package com.secore.abdessamad.eloualialami.calculetoographique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class grad extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grad);

        final EditText editText=(EditText) findViewById(R.id.editText);

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
                System.out.println("enter L'angle en GRad");
                double x1=Double.parseDouble(editText.getText().toString());
                System.out.println(x1);
                int gra=(int)x1;
                System.out.println(gra);
                double gisss =(double)((int)(x1*100000))/100000;
                editText2.setText((String.valueOf(gisss)));
                editText3.setText((String.valueOf(gra+" grad")));
                double g=x1-gra;
                double mg=g*100;
                int mmg=(int)mg;
                System.out.println("mintur grad   "+mmg);
                double sg=g*10000;
                int ssg=(int)sg;
                System.out.println("second grad   "+ssg);
                editText4.setText((String.valueOf(mmg+" minute")));
                editText5.setText((String.valueOf(ssg+" second")));

                System.out.println("Degreé");
                double dg=(x1*180)/200;
                System.out.println("mi  "+dg);
                double giss =(double)((int)(dg*100000))/100000;
                editText6.setText((String.valueOf(giss)));
                double ddg=(int)dg;
                System.out.println(ddg);
                double vvv=dg-ddg;
                System.out.println(vvv);
                editText7.setText((String.valueOf(ddg+" Degré")));
                double minut=vvv*60;
                int mminut=(int)minut;
                System.out.println("minut"+mminut);
                editText8.setText((String.valueOf(mminut+" Minute")));
                double s=vvv*10;
                double V=(int)s;
                double x=(s-V)/10;
                double z=x*3600;
                int zz=(int)z;
                System.out.println("secondd"+zz);
                editText9.setText((String.valueOf(zz+" second")));
            }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
