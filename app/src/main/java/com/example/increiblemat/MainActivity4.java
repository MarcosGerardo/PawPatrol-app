package com.example.increiblemat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    int var1,var2,var3,var4,var5,res1,res2,res3,res4,reke;
    Button bt1,bt2,bt3;
    android.widget.TextView textView1,textView2,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView1=findViewById(R.id.textView5);
        textView2=findViewById(R.id.textView6);
        textView4=findViewById(R.id.textView7);
        textView5=findViewById(R.id.textView11);
        bt1=findViewById(R.id.btn7);
        bt2=findViewById(R.id.btn8);
        bt3=findViewById(R.id.btn9);
        aleatorios();
        botones();

    }
    public void aleatorios(){
        var1 = (int) Math.floor(Math.random()* (11-5)+5);
        var2 = (int) Math.floor(Math.random()*(10-1+1)+1);
        String VAR1 = Integer.toString(var1);
        String VAR2 = Integer.toString(var2);
        textView1.setText(VAR1);
        textView2.setText(VAR2);

    }
   public void botones(){
bt1.setOnClickListener(new View.OnClickListener(){
public void onClick(View v) {
    CharSequence  value1 = textView1.getText();
    CharSequence  value2 = textView2.getText();
    int num1 = Integer.parseInt(value1.toString());
    int num2 = Integer.parseInt(value2.toString());
    if (num1 <= num2) {
        textView5.setText(bt1.getText());
        textView4.setText(bt1.getText());
        Toast acierto1 = Toast.makeText(getApplicationContext(), "BIEN!", Toast.LENGTH_LONG);
        acierto1.show();
    }else{
        textView5.setText(bt1.getText());
        textView4.setText(bt1.getText());
        //textView4.setTextColor(192);
        Toast acierto1 = Toast.makeText(getApplicationContext(), "MAL );", Toast.LENGTH_LONG);
        acierto1.show();
    }

  }
  });
 bt2.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
     CharSequence  value1 = textView1.getText();
     CharSequence  value2 = textView2.getText();
     int num1 = Integer.parseInt(value1.toString());
     int num2 = Integer.parseInt(value2.toString());
     if (num1 >= num2) {
         textView5.setText(bt2.getText());
         Toast acierto1 = Toast.makeText(getApplicationContext(), "BIEN!", Toast.LENGTH_LONG);
         acierto1.show();
     }else{
         textView5.setText(bt2.getText());
         textView4.setText(bt2.getText());
        // textView4.setTextColor(192);
         Toast acierto1 = Toast.makeText(getApplicationContext(), "MAL );", Toast.LENGTH_LONG);
         acierto1.show();
     }

}
 });
 bt3.setOnClickListener(new View.OnClickListener(){
public void onClick(View v) {
    CharSequence  value1 = textView1.getText();
    CharSequence  value2 = textView2.getText();
    int num1 = Integer.parseInt(value1.toString());
    int num2 = Integer.parseInt(value2.toString());
    if (num1 == num2) {
        textView5.setText(bt3.getText());
        Toast acierto1 = Toast.makeText(getApplicationContext(), "BIEN!", Toast.LENGTH_LONG);
        acierto1.show();
    }else{
        Toast acierto1 = Toast.makeText(getApplicationContext(), "MAL );", Toast.LENGTH_LONG);
        acierto1.show();
        textView5.setText(bt3.getText());
        textView4.setText(bt3.getText());
      //  textView4.setTextColor(192);
    }

  }

});
}

}