package com.example.tarea01_proyecto;

public class Colores {
    private float rgba[];

    /* Los colores x vértice (r,g,b,a) */
    private float lilas_tonos[] = new float [] {
            228f/255f, 210f/255f, 231f/255f, 1, // 0    lila
            215f/255f, 181f/255f, 216f/255f, 1, // 1    lila
            201f/255f, 155f/255f, 203f/255f, 1, // 2    lila
            189f/255f, 140f/255f, 195f/255f, 1, // 3    lila
            177f/255f, 114f/255f, 182f/255f, 1, // 4    lila
            164f/255f, 91f/255f, 170f/255f, 1, // 5    lila
    };
    private float azul_tonos[] = new float [] {
            178f/255f, 235f/255f, 242f/255f, 1, // 0    azul
            80f/255f, 222f/255f, 234f/255f, 1, // 1    azul
            26f/255f, 198f/255f, 218f/255f, 1, // 2    azul
            00f/255f, 172f/255f, 193f/255f, 1, // 3    azul
            00f/255f, 97f/255f, 167f/255f, 1, // 4    azul
            00f/255f, 83f/255f, 143f/255f, 1, // 5    azul
    };
    private float entero[] = new float [] {
        1, 0, 0, 1, // 0    rojo
        0, 1, 0, 1, // 1    verde
        0, 0, 1, 1, // 2    azul
        0, 0, 0, 1, // 3    negro
    };
    private float rosado_tonos[] = new float [] {
            253f/255f, 164f/255f, 186f/255f, 1, // 0    blanco
            252f/255f, 186f/255f, 203f/255f, 1, // 0    blanco
            254f/255f, 197f/255f, 229f/255f, 1, // 0    blanco
            247f/255f, 154f/255f, 192f/255f, 1, // 0    blanco
            253f/255f, 171f/255f, 159f/255f, 1, // 0    blanco
            242f/255f, 107f/255f, 138f/255f, 1, // 0    blanco
    };
    private float gris_tonos[] = new float [] {
            120f/255f, 120f/255f, 120f/255f, 1, // 0    blanco
            130f/255f, 130f/255f, 130f/255f, 1, // 0    blanco
            140f/255f, 140f/255f, 140f/255f, 1, // 0    blanco
            150f/255f, 150f/255f, 150f/255f, 1, // 0    blanco
            160f/255f, 160f/255f, 160f/255f, 1, // 0    blanco
            170f/255f, 170f/255f, 170f/255f, 1, // 0    blanco

    };
    private float blanco_tonos[] = new float [] {
            255f/255f, 255f/255f, 255f/255f, 1, // 0    blanco
            250f/255f, 250f/255f, 250f/255f, 1, // 0    blanco
            245f/255f, 245f/255f, 245f/255f, 1, // 0    blanco
            240f/255f, 240f/255f, 240f/255f, 1, // 0    blanco
            235f/255f, 235f/255f, 235f/255f, 1, // 0    blanco
            230f/255f, 230f/255f, 230f/255f, 1, // 0    blanco
    };
    private float cafe_tonos[] = new float [] {
            62f/255f, 27f/255f, 23f/255f, 1, // 0    lila
            78f/255f, 34f/255f, 46f/255f, 1, // 0    lila
            201f/255f, 155f/255f, 203f/255f, 1, // 2    lila
            189f/255f, 140f/255f, 195f/255f, 1, // 3    lila
            177f/255f, 114f/255f, 182f/255f, 1, // 4    lila
            164f/255f, 91f/255f, 170f/255f, 1, // 5    lila
    };
    float[] getRgba(int option){
        rgba = new float[4];
        switch (option){
            case 1:
                // colores RGBA tonos de lila
                int random = getRandomInt();
                rgba = new float[4];
                rgba[0] = lilas_tonos[(random*4) + 0];
                rgba[1] = lilas_tonos[(random*4) + 1];
                rgba[2] = lilas_tonos[(random*4) + 2];
                rgba[3] = lilas_tonos[(random*4) + 3];
                break;
            case 2:
                rgba[0] = blanco_tonos[0];
                rgba[1] = blanco_tonos[1];
                rgba[2] = blanco_tonos[2];
                rgba[3] = blanco_tonos[3];
                break;
            case 3:
                rgba[0] = cafe_tonos[0];
                rgba[1] = cafe_tonos[1];
                rgba[2] = cafe_tonos[2];
                rgba[3] = cafe_tonos[3];
                break;
            case 4:
                rgba[0] = cafe_tonos[4];
                rgba[1] = cafe_tonos[5];
                rgba[2] = cafe_tonos[6];
                rgba[3] = cafe_tonos[7];
                break;
            case 5:
                // colores RGBA para dientes
                random = getRandomInt();
                rgba = new float[4];
                rgba[0] = blanco_tonos[(random*4) + 0];
                rgba[1] = blanco_tonos[(random*4) + 1];
                rgba[2] = blanco_tonos[(random*4) + 2];
                rgba[3] = blanco_tonos[(random*4) + 3];
                break;
            case 6:
                // colores RGBA para lengua
                random = getRandomInt();
                rgba = new float[4];
                rgba[0] = rosado_tonos[(random*4) + 0];
                rgba[1] = rosado_tonos[(random*4) + 1];
                rgba[2] = rosado_tonos[(random*4) + 2];
                rgba[3] = rosado_tonos[(random*4) + 3];
                break;
            case 7:
                // colores RGBA para boca
                random = getRandomInt();
                rgba = new float[4];
                rgba[0] = gris_tonos[(random*4) + 0];
                rgba[1] = gris_tonos[(random*4) + 1];
                rgba[2] = gris_tonos[(random*4) + 2];
                rgba[3] = gris_tonos[(random*4) + 3];
                break;
            case 8:
                // colores RGBA para ojos ROJO
                rgba = new float[4];
                rgba[0] = entero[0];
                rgba[1] = entero[1];
                rgba[2] = entero[2];
                rgba[3] = entero[3];
                break;
            case 9:
                // colores RGBA para ojos ROJO
                rgba = new float[4];
                rgba[0] = entero[12];
                rgba[1] = entero[13];
                rgba[2] = entero[14];
                rgba[3] = entero[15];
                break;
            case 10:
                // colores RGBA tonos de lila
                random = getRandomInt();
                rgba = new float[4];
                rgba[0] = azul_tonos[(random*4) + 0];
                rgba[1] = azul_tonos[(random*4) + 1];
                rgba[2] = azul_tonos[(random*4) + 2];
                rgba[3] = azul_tonos[(random*4) + 3];
                break;
            default:
                break;
        }
        return rgba;
    }
    public int getRandomInt(){
        int numero = (int)(Math.random()*10);
        if (numero > 5)
            numero = numero - 4;
        return numero;
    }
}
