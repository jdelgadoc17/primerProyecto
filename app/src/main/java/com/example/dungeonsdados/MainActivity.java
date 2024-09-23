package com.example.dungeonsdados;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dungeonsdados.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    //VARIABLES
    public int contadorGeneral=0;
    public int contadorD4=0;
    public int contadorD6=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));

        //RESET
        binding.BotonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral=0;
                binding.ContadorTotalTiradas.setText(String.valueOf(contadorGeneral));

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
            }
        });









    }//FIN ONCREATE




}//FIN MAIN