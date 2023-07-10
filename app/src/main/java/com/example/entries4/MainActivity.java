package com.example.entries4;

import androidx.appcompat.app.AppCompatActivity;

import com.example.entries4.databinding.ActivityMainBinding;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); // находим все элементы экрана

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действия, выполняемые при нажатии кнопки
                Toast.makeText(MainActivity.this, "enter fab", Toast.LENGTH_SHORT).show();
            }
        });

        binding.barMain.actionBarHome.setVisibility(View.GONE);
    }
}