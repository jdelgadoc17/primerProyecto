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


    @Override
    public void onSaveInstanceState(Bundle savedInstance) {
        super.onSaveInstanceState(savedInstance);




    } //FIN ONSAVEINSTANCE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //RESET
        binding.BotonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral=0;
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
                binding.ResultadoD4.setText("-");
                binding.ResultadoD6.setText("-");
                binding.ResultadoD8.setText("-");
                binding.ResultadoD10.setText("-");
                binding.ResultadoD12.setText("-");
                binding.ResultadoD20.setText("-");
                binding.ResultadoD100.setText("-");

                binding.TiradaD4.setText(String.valueOf(0));
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
                contadorGeneral++;
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
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
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
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
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
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
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
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
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
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
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));
            }
        });








    }//FIN ONCREATE




}//FIN MAIN