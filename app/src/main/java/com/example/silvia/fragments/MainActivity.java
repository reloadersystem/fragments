package com.example.silvia.fragments;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Comunicador{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void responder(String datos) {

        android.app.FragmentManager fragmentManager= getFragmentManager();
        FragmentB fragmentB=   fragmentManager.findFragmentById(R.id.fragmentB_element);
        fragmentB.cambiarTexto(datos);
    }
}
