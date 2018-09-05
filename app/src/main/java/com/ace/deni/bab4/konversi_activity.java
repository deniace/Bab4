package com.ace.deni.bab4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Point;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class konversi_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konversi_activity);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //get curent display info
        WindowManager windowManager = getWindowManager();
        Point size = new Point();

            windowManager.getDefaultDisplay().getSize(size);
            if(size.x > size.y){
                Fragment_menu fragment_menu = new Fragment_menu();
                //android R.id refers tothe content view of actuvity
                fragmentTransaction.replace(android.R.id.content, fragment_menu);
            } else {
                Fragment_Convert fragment_convert = new Fragment_Convert();
                fragmentTransaction.replace(android.R.id.content, fragment_convert);
            }
         fragmentTransaction.commit();


    }
}
