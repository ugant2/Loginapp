package com.yograj.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.yograj.loginapp.adapter.ViewPagerAdapter;
import com.yograj.loginapp.framents.LoginFragment;
import com.yograj.loginapp.framents.SignupFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);

        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter((getSupportFragmentManager()));
        viewPagerAdapter.addFragment(new LoginFragment(),"Login");
        viewPagerAdapter.addFragment(new SignupFragment(),"Signup");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }



}
