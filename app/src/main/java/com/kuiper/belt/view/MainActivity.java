package com.kuiper.belt.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kuiper.belt.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            MainFragment fragment = new MainFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,
                    fragment, MainFragment.TAG).commit();
        }
    }
}