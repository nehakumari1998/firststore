package com.nehaangural.storeapp;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawerActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.Toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.orderhistory){

                    Toast.makeText(NavigationDrawerActivity.this, "Order History", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(NavigationDrawerActivity.this,OrderHistoryActivity.class);
                    startActivity(intent);
                }
                else if(item.getItemId()==R.id.orderhistory){

// Toast.makeText(HomePage.this, "Contact", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(NavigationDrawerActivity.this,OrderHistoryActivity.class);
                    startActivity(intent);
                }
                else if(item.getItemId()==R.id.helpsupport){

                    Toast.makeText(NavigationDrawerActivity.this, "Help & Support", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(NavigationDrawerActivity.this,HelpSupportActivity.class);
                    startActivity(intent);
                }
                else if(item.getItemId()==R.id.contactus){

                    Toast.makeText(NavigationDrawerActivity.this, "Contact Us", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(NavigationDrawerActivity.this,ContactUsActivity.class);
                    startActivity(intent);
                }
                else if(item.getItemId()==R.id.logout){

                    Toast.makeText(NavigationDrawerActivity.this, "Log Out", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(NavigationDrawerActivity.this,LogOutActivity.class);
                    startActivity(intent);
                }
                return true;

            }
        });

/* navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
@Override
public boolean onNavigationItemSelected(@NonNull MenuItem item) {
if(item.getItemId()==R.id.contact){

}
return true;
}
});*/

    }
}
