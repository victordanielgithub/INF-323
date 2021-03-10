package com.example.tarea01_6;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Se crea el objeto GLSurfaceView */
        GLSurfaceView superficie = new GLSurfaceView(this);

        /* Se crea el objeto Renderiza */
        Renderiza renderiza = new Renderiza();

        /* GLSurfaceView <- Renderiza : Inicia el renderizado */
        superficie.setRenderer(renderiza);

        /*
         * Activity <- GLSurfaceView : Coloca la Vista de la Superficie del
         * OpenGL como un Contexto de ésta Actividad.
         */
        setContentView(superficie);

        //setContentView(R.layout.activity_main);
    }
}