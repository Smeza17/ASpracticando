package com.utec.android.asej3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox check1, check2, check3, check4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv1 = (TextView)findViewById(R.id.txt_result);
        check1 = (CheckBox)findViewById(R.id.check_suma);
        check2 = (CheckBox)findViewById(R.id.check_resta);
        check3 = (CheckBox)findViewById(R.id.check_mult);
        check4 = (CheckBox)findViewById(R.id.check_div);
    }

    //Metodo checkbox
    public void Calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        String resultado = "";

        if (check1.isChecked() == true){
            int suma = numero1 + numero2;
            resultado = "La suma es: "+ suma +" / ";
        }
        if (check2.isChecked() == true){
            int resta = numero1 - numero2;
            resultado = resultado + "La resta es: " + resta + " / ";
        }
        if (check3.isChecked() == true){
            int multi = numero1 * numero2;
            resultado = resultado + "La multiplicacion es: " + multi + " / ";
        }
        if (check4.isChecked() == true){
            if (numero2 == 0){
                Toast.makeText(this,"Denominador no valaido", Toast.LENGTH_SHORT).show();
            } else {
                int divi = numero1 / numero2;
                resultado = resultado + "La division es: " + divi + " / ";
        }

    }
        tv1.setText(resultado);
    }

}