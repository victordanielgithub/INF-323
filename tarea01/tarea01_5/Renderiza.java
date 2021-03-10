package com.example.tarea01_5;

import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLU;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class Renderiza implements Renderer {
    /* Objeto */
    private Triangulo_Strip triangulo_strip;
    private Triangulo_Fan triangulo_fan;
    private Puntos puntos;
    private Line line;
    private LineLoop lineLoop;
    private LineStrip lineStrip;
    private Triangulo triangulo;

    public void onSurfaceCreated(GL10 gl, EGLConfig arg1) {
        puntos = new Puntos();
        line = new Line();
        lineLoop = new LineLoop();
        lineStrip = new LineStrip();
        triangulo = new Triangulo();
        triangulo_strip = new Triangulo_Strip();
        triangulo_fan = new Triangulo_Fan();

        /* Color de fondo */
        gl.glClearColor(0, 1, 1, 0);
        //gl.glClearColor( 0.0f, 0.0f, 1.0f,0);
    }

    public void onDrawFrame(GL10 gl) {
        /* Inicializa el buffer de color */
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        //triangulo.dibuja(gl);
        puntos.dibuja(gl);
        line.dibuja(gl);
        lineLoop.dibuja(gl);
        lineStrip.dibuja(gl);
        triangulo.dibuja(gl);
        triangulo_strip.dibuja(gl);
        triangulo_fan.dibuja(gl);
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
