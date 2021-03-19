package com.example.tarea01_proyecto;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Triangulo {
    /* vertices */
    private float vertices[] = new float [] {};

    /* Los colores x vértice (r,g,b,a) */
    private float colores[] = new float [] {};
    private FloatBuffer bufVertices;
    private float rgba[] = new float[4];

    public Triangulo(float vertices_aux[], float rgba_aux[]) {
        rgba = new float[]{};
        vertices = vertices_aux;
        rgba = rgba_aux;
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
        gl.glColor4f(rgba[0], rgba[1], rgba[2], rgba[3]);

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