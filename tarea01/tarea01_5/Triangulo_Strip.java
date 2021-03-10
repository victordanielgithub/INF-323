package com.example.tarea01_5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Triangulo_Strip {
    /**
     *          1_____________3
     *         /\            /\
     *       /   \         /   \
     *     /      \      /      \
     *   /         \   /         \
     * /____________\/____________\
     * 0             2             4
     */
    /* Coordenadas cartesianas (x, y) */
    private float vertices[] = new float [] {
            1, 1+3-6, // 0
            2, 2+3-6, // 1
            3f, 1+3-6, // 2
            3.5f, 2+3-6, // 3
            2f, 0.5f+3-6, // 4
            1, 2+3-6, // 5
    };
    /* Los colores x vértice (r,g,b,a) */
    private float colores[] = new float [] {
            255, 233, 0, 0, // 0    negro
            255, 233, 0, 0, // 1    negro
            255, 233, 0, 0, // 2     negro
            255, 233, 0, 0, // 3     amarillo
            255, 233, 0, 0, // 4     amarillo
            255, 233, 0, 0, // 5     amarillo
    };

    private FloatBuffer bufVertices;
    private FloatBuffer bufColores;

    public Triangulo_Strip() {
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
        gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        gl.glColorPointer(4, GL10.GL_FLOAT, 0, bufColores);

        /* Dibuja el triángulo */
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 6);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
}
