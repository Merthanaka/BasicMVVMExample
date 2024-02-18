package com.example.basicmvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.basicmvvmexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        setContentView(binding.getRoot());

        viewModel.result.observe(this,s -> {
            binding.twmain.setText(s);
        });

        binding.buttonsum.setOnClickListener(v -> {
        String number1 = binding.editTextNum1.getText().toString();
        String number2 = binding.editTextNum2.getText().toString();
        viewModel.Sum(number1,number2);

        });

        binding.buttonmul.setOnClickListener(v -> {
        String number1 = binding.editTextNum1.getText().toString();
        String number2 = binding.editTextNum2.getText().toString();
        viewModel.Mult(number1,number2);

        });
    }
}