package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText nombre,apellido,telefono,correo;
    Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre=(EditText)findViewById(R.id.nombre);
        apellido=(EditText)findViewById(R.id.apellidos);
        telefono=(EditText)findViewById(R.id.telefono);
        correo =(EditText)findViewById(R.id.correo);
        registro = (Button) findViewById(R.id.btnRegistro);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nombre.getText().toString();
                String ape = apellido.getText().toString();
                String tel = telefono.getText().toString();
                String email = correo.getText().toString();

                Intent i = new Intent(MainActivity2.this, MainActivity3.class);

                i.putExtra("name", name);
                i.putExtra("ape", ape);
                i.putExtra("tel", tel);
                i.putExtra("email", email);

                startActivity(i);
            }
        });


    }

}