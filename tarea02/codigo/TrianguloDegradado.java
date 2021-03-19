package com.example.tarea01_proyecto;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class TrianguloDegradado {
    /* vertices */
    private float vertices[] = new float [] {};
    private FloatBuffer bufVertices;

    /* colores */
    private float colores[] = new float [] {
            1, 0, 0, 1, // 0    rojo
            0, 1, 0, 1, // 1    verde
            0, 1, 0, 1, // 2    verde
    };
    private FloatBuffer bufColores;

    public TrianguloDegradado(float vertices_aux[]) {
        vertices = vertices_aux;

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
        //gl.glColor4f(rgba[0], rgba[1], rgba[2], rgba[3]);
        /* Se habilita el acceso al arreglo de colores */
        gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
        /* Se especifica los datos del arreglo de colores */
        gl.glColorPointer(4, GL10.GL_FLOAT, 0, bufColores);

        /* Dibuja el triángulo */
        gl.glDrawArrays(GL10.GL_TRIANGLES, 0, 3);

        /* Se deshabilita el acceso al arreglo de vértices */
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

    public int getRandomInt(){
        int numero = (int)(Math.random()*10);
        if (numero > 5)
            numero = numero - 4;
        return numero;
    }

}