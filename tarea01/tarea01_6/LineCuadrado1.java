package com.example.tarea01_6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL10;

public class LineCuadrado1 {
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

    float x=0.5f,y=2;
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
    /* Indices */
    private short indices[] = new short [] {
            0, 3,    //l1
            3, 15,    //l2
            15, 12,    //l3
            12, 0,    //l4
            7, 4,   //l5
            11, 8,   //l6
            1, 13,   //l7
            2, 14,   //l8
    };

    private FloatBuffer bufVertices;
    private ShortBuffer bufIndices;

    public LineCuadrado1() {
        /* Lee los vértices */
        ByteBuffer bufByte = ByteBuffer.allocateDirect(vertices.length * 4);
        bufByte.order(ByteOrder.nativeOrder()); // Utiliza el orden del byte nativo
        bufVertices = bufByte.asFloatBuffer(); // Convierte de byte a float
        bufVertices.put(vertices);
        bufVertices.rewind(); // puntero al principio del buffer

        /* Lee los indices */
        bufByte = ByteBuffer.allocateDirect(indices.length * 2);
        bufByte.order(ByteOrder.nativeOrder()); // Utiliza el orden de byte nativo
        bufIndices = bufByte.asShortBuffer(); // Convierte de byte a short
        bufIndices.put(indices);
        bufIndices.rewind(); // puntero al principio del buffer
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

        /* Renderiza las primitivas desde los datos de los arreglos (vértices, colores e índices) */
        gl.glDrawElements(GL10.GL_LINES, indices.length, GL10.GL_UNSIGNED_SHORT, bufIndices);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

}