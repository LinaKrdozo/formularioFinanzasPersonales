package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView datoNombre,datoApellidos,datoTelefono,datoCorreo;
    Button btnOk;
    Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        datoNombre = (TextView)findViewById(R.id.datoNombre);
        datoApellidos = (TextView)findViewById(R.id.datoApellidos);
        datoTelefono = (TextView)findViewById(R.id.datoTelefono);
        datoCorreo = (TextView)findViewById(R.id.datoCorreo);
        btnOk = (Button)findViewById(R.id.btnOK);
        btnSalir =(Button)findViewById(R.id.btnSalir);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        mostrarDatos();


    }

    private void mostrarDatos(){
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String apellido = datos.getString("ape");
        String telefono = datos.getString("tel");
        String correo = datos.getString("email");

        datoNombre.setText(nombre);
        datoApellidos.setText(apellido);
        datoTelefono.setText(telefono);
        datoCorreo.setText(correo);
    }


}