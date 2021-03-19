package com.example.tarea01_proyecto;

import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLU;

import java.util.ArrayList;
import java.util.List;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class Renderiza implements Renderer {
    /* Objeto */
    private List<Triangulo> triangulo_array = new ArrayList();
    private List<Triangulo> triangulo_array_circulo_blanco = new ArrayList();
    private List<Triangulo> triangulo_array_circulo_cafe1 = new ArrayList();
    private List<Triangulo> triangulo_array_circulo_cafe2 = new ArrayList();
    private List<Triangulo> triangulo_array_dientes = new ArrayList();     // para los dientes
    private List<Triangulo> triangulo_array_lengua = new ArrayList();     // para la lengua
    private List<Triangulo> triangulo_array_boca = new ArrayList();     // para la boca
    private List<Triangulo> triangulo_array_ojos = new ArrayList();     // para la ojos
    private List<Triangulo> triangulo_array_iris = new ArrayList();     // para la iris
    private List<Triangulo> triangulo_array_mano_d = new ArrayList();     // para la mano d
    private List<Triangulo> triangulo_array_mano_i = new ArrayList();     // para la mano i
    private List<Triangulo> triangulo_array_pies = new ArrayList();     // para los pies
    private List<Triangulo> triangulo_array_cuerpo = new ArrayList();     // para el cuerpo
    private List<Triangulo> triangulo_array_quino = new ArrayList();     // para el cuerpo
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig arg1) {
        // COLORES:
        Colores colores = new Colores();

        // BOMBA POKEMON
        int nro_triangulos=360;
        CirculoVertices circuloVertices = new CirculoVertices(-140,-10,85);
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_circulo_blanco.add(new Triangulo(
                    circuloVertices.getVerticesCirculo(i),
                    colores.getRgba(2)));
        }
        circuloVertices = new CirculoVertices(-140,-10,80);
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_circulo_cafe1.add(new Triangulo(
                    circuloVertices.getVerticesCirculo(i),
                    colores.getRgba(3)));
        }
        circuloVertices = new CirculoVertices(-140,-10,40);
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_circulo_cafe2.add(new Triangulo(
                    circuloVertices.getVerticesCirculo(i),
                    colores.getRgba(4)));
        }

        // RAYOS BOMBA POKEMON
        nro_triangulos = 38+12+15;
        TrianguloVertices trianguloVertices = new TrianguloVertices();
        for(int i = 0; i <= nro_triangulos; i++){
            triangulo_array.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo(i),
                    colores.getRgba(1)));
        }

        // DIENTES
        nro_triangulos = 20;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_dientes.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_dientes(i),
                    colores.getRgba(5)));
        }

        // LENGUA
        nro_triangulos = 9;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_lengua.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_lengua(i),
                    colores.getRgba(6)));
        }

        // BOCA
        nro_triangulos = 16;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_boca.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_boca(i),
                    colores.getRgba(7)));
        }

        // OJOS
        nro_triangulos = 14;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_ojos.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_ojos(i),
                    colores.getRgba(8)));
        }

        // IRIS
        nro_triangulos = 2;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_iris.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_iris(i),
                    colores.getRgba(9)));
        }

        // CUERPO MANO D
        nro_triangulos = 17;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_mano_d.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_mano_d(i),
                    colores.getRgba(10)));
        }

        // CUERPO MANO I
        nro_triangulos = 14;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_mano_i.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_mano_i(i),
                    colores.getRgba(10)));
        }
        // CUERPO PIES
        nro_triangulos = 19+16;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_pies.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_pies(i),
                    colores.getRgba(10)));
        }

        // CUERPO
        nro_triangulos = 23+16+17+12+25;
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_cuerpo.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_cuerpo(i),
                    colores.getRgba(10)));
        }

        // QUINO
        circuloVertices = new CirculoVertices(160,210,50);
        for(int i = 0; i < 360; i++){
            triangulo_array_circulo_cafe2.add(new Triangulo(
                    circuloVertices.getVerticesCirculo(i),
                    colores.getRgba(8)));
        }
        nro_triangulos = 17;//17
        trianguloVertices = new TrianguloVertices();
        for(int i = 0; i < nro_triangulos; i++){
            triangulo_array_quino.add(new Triangulo(
                    trianguloVertices.getVerticesTriangulo_quino(i),
                    colores.getRgba(10)));
        }

        /* Color de fondo */
        gl.glClearColor(0, 1, 1, 0);
        //gl.glClearColor(224f/255f, 247f/255f, 250f/255f, 0); // claro
        //gl.glClearColor(50f/255f, 33f/255f, 35f/255f, 0); // oscuro
    }
    @Override
    public void onDrawFrame(GL10 gl) {
        /* Inicializa el buffer de color */
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        for (int i = 0; i < triangulo_array_circulo_blanco.size(); i++){
            triangulo_array_circulo_blanco.get(i).dibuja(gl);
        }
        for (int i = 0; i < triangulo_array_circulo_cafe1.size(); i++){
            triangulo_array_circulo_cafe1.get(i).dibuja(gl);
        }
        for (int i = 0; i < triangulo_array_circulo_cafe2.size(); i++){
            triangulo_array_circulo_cafe2.get(i).dibuja(gl);
        }

        for (int i = 0; i < triangulo_array.size(); i++){
            triangulo_array.get(i).dibuja(gl);
        }
        // DIENTES
        for (int i = 0; i < triangulo_array_dientes.size(); i++)
            triangulo_array_dientes.get(i).dibuja(gl);
        // LENGUA
        for (int i = 0; i < triangulo_array_lengua.size(); i++)
            triangulo_array_lengua.get(i).dibuja(gl);
        // BOCA
        for (int i = 0; i < triangulo_array_boca.size(); i++)
            triangulo_array_boca.get(i).dibuja(gl);
        // OJOS
        for (int i = 0; i < triangulo_array_ojos.size(); i++)
            triangulo_array_ojos.get(i).dibuja(gl);
        // IRIS
        for (int i = 0; i < triangulo_array_iris.size(); i++)
            triangulo_array_iris.get(i).dibuja(gl);
        // CUERPO MANO DERECHA
        for (int i = 0; i < triangulo_array_mano_d.size(); i++)
            triangulo_array_mano_d.get(i).dibuja(gl);
        // CUERPO MANO IZQUIERDA
        for (int i = 0; i < triangulo_array_mano_i.size(); i++)
            triangulo_array_mano_i.get(i).dibuja(gl);
        // CUERPO PIES
        for (int i = 0; i < triangulo_array_pies.size(); i++)
            triangulo_array_pies.get(i).dibuja(gl);
        // CUERPO
        for (int i = 0; i < triangulo_array_cuerpo.size(); i++)
            triangulo_array_cuerpo.get(i).dibuja(gl);
        // QUINO
        for (int i = 0; i < triangulo_array_quino.size(); i++)
            triangulo_array_quino.get(i).dibuja(gl);

    }
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        /* Ventana de despliegue */
        gl.glViewport(0, 0, width, height);
        /* Matriz de Proyección */
        gl.glMatrixMode(GL10.GL_PROJECTION);
        /* Inicializa la Matriz de Proyección */
        gl.glLoadIdentity();
        /* Proyección paralela */
        GLU.gluOrtho2D(gl, -296, 296, -450, 450);
        /* Matriz del Modelo-Vista */
        gl.glMatrixMode(GL10.GL_MODELVIEW);
        /* Inicializa la Matriz del Modelo-Vista */
        gl.glLoadIdentity();
    }
}