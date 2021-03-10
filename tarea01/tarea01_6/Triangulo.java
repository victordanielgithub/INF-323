package com.example.tarea01_6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Triangulo {
    /**
     *          2
     *         /\
     *       /   \
     *     /      \
     *   /         \
     * /____________\
     * 0             1
     */
    /* Coordenadas cartesianas (x, y) */
    float x=-3.5f,y=-5;
    private float vertices[] = new float [] {
            x, y, // 0
            x+1, y+1, // 5
            x, y+1, // 1

            x, y+1, // 1
            x+1, y+2, // 6
            x, y+2, // 2

            x, y+2, // 2
            x+1, y+3, // 7
            x, y+3, // 3

            x+1, y, // 4
            x+2, y+1, // 9
            x+1, y+1, // 5

            x+1, y+1, // 5
            x+2, y+2, // 10
            x+1, y+2, // 6

            x+1, y+2, // 6
            x+2, y+3, // 11
            x+1, y+3, // 7


            x+2, y, // 8
            x+3, y+1, // 13
            x+2, y+1, // 9

            x+2, y+1, // 9
            x+3, y+2, // 14
            x+2, y+2, // 10

            x+2, y+2, // 10
            x+3, y+3, // 15
            x+2, y+3, // 11
    };
    private FloatBuffer bufVertices;
    public Triangulo() {
        /* Lee los vértices */
        ByteBuffer bufByte = ByteBuffer.allocateDirect(vertices.length * 4);
        bufByte.order(ByteOrder.nativeOrder()); // Utiliza el orden del byte nativo
        bufVertices = bufByte.asFloatBuffer(); // Convierte de byte a float
        bufVertices.put(vertices);
        bufVertices.rewind(); // puntero al principio del buffer
    }
    public void dibuja(GL10 gl) {
        /* Se habilita el acceso al arreglo de vértices */
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

        /* Se especifica los datos del arreglo de vértices */
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertices);

        /* Se establece el color en (r,g,b,a) */
        gl.glColor4f(0, 0, 1, 0);
        //gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        //gl.glColorPointer(4, GL10.GL_FLOAT, 0, bufColores);

        /* Dibuja el triángulo */
        gl.glDrawArrays(GL10.GL_TRIANGLES, 0, 27);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
}
