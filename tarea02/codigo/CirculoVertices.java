package com.example.tarea01_proyecto;

import java.util.ArrayList;
import java.util.List;

public class CirculoVertices {
    short indices_circulo[];
    float vertices_circulo[];
    public CirculoVertices(float in_centro_x, float in_centro_y, float in_radio){
        llenaVerticesCirculo(in_centro_x, in_centro_y, in_radio);
        llenaIndicesCirculo();
    }
    void llenaVerticesCirculo(float in_centro_x, float in_centro_y, float in_radio){
        float centro_x = in_centro_x;
        float centro_y = in_centro_y;
        float radio = in_radio;
        List<Float> lista = new ArrayList<Float>();
        lista.add((float)centro_x);
        lista.add((float)centro_y);
        for(float i =0; i<360;i=i+(float)1) {
            double angulo_radianes = Math.toRadians(i);
            float x = (float)(Math.cos(angulo_radianes))*radio;
            x += centro_x;
            float y = (float)(Math.sin(angulo_radianes))*radio;
            y += centro_y;
            lista.add(x);
            lista.add(y);
        }
        vertices_circulo = new float[lista.size()];
        for (int i = 0; i<lista.size(); i++)
            vertices_circulo[i] = lista.get(i);
    }
    void llenaIndicesCirculo(){
        List<Short> lista = new ArrayList<Short>();
        short c = 0;
        short v1=0, v2=1 , v3=2;
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);

        for (int i = 6; i< vertices_circulo.length; i+=2){
            v2 = v3;
            v3 += 1;
            lista.add(v1);
            lista.add(v2);
            lista.add(v3);
        }
        lista.add((short)0);
        lista.add((short)360);
        lista.add((short)1);
        indices_circulo = new short[lista.size()];
        for (int i = 0; i<lista.size(); i++)
            indices_circulo[i] = lista.get(i);
    }
    public float[] getVerticesCirculo(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_circulo[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_circulo[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_circulo[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_circulo[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_circulo[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_circulo[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_circulo[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_circulo[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_circulo[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
}
