package com.samdroid.mayankpunethatask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.samdroid.mayankpunethatask.databinding.ActivityMainBinding;

import java.util.Objects;

import static androidx.navigation.Navigation.findNavController;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Objects.requireNonNull(getSupportActionBar()).hide();

        navController = findNavController(this, R.id.fragmentContainerView);
        NavigationUI.setupWithNavController(binding.bottomNavView, navController);


    }
}