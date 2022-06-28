package com.example.app2_edadcanina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app2_edadcanina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);

        EditText txt_edad = findViewById(R.id.txt_edad);
        TextView txt_resultado = findViewById(R.id.txt_resultado);
        Button btn_calcular = findViewById(R.id.btn_calcular); */

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        EditText txt_edad = findViewById(R.id.txt_edad);
        TextView txt_resultado = findViewById(R.id.txt_resultado);
        Button btn_calcular = findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edad = txt_edad.getText().toString();
                if (!edad.isEmpty()){
                    int resultado = Integer.parseInt(edad) * 7;
                    String msg_resultado= "LA EDAD DE TU GATO ES: "+resultado+" AÑOS HUMANOS";
                    txt_resultado.setText(msg_resultado);
                }else{
                    Context context = MainActivity.this;
                    CharSequence text = "DEBE INGRESAR UN NUMERO!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
    }
}