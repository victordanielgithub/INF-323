package com.example.tarea01_6;

import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLU;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class Renderiza implements Renderer {
    /* Objeto */
    private Puntos puntos;
    private LineStrip lineStrip;
    private Triangulo triangulo;
    private LineCuadrado1 lineCuadrado1;
    private LineCuadrado2 lineCuadrado2;
    private TrianguloCuadrado trianguloCuadrado;
    private TrianguloCuadradoCuadrado trianguloCuadradoCuadrado;


    public void onSurfaceCreated(GL10 gl, EGLConfig arg1) {
        puntos = new Puntos();
        lineStrip = new LineStrip();
        triangulo = new Triangulo();
        lineCuadrado1 = new LineCuadrado1();
        lineCuadrado2 = new LineCuadrado2();
        trianguloCuadrado = new TrianguloCuadrado();
        trianguloCuadradoCuadrado = new TrianguloCuadradoCuadrado();

        /* Color de fondo */
        gl.glClearColor(0, 1, 1, 0);
        //gl.glClearColor(240/255,240/255,240/255,0);//light blue);
    }

    public void onDrawFrame(GL10 gl) {
        /* Inicializa el buffer de color */
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        puntos.dibuja(gl);
        lineStrip.dibuja(gl);
        triangulo.dibuja(gl);
        lineCuadrado1.dibuja(gl);
        lineCuadrado2.dibuja(gl);
        trianguloCuadrado.dibuja(gl);
        trianguloCuadradoCuadrado.dibuja(gl);

    }

    public void onSurfaceChanged(GL10 gl, int width, int height) {
        /* Ventana de despliegue */
        gl.glViewport(0, 0, width, height);
        /* Matriz de Proyección */
        gl.glMatrixMode(GL10.GL_PROJECTION);
        /* Inicializa la Matriz de Proyección */
        gl.glLoadIdentity();
        /* Proyección paralela */
        GLU.gluOrtho2D(gl, -4, 4, -6, 6);
        /* Matriz del Modelo-Vista */
        gl.glMatrixMode(GL10.GL_MODELVIEW);
        /* Inicializa la Matriz del Modelo-Vista */
        gl.glLoadIdentity();
    }
}
