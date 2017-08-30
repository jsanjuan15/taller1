package com.example.android.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class Principal extends AppCompatActivity {


    private Spinner Gen;
    private Spinner Tip;
    private Spinner Mar;
    private TextView res;
    private EditText n1;
    private Resources resources;
    private String vecGenero[];
    private String vecTipo[];
    private String vecMarca[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        res = (TextView)findViewById(R.id.txtResultado);
        n1 = (EditText)findViewById(R.id.lblResultado);
        resources = this.getResources();
        Gen =(Spinner)findViewById(R.id.cmbGenero);
        vecGenero = resources.getStringArray(R.array.Genero);
        Tip =(Spinner)findViewById(R.id.cmbTipo);
        vecTipo = resources.getStringArray(R.array.TipoDeZapato);
        Mar =(Spinner)findViewById(R.id.cmbMarca);
        vecMarca = resources.getStringArray(R.array.Marca);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,vecGenero);
        Gen.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,vecTipo);
        Tip.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,vecMarca);
        Mar.setAdapter(adapter2);



    }


    public void calcular(View v){
        int posicion = Gen.getSelectedItemPosition();
        int posicion1 = Tip.getSelectedItemPosition();
        int posicion2 = Mar.getSelectedItemPosition();
        double var = 0;

        if (posicion == 0){
            if (posicion1 == 0){
               if (posicion2 == 0){
                   var=130.000;
               }else{
                   if (posicion2 == 1){
                       var= 140.000;
                   }else{
                       if (posicion2 == 2){
                           var = 120.000;
                       }
                   }
               }
            }else{
                if (posicion2 == 0){
                    var=100.000;
                }else{
                    if (posicion2 == 1){
                        var= 80.000;
                    }else{
                        if (posicion2 == 2){
                            var = 50.000;
                        }
                    }
                }

            }

        }else{
            if (posicion == 1){
                if (posicion1 == 0){
                    if (posicion2 == 0){
                        var=110.000;
                    }else{
                        if (posicion2 == 1){
                            var= 130.000;
                        }else{
                            if (posicion2 == 2){
                                var = 100.000;
                            }
                        }
                    }
                }else{
                    if (posicion2 == 0){
                        var=120.000;
                    }else{
                        if (posicion2 == 1){
                            var= 70.000;
                        }else{
                            if (posicion2 == 2){
                                var = 60.000;
                            }
                        }
                    }

                }

            }
        }
        int r= Integer.parseInt(n1.getText().toString());
        double total = var * r;
        res.setText(" "+ total);
    }
}
