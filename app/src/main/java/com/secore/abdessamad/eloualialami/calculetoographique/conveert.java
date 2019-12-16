package com.secore.abdessamad.eloualialami.calculetoographique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class conveert extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conveert);
        Button button=(Button) findViewById(R.id.button);

        Button button3=(Button) findViewById(R.id.button3);
        Button button2=(Button) findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), grad.class);
                startActivity(intent);



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), radd.class);
                startActivity(intent);



            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), degr.class);
                startActivity(intent);



            }
        });

    }
}
