package com.example.increiblemat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
int var1,var2,var3,var4,var5,res1,res2,res3,res4;
Button bt1,bt2,bt3;
android.widget.TextView textView1,textView2,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1=findViewById(R.id.textView2);
        textView2=findViewById(R.id.textView3);
        textView4=findViewById(R.id.tv4);
        bt1=findViewById(R.id.button2);
        bt2=findViewById(R.id.button3);
        bt3=findViewById(R.id.button4);
        aleatorios();
        ordenbtns();

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView4.setText(bt1.getText());
                if (textView4.getText() == Integer.toString(res1)) {

                    Toast acierto1 = Toast.makeText(getApplicationContext(), "BIEN! \n.n/", Toast.LENGTH_SHORT);
                    acierto1.show();
                } else {

                    Toast acierto1 = Toast.makeText(getApplicationContext(), "MAL );", Toast.LENGTH_SHORT);
                    acierto1.show();
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                textView4.setText(bt2.getText());
                if (textView4.getText() == Integer.toString(res1)) {

                    Toast acierto1 = Toast.makeText(getApplicationContext(), "BIEN! \n.n/", Toast.LENGTH_SHORT);
                    acierto1.show();
                } else {

                    Toast acierto1 = Toast.makeText(getApplicationContext(), "MAL );", Toast.LENGTH_SHORT);
                    acierto1.show();
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                textView4.setText(bt3.getText());
                if (textView4.getText() == Integer.toString(res1)) {

                    Toast acierto1 = Toast.makeText(getApplicationContext(), "BIEN! ", Toast.LENGTH_SHORT);
                    acierto1.show();
                } else {

                    Toast acierto1 = Toast.makeText(getApplicationContext(), "MAL );", Toast.LENGTH_SHORT);
                    acierto1.show();
                }
            }
        });

    }

    public void ordenbtns(){
        String VAR3 = Integer.toString(res4);
        String VAR4 = Integer.toString(res3);
        String VAR5 = Integer.toString(res2);
        String resultado = String.valueOf(res1);
        if(res1<=15){
            bt1.setText(resultado);
            bt2.setText(VAR4);
            bt3.setText(VAR3);
        }else{
            bt1.setText(VAR5);
            bt3.setText(VAR4);
            bt2.setText(resultado);
        }if(res1>=30){
            bt1.setText(VAR3);
            bt2.setText(VAR4);
            bt3.setText(resultado);
        }
    }
    public void aleatorios(){
        var1 = (int) Math.floor(Math.random()*(10-1+1)+1);
        var2 = (int) Math.floor(Math.random()*(10-1+1)+1);
        var3 = (int) Math.floor(Math.random()*(10-1+1)+1);
        var4 = (int) Math.floor(Math.random()*(10-1+1)+1);
        var5 = (int) Math.floor(Math.random()*(10-1+1)+1);
        res1=var1+var2;
        res2=Math.abs(res1-5);
        res3=Math.abs(res1-2);
        res4=Math.abs(res1-7);
        String VAR1 = Integer.toString(var1);
        String VAR2 = Integer.toString(var2);

        textView1.setText(VAR1);
        textView2.setText(VAR2);
    }
}