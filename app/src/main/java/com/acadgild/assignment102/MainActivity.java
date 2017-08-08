package com.acadgild.assignment102;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity implements OnitemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onTrpItemSelected(String link) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        Layout layout; //Fragment 1
        Layout1 layout1; //Fragment 2
        Layout2 layout2; //Fragment 3
        Layout3 layout3; //Fragment 4
        if(link.equals("layout")){
           layout= new  Layout();
            fragmentTransaction.replace(R.id.detailFragment,layout);
            fragmentTransaction.commit();
            if(link.equals("layout1")){
                layout1=new Layout1();
                fragmentTransaction.replace(R.id.detailFragment,layout1);
                fragmentTransaction.commit();
                if(link.equals("layout2")){
                    layout2=new Layout2();
                    fragmentTransaction.replace(R.id.detailFragment,layout2);
                    fragmentTransaction.commit();
                    if(link.equals("layout3")){
                        layout3=new Layout3();
                        fragmentTransaction.replace(R.id.detailFragment,layout3);
                        fragmentTransaction.commit();
                    }
                }
            }
        }

    }
}

