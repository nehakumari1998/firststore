package com.nehaangural.storeapp;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenuView;
import com.nehaangural.storeapp.CartFragment;
import com.nehaangural.storeapp.HomeFragment;
import com.nehaangural.storeapp.R;
import com.nehaangural.storeapp.SearchFragment;

public class BottomNavigationActivity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        navigationView = findViewById(R.id.bottom_navigation);

        HomeFragment fragment = new HomeFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t = manager.beginTransaction();
        t.add(R.id.Relative, fragment).commit();
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.home) {
                    openFragment(new HomeFragment());
                } else if (menuItem.getItemId() == R.id.search) {
                    openFragment(new SearchFragment());
                }
                else if (menuItem.getItemId() == R.id.cart)
                {
                    openFragment(new CartFragment());
                }
                return true;
            }
        });

    }

    private void openFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t = manager.beginTransaction();
        t.add(R.id.Relative, fragment).commit();

    }

}
