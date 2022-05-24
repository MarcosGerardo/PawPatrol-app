package com.example.increiblemat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflar=getMenuInflater();
        inflar.inflate(R.menu.menu,menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem opcion){
        switch(opcion.getItemId()){ case
                R.id.itemSumar:
            Toast.makeText(this, "HORA DE SUMAR",
                    Toast.LENGTH_SHORT) .show();
            Intent intencion=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(intencion);
            return true;                      case
                R.id.itemRestar:
            Toast.makeText(this, "VAMOS A RESTAR",
                    Toast.LENGTH_SHORT) .show();
            Intent intencion2=new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(intencion2);
            return true; case
                R.id.ItemComparar:
            Toast.makeText(this, "VAMOS A COMPARAR",
                    Toast.LENGTH_SHORT) .show();
            Intent intencion3=new Intent(getApplicationContext(),MainActivity4.class);
            startActivity(intencion3);
            return true;                      case
                R.id.Item1v1:
            Toast.makeText(this, "1 vs 1",
                    Toast.LENGTH_SHORT) .show();
            Intent intencion4=new Intent(getApplicationContext(),MainActivity5.class);
            startActivity(intencion4);
            default: return super.onOptionsItemSelected(opcion);
        }

    }
}