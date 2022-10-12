package com.example.lab3_daalgavar;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view) {
        Fragment fragment;

        if(view == findViewById(R.id.button2)) {
            fragment = new Fragment2();
        } else {
            fragment = new Fragment1();
        }

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragments, fragment);
        fragmentTransaction.commit();
    }
}