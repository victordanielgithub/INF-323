package com.example.tarea01_proyecto;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Line {
    /**
     *          2
     *         /\
     *       /   \
     *     /      \
     *   /         \
     * /____________\
     * 0            1
     */
    /* Coordenadas cartesianas (x, y) */
    private float vertices[] = new float [] {
            -2, -2, // 0
            2, -2, // 1

            2, -2, // 2
            0, 2, // 3

            0, 2, // 4
            -2, -2, // 5
    };
    /* Los colores x vértice (r,g,b,a) */
    private float colores[] = new float [] {
            0, 1, 0, 1, // 0    rojo
            0, 0, 1, 1, // 1    azul
            1, 0, 0, 1, // 2    verde
            0, 1, 0, 1, // 0    rojo
            0, 0, 1, 1, // 1    azul
            1, 0, 0, 1 // 2     verde
    };

    private FloatBuffer bufVertices;
    private FloatBuffer bufColores;

    public Line() {
        /* Lee los vértices */
        ByteBuffer bufByte = ByteBuffer.allocateDirect(vertices.length * 4);
        bufByte.order(ByteOrder.nativeOrder()); // Utiliza el orden del byte nativo
        bufVertices = bufByte.asFloatBuffer(); // Convierte de byte a float
        bufVertices.put(vertices);
        bufVertices.rewind(); // puntero al principio del buffer
        /* Lee los colores */
        bufByte = ByteBuffer.allocateDirect(colores.length * 4);
        bufByte.order(ByteOrder.nativeOrder()); // Utiliza el orden del byte nativo
        bufColores = bufByte.asFloatBuffer(); // Convierte de byte a float
        bufColores.put(colores);
        bufColores.rewind(); // puntero al principio del buffer
    }
    public void dibuja(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        /* Se habilita el acceso al arreglo de vértices */
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

        /* Se especifica los datos del arreglo de vértices */
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertices);

        /* Se establece el color en (r,g,b,a) */
        gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        gl.glColorPointer(4, GL10.GL_FLOAT, 0, bufColores);

        /* grosor de la linea */
        //gl.glEnable(GL10.GL_LINE_SMOOTH);
        gl.glLineWidth(10);

        /* Dibuja las lineas */
        gl.glDrawArrays(GL10.GL_LINES, 0, 6);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

}