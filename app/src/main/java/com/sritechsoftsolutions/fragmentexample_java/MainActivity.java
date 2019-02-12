package com.sritechsoftsolutions.fragmentexample_java;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button home,product,shipping,offers,bestsellers,categories,cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home=findViewById(R.id.home1);
        product=findViewById(R.id.product);
        shipping=findViewById(R.id.shipping);
        offers=findViewById(R.id.offers);
        bestsellers=findViewById(R.id.bestsellers);
        categories=findViewById(R.id.categories);
        cart=findViewById(R.id.cart);

        FragmentManager fmanager=getSupportFragmentManager();
        FragmentTransaction ftransaction=fmanager.beginTransaction();
        ftransaction.add(R.id.frame1,new Home());
        ftransaction.commit();
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction ftransaction=fmanager.beginTransaction();
                ftransaction.add(R.id.frame1,new Home());
                ftransaction.addToBackStack("true");
                ftransaction.commit();
            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction ftransaction=fmanager.beginTransaction();
                ftransaction.add(R.id.frame1,new Product());
                ftransaction.addToBackStack("true");
                ftransaction.commit();
            }
        });

        offers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction ftransaction=fmanager.beginTransaction();
                ftransaction.add(R.id.frame1,new Offers());
                ftransaction.addToBackStack("true");
                ftransaction.commit();
            }
        });
        shipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction ftransaction=fmanager.beginTransaction();
                ftransaction.add(R.id.frame1,new Shipping());
                ftransaction.addToBackStack("true");
                ftransaction.commit();
            }
        });
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction ftransaction=fmanager.beginTransaction();
                ftransaction.add(R.id.frame1,new Categories());
                ftransaction.addToBackStack("true");
                ftransaction.commit();
            }
        });
        bestsellers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction ftransaction=fmanager.beginTransaction();
                ftransaction.add(R.id.frame1,new Bestsellers());
                ftransaction.addToBackStack("true");
                ftransaction.commit();
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction ftransaction=fmanager.beginTransaction();
                ftransaction.add(R.id.frame1,new Cart());
                ftransaction.addToBackStack("true");
                ftransaction.commit();
            }
        });

    }


}
