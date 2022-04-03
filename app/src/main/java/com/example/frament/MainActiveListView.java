package com.example.frament;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class MainActiveListView extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_active_list_view);

        ProductFragment productFragment =new ProductFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout,productFragment,"productFragment").commit();
    }
}