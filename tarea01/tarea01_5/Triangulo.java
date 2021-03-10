package com.example.tarea01_5;

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
    private float vertices[] = new float [] {
            -1, -2, // 0
            -2, -1, // 1
            -3, -2, // 2

            -1, -2-3, // 3
            -2, -1-3, // 4
            -3, -2-3 // 5
    };
    /* Los colores x vértice (r,g,b,a) */
    private float colores[] = new float [] {
            1, 0, 0, 0, // 0    rojo
            1, 0, 0, 0, // 1    rojo
            1, 0, 0, 0, // 2     rojo
            1, 0, 0, 0, // 3     rojo
            1, 0, 0, 0, // 4     rojo
            1, 0, 0, 0, // 5     rojo
    };
    private FloatBuffer bufColores;
    private FloatBuffer bufVertices;
    public Triangulo() {
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
        /* Se habilita el acceso al arreglo de vértices */
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

        /* Se especifica los datos del arreglo de vértices */
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertices);

        /* Se establece el color en (r,g,b,a) */
        //gl.glColor4f(1, 0, 0, 0);
        gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        gl.glColorPointer(4, GL10.GL_FLOAT, 0, bufColores);

        /* Dibuja el triángulo */
        gl.glDrawArrays(GL10.GL_TRIANGLES, 0, 6);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
}
