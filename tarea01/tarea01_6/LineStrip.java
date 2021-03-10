package com.example.tarea01_6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class LineStrip {
    /**
     *          2
     *          \
     *           \
     *            \
     *             \
     *  ____________\
     * 0            1
     */
    /* Coordenadas cartesianas (x, y) */
    float x=-3.5f,y=-1.5f;
    private float vertices[] = new float [] {
            x, y, // 0
            x, y+1, // 1
            x, y+2, // 2
            x, y+3, // 3

            x+1, y, // 4
            x+1, y+1, // 5
            x+1, y+2, // 6
            x+1, y+3, // 7

            x+2, y, // 8
            x+2, y+1, // 9
            x+2, y+2, // 10
            x+2, y+3, // 11

            x+3, y, // 12
            x+3, y+1, // 13
            x+3, y+2, // 14
            x+3, y+3, // 15
    };


    private FloatBuffer bufVertices;
    private FloatBuffer bufColores;

    public LineStrip() {
        /* Lee los vértices */
        ByteBuffer bufByte = ByteBuffer.allocateDirect(vertices.length * 4);
        bufByte.order(ByteOrder.nativeOrder()); // Utiliza el orden del byte nativo
        bufVertices = bufByte.asFloatBuffer(); // Convierte de byte a float
        bufVertices.put(vertices);
        bufVertices.rewind(); // puntero al principio del buffer


    }
    public void dibuja(GL10 gl) {
        //gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        /* Se habilita el acceso al arreglo de vértices */
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

        /* Se especifica los datos del arreglo de vértices */
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertices);

        /* Se establece el color en (r,g,b,a) */
        gl.glColor4f(0, 0, 1, 0);
        //gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        //gl.glColorPointer(4, GL10.GL_FLOAT, 0, bufColores);

        /* grosor de la linea */
        //gl.glEnable(GL10.GL_LINE_SMOOTH);
        gl.glLineWidth(10);

        /* Dibuja las lineas */
        gl.glDrawArrays(GL10.GL_LINE_STRIP, 0, 16);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

}