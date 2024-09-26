package com.example.dungeonsdados;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dungeonsdados.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    //VARIABLES
    public int contadorGeneral=0;
    public int contadorD4=0;
    public int contadorD6=0;
    public int contadorD8=0;
    public int contadorD10=0;
    public int contadorD12=0;
    public int contadorD20=0;
    public int contadorD100=0;

    public static final String ESTADO_CONTADOR="VALORES";

    ArrayList<String> valores = new ArrayList<>();


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("CONTADOR_GENERAL", contadorGeneral);
        savedInstanceState.putInt("CONTADOR_D4", contadorD4);
        savedInstanceState.putInt("CONTADOR_D6", contadorD6);
        savedInstanceState.putInt("CONTADOR_D8", contadorD8);
        savedInstanceState.putInt("CONTADOR_D10", contadorD10);
        savedInstanceState.putInt("CONTADOR_D12", contadorD12);
        savedInstanceState.putInt("CONTADOR_D20", contadorD20);
        savedInstanceState.putInt("CONTADOR_D100", contadorD100);
        super.onSaveInstanceState(savedInstanceState);





    } //FIN ONSAVEINSTANCE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState != null) {
            valores = savedInstanceState.getStringArrayList(ESTADO_CONTADOR);
            contadorGeneral = savedInstanceState.getInt("CONTADOR_GENERAL");
            contadorD4 = savedInstanceState.getInt("CONTADOR_D4");
            contadorD6 = savedInstanceState.getInt("CONTADOR_D6");
            contadorD8 = savedInstanceState.getInt("CONTADOR_D8");
            contadorD10 = savedInstanceState.getInt("CONTADOR_D10");
            contadorD12 = savedInstanceState.getInt("CONTADOR_D12");
            contadorD20 = savedInstanceState.getInt("CONTADOR_D20");
            contadorD100 = savedInstanceState.getInt("CONTADOR_D100");

            binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
            binding.TiradaD4.setText(String.valueOf(contadorD4));
            binding.TiradaD6.setText(String.valueOf(contadorD6));
            binding.TiradaD8.setText(String.valueOf(contadorD8));
            binding.TiradaD10.setText(String.valueOf(contadorD10));
            binding.TiradaD12.setText(String.valueOf(contadorD12));
            binding.TiradaD20.setText(String.valueOf(contadorD20));
            binding.TiradaD100.setText(String.valueOf(contadorD100));
        }




        //RESET
        binding.BotonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral=0;
                contadorD4=0;
                contadorD6=0;
                contadorD8=0;
                contadorD10=0;
                contadorD12=0;
                contadorD20=0;
                contadorD100=0;
                valores.clear();


                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                binding.ResultadoD4.setText("-");
                binding.ResultadoD6.setText("-");
                binding.ResultadoD8.setText("-");
                binding.ResultadoD10.setText("-");
                binding.ResultadoD12.setText("-");
                binding.ResultadoD20.setText("-");
                binding.ResultadoD100.setText("-");

                binding.TiradaD4.setText(String.valueOf(0)); //CAMBIAR EL GUARDADO
                binding.TiradaD6.setText(String.valueOf(0));
                binding.TiradaD8.setText(String.valueOf(0));
                binding.TiradaD10.setText(String.valueOf(0));
                binding.TiradaD12.setText(String.valueOf(0));
                binding.TiradaD20.setText(String.valueOf(0));
                binding.TiradaD100.setText(String.valueOf(0));


            }
        });

        binding.BotonD4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();
                int azar = rand.nextInt(4)+1;
                contadorD4++;
                binding.ResultadoD4.setText(String.valueOf(azar));
                binding.TiradaD4.setText(String.valueOf(contadorD4));
                binding.ResultadoD6.setText(String.valueOf("-"));
                binding.ResultadoD8.setText(String.valueOf("-"));
                binding.ResultadoD10.setText(String.valueOf("-"));
                binding.ResultadoD12.setText(String.valueOf("-"));
                binding.ResultadoD20.setText(String.valueOf("-"));
                binding.ResultadoD100.setText(String.valueOf("-"));

                contadorGeneral++;
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                valores.add(String.valueOf(contadorD4));

            }
        });

        binding.BotonD6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();
                int azar = rand.nextInt(6)+1;
                contadorD6++;
                binding.ResultadoD6.setText(String.valueOf(azar));
                binding.TiradaD6.setText(String.valueOf(contadorD6));
                contadorGeneral++;
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                binding.ResultadoD4.setText(String.valueOf("-"));
                binding.ResultadoD8.setText(String.valueOf("-"));
                binding.ResultadoD10.setText(String.valueOf("-"));
                binding.ResultadoD12.setText(String.valueOf("-"));
                binding.ResultadoD20.setText(String.valueOf("-"));
                binding.ResultadoD100.setText(String.valueOf("-"));
                valores.add(String.valueOf(contadorD6));
            }
        });

        binding.BotonD8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();
                int azar = rand.nextInt(8)+1;
                contadorD8++;
                binding.ResultadoD8.setText(String.valueOf(azar));
                binding.TiradaD8.setText(String.valueOf(contadorD8));
                contadorGeneral++;
                binding.ResultadoD4.setText(String.valueOf("-"));
                binding.ResultadoD6.setText(String.valueOf("-"));
                binding.ResultadoD10.setText(String.valueOf("-"));
                binding.ResultadoD12.setText(String.valueOf("-"));
                binding.ResultadoD20.setText(String.valueOf("-"));
                binding.ResultadoD100.setText(String.valueOf("-"));
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                valores.add(String.valueOf(contadorD8));
            }
        });

        binding.BotonD10.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();
                int azar = rand.nextInt(10)+1;
                contadorD10++;
                binding.ResultadoD10.setText(String.valueOf(azar));
                binding.TiradaD10.setText(String.valueOf(contadorD10));
                contadorGeneral++;
                binding.ResultadoD4.setText(String.valueOf("-"));
                binding.ResultadoD6.setText(String.valueOf("-"));
                binding.ResultadoD8.setText(String.valueOf("-"));
                binding.ResultadoD12.setText(String.valueOf("-"));
                binding.ResultadoD20.setText(String.valueOf("-"));
                binding.ResultadoD100.setText(String.valueOf("-"));
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                valores.add(String.valueOf(contadorD8));

            }
        });

        binding.BotonD12.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();
                int azar = rand.nextInt(10)+1;
                contadorD12++;
                binding.ResultadoD12.setText(String.valueOf(azar));
                binding.TiradaD12.setText(String.valueOf(contadorD12));
                contadorGeneral++;
                binding.ResultadoD4.setText(String.valueOf("-"));
                binding.ResultadoD6.setText(String.valueOf("-"));
                binding.ResultadoD8.setText(String.valueOf("-"));
                binding.ResultadoD10.setText(String.valueOf("-"));
                binding.ResultadoD20.setText(String.valueOf("-"));
                binding.ResultadoD100.setText(String.valueOf("-"));
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                valores.add(String.valueOf(contadorD12));

            }
        });

        binding.BotonD20.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();
                int azar = rand.nextInt(20)+1;
                contadorD20++;
                binding.ResultadoD20.setText(String.valueOf(azar));
                binding.TiradaD20.setText(String.valueOf(contadorD20));
                contadorGeneral++;
                binding.ResultadoD4.setText(String.valueOf("-"));
                binding.ResultadoD6.setText(String.valueOf("-"));
                binding.ResultadoD8.setText(String.valueOf("-"));
                binding.ResultadoD10.setText(String.valueOf("-"));
                binding.ResultadoD12.setText(String.valueOf("-"));
                binding.ResultadoD100.setText(String.valueOf("-"));
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                valores.add(String.valueOf(contadorD20));

            }
        });

        binding.BotonD100.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();
                int azar = rand.nextInt(100)+1;
                contadorD100++;
                binding.ResultadoD100.setText(String.valueOf(azar));
                binding.TiradaD100.setText(String.valueOf(contadorD100));
                contadorGeneral++;
                binding.ResultadoD4.setText(String.valueOf("-"));
                binding.ResultadoD6.setText(String.valueOf("-"));
                binding.ResultadoD8.setText(String.valueOf("-"));
                binding.ResultadoD10.setText(String.valueOf("-"));
                binding.ResultadoD12.setText(String.valueOf("-"));
                binding.ResultadoD20.setText(String.valueOf("-"));
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                valores.add(String.valueOf(contadorD100));

            }
        });








    }//FIN ONCREATE




}//FIN MAIN