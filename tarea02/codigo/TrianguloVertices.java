package com.example.tarea01_proyecto;

import java.util.ArrayList;
import java.util.List;

public class TrianguloVertices {
    private float dx = 296, dy = 300;
    float vertices[], vertices_dientes[], vertices_lengua[], vertices_boca[], vertices_mano_d[],
            vertices_ojos[], vertices_iris[], vertices_mano_i[], vertices_pies[], vertices_cuerpo[]
            , vertices_quino[];
    short indices[], indices_dientes[], indices_lengua[], indices_boca[], indices_mano_d[],
            indices_ojos[], indices_iris[], indices_mano_i[], indices_pies[], indices_cuerpo[]
            , indices_quino[];
    public TrianguloVertices(){
        llenaVertices();
        llenaIndices();
    }
    void llenaVertices(){
        vertices_quino = new float[] {
                437.4f-dx, dy-108.9f,//
                453.5f-dx, dy-108.9f,//
                437.4f-dx, dy-60.0f,//
                453.5f-dx, dy-60.0f,//
                453.5f-dx, dy-70.9f,//
                464.8f-dx, dy-70.9f,//
                464.8f-dx, dy-60.0f,//
                477.0f-dx, dy-60.0f,//
                477.0f-dx, dy-108.9f,//
                464.8f-dx, dy-108.9f,//
                464.8f-dx, dy-97.4f,//
                453.5f-dx, dy-97.4f,//
                440.3f-dx, dy-112.7f,//
                446.7f-dx, dy-109.5f,//
                445.5f-dx, dy-119.5f,//
                451.5f-dx, dy-117.6f,//
                460.0f-dx, dy-109.6f,//
                457.0f-dx, dy-118.3f,//
                463.5f-dx, dy-121.0f,//
                470.9f-dx, dy-112.2f,//
                469.6f-dx, dy-123.4f,//
                479.1f-dx, dy-112.4f,//
                475.0f-dx, dy-123.8f,//
        };
        vertices_cuerpo = new float[] {
                500.9f-dx, dy-417.8f,// 0
                497.8f-dx, dy-411.5f,//
                495.3f-dx, dy-424.9f,//
                470.1f-dx, dy-444.4f,//
                468.3f-dx, dy-418.2f,//
                475.5f-dx, dy-438.0f,//
                477.3f-dx, dy-409.4f,//
                474.1f-dx, dy-405.2f,//
                456.4f-dx, dy-414.9f,//
                456.4f-dx, dy-439.5f,//
                452.6f-dx, dy-455.5f,//
                426.0f-dx, dy-440.1f,//
                416.6f-dx, dy-429.0f,//
                386.5f-dx, dy-443.5f,//
                342.4f-dx, dy-389.2f,//
                328.0f-dx, dy-398.5f,//
                312.3f-dx, dy-402.0f,//
                297.6f-dx, dy-431.2f,//
                309.3f-dx, dy-440.8f,//
                368.8f-dx, dy-461.9f,//
                378.8f-dx, dy-465.5f,//
                294.4f-dx, dy-400.1f,//
                271.4f-dx, dy-375.8f,//
                277.8f-dx, dy-407.0f,//
                281.3f-dx, dy-373.7f,//
                278.6f-dx, dy-383.2f,// 25
                490.4f-dx, dy-368.4f,//
                480.4f-dx, dy-391.0f,//
                494.4f-dx, dy-380.4f,//
                488.6f-dx, dy-372.4f,//
                471.9f-dx, dy-337.0f,//
                495.7f-dx, dy-327.8f,//
                502.5f-dx, dy-330.2f,//
                499.4f-dx, dy-339.8f,//
                500.9f-dx, dy-358.4f,//
                509.4f-dx, dy-352.9f,//
                456.4f-dx, dy-328.5f,//
                415.7f-dx, dy-334.4f,//
                383.8f-dx, dy-327.7f,//
                451.3f-dx, dy-307.4f,//
                399.0f-dx, dy-280.2f,//
                452.6f-dx, dy-278.3f,// 41
                447.5f-dx, dy-245.9f,//
                406.4f-dx, dy-231.4f,//
                395.0f-dx, dy-234.4f,//
                387.7f-dx, dy-247.4f,//
                374.5f-dx, dy-257.7f,//
                363.8f-dx, dy-259.2f,//
                350.5f-dx, dy-258.5f,//
                292.0f-dx, dy-262.5f,//
                338.7f-dx, dy-254.2f,//
                334.7f-dx, dy-250.8f,//
                333.0f-dx, dy-246.5f,//
                329.3f-dx, dy-243.5f,//
                310.8f-dx, dy-241.6f,//
                302.2f-dx, dy-247.4f,//
                298.8f-dx, dy-248.7f,//
                292.8f-dx, dy-248.7f,//
                304.3f-dx, dy-257.7f,// 58
                462.5f-dx, dy-267.4f,//
                469.7f-dx, dy-266.2f,//
                489.0f-dx, dy-263.0f,//
                484.8f-dx, dy-234.7f,//
                478.6f-dx, dy-221.3f,//
                456.4f-dx, dy-208.7f,//
                503.0f-dx, dy-263.6f,//
                505.8f-dx, dy-244.0f,//
                517.2f-dx, dy-246.1f,//
                549.6f-dx, dy-194.8f,// 68
                472.4f-dx, dy-191.2f,//
                464.3f-dx, dy-207.8f,//
                449.4f-dx, dy-204.5f,//
                458.1f-dx, dy-191.9f,//
                467.5f-dx, dy-178.2f,//
                435.6f-dx, dy-195.5f,//
                444.6f-dx, dy-180.3f,//
                419.5f-dx, dy-189.4f,//
                428.1f-dx, dy-212.2f,//
                370.6f-dx, dy-190.6f,//
                383.0f-dx, dy-186.8f,//
                373.2f-dx, dy-168.4f,//
                355.1f-dx, dy-195.3f,//
                347.0f-dx, dy-197.8f,//
                309.1f-dx, dy-222.4f,//
                346.8f-dx, dy-222.0f,//
                305.9f-dx, dy-230.5f,//
                359.5f-dx, dy-233.8f,// 86
        };
        vertices_pies = new float[] {
                430.8f-dx, dy-520.4f,// 0
                443.7f-dx, dy-500.0f,//
                429.0f-dx, dy-506.1f,//
                419.8f-dx, dy-512.1f,//
                443.7f-dx, dy-493.5f,//
                441.2f-dx, dy-466.5f,//
                416.6f-dx, dy-463.8f,//
                411.7f-dx, dy-504.0f,//
                405.0f-dx, dy-493.5f,//
                406.8f-dx, dy-523.0f,//
                403.8f-dx, dy-511.0f,//
                398.2f-dx, dy-504.9f,//
                396.8f-dx, dy-516.9f,//
                396.8f-dx, dy-491.8f,//
                378.8f-dx, dy-465.5f,//
                386.5f-dx, dy-443.5f,//
                426.0f-dx, dy-440.1f,//
                456.4f-dx, dy-439.5f,// 17
                309.3f-dx, dy-440.8f,// 18
                344.5f-dx, dy-459.1f,//
                300.0f-dx, dy-440.8f,//
                297.6f-dx, dy-431.2f,//
                348.7f-dx, dy-491.2f,//
                317.6f-dx, dy-474.0f,//
                327.0f-dx, dy-487.7f,//
                340.2f-dx, dy-497.0f,//
                330.3f-dx, dy-501.6f,//
                327.0f-dx, dy-504.0f,//
                347.7f-dx, dy-506.1f,//
                359.7f-dx, dy-488.8f,//
                371.5f-dx, dy-486.2f,//
                377.1f-dx, dy-473.0f,//
                369.4f-dx, dy-463.7f,// 32
        };
        vertices_mano_i = new float[] {
                304.9f-dx, dy-230.8f,// 0
                297.4f-dx, dy-222.0f,//
                293.7f-dx, dy-233.8f,//
                301.8f-dx, dy-227.2f,//
                303.6f-dx, dy-222.4f,//
                300.2f-dx, dy-219.7f,//
                295.9f-dx, dy-226.8f,//
                288.9f-dx, dy-235.0f,//
                299.3f-dx, dy-237.1f,//
                294.4f-dx, dy-242.4f,//
                288.3f-dx, dy-246.1f,//
                301.0f-dx, dy-223.5f,//
                292.8f-dx, dy-248.7f,//
                292.0f-dx, dy-262.5f,//
                287.4f-dx, dy-261.5f,//
                281.3f-dx, dy-250.9f,//
                282.1f-dx, dy-272.3f,//
                281.8f-dx, dy-286.6f,//
                305.9f-dx, dy-230.5f,//
                298.2f-dx, dy-223.0f,// 19
        };
        vertices_mano_d = new float[]{
                565.3f-dx, dy-295.8f,// 0
                561.1f-dx, dy-286.1f,//
                532.7f-dx, dy-264.8f,//
                549.0f-dx, dy-269.2f,//
                568.4f-dx, dy-275.4f,//
                556.5f-dx, dy-267.4f,//
                556.5f-dx, dy-258.6f,//
                538.0f-dx, dy-266.2f,//
                551.9f-dx, dy-296.7f,//
                546.5f-dx, dy-278.0f,//
                506.8f-dx, dy-286.4f,//
                456.4f-dx, dy-328.5f,//
                519.6f-dx, dy-318.6f,//
                471.9f-dx, dy-337.0f,//
                502.5f-dx, dy-330.2f,//
                495.7f-dx, dy-327.8f,//
                451.3f-dx, dy-307.4f,//
                452.6f-dx, dy-278.3f,//
                462.5f-dx, dy-267.4f,//
                489.0f-dx, dy-263.0f,// 19
        };
        vertices_iris = new float[]{
                350.5f-dx, dy-258.5f,// 0
                346.8f-dx, dy-257.7f,//
                351.7f-dx, dy-246.8f,// 2

                302.1f-dx, dy-247.4f,// 3
                303.6f-dx, dy-238.8f,//
                298.8f-dx, dy-248.7f,// 5
        };
        vertices_ojos = new float[]{
                395.0f-dx, dy-234.4f,// 0
                387.7f-dx, dy-247.4f,//
                333.0f-dx, dy-246.5f,//
                351.7f-dx, dy-246.8f,//
                374.5f-dx, dy-257.7f,//
                363.8f-dx, dy-259.2f,//
                350.5f-dx, dy-258.5f,//
                346.8f-dx, dy-257.7f,//
                338.7f-dx, dy-254.2f,//
                334.4f-dx, dy-250.8f,//
                333.0f-dx, dy-246.5f,// 10
                310.8f-dx, dy-241.6f,// 11
                305.9f-dx, dy-230.5f,//
                299.3f-dx, dy-237.1f,//
                303.6f-dx, dy-238.8f,//
                302.2f-dx, dy-247.4f,//
                298.8f-dx, dy-248.7f,//
                294.4f-dx, dy-242.4f,//
                292.8f-dx, dy-248.7f,// 18
        };
        vertices_boca = new float[] {
                371.9f-dx, dy-345.5f,// 0
                383.8f-dx, dy-327.7f,//
                366.6f-dx, dy-302.9f,//
                390.1f-dx, dy-307.3f,//
                365.2f-dx, dy-338.5f,//
                351.7f-dx, dy-338.1f,//
                345.5f-dx, dy-298.6f,//
                340.2f-dx, dy-334.4f,//
                317.6f-dx, dy-335.8f,//
                309.2f-dx, dy-292.0f,//
                295.1f-dx, dy-289.1f,//
                273.1f-dx, dy-335.4f,//
                281.8f-dx, dy-286.6f,//
                295.0f-dx, dy-349.6f,//
                284.2f-dx, dy-363.6f,//
                271.4f-dx, dy-375.8f,//
                280.5f-dx, dy-374.4f,// 16
        };
        vertices_lengua = new float[] {
                342.4f-dx, dy-389.2f,//    0
                371.9f-dx, dy-345.5f,//
                351.7f-dx, dy-338.1f,//
                313.9f-dx, dy-359.6f,//
                308.8f-dx, dy-381.1f,//
                295.9f-dx, dy-378.3f,//
                340.2f-dx, dy-334.4f,//
                284.2f-dx, dy-363.6f,//
                280.5f-dx, dy-374.4f,//
                295.0f-dx, dy-349.6f,//
                317.6f-dx, dy-335.8f,//     10
        };
        vertices_dientes = new float [] {
                342.4f-dx, dy-389.2f,//    0
                323.2f-dx, dy-384.6f,//
                328.0f-dx, dy-398.5f,//
                312.4f-dx, dy-402.0f,//
                308.8f-dx, dy-381.1f,//
                294.4f-dx, dy-400.1f,//
                295.9f-dx, dy-378.3f,//
                285.8f-dx, dy-391.0f,//
                280.5f-dx, dy-374.4f,//
                278.6f-dx, dy-383.2f,//    9
                390.1f-dx, dy-307.3f,//    10
                399.0f-dx, dy-280.2f,//
                381.3f-dx, dy-277.3f,//
                366.6f-dx, dy-302.9f,//
                362.5f-dx, dy-274.2f,//
                345.5f-dx, dy-298.6f,//
                340.8f-dx, dy-270.7f,//
                329.3f-dx, dy-295.7f,//
                321.9f-dx, dy-267.4f,//
                309.2f-dx, dy-292.0f,//
                306.7f-dx, dy-264.7f,//
                295.1f-dx, dy-289.1f,//
                292.0f-dx, dy-262.5f,//
                281.8f-dx, dy-286.6f,//    23
        };
        vertices = new float [] {
                // GRUPO 1
                197.8f-dx, dy-261.5f,//    0
                233.5f-dx, dy-234.4f,//    1
                210.7f-dx, dy-194.4f,//   2
                186.5f-dx, dy-216.3f,//   3
                205.7f-dx, dy-187.5f,//   4
                233.5f-dx, dy-172.1f,//   5
                215f-dx, dy-164.9f,//   6
                162.5f-dx, dy-158.4f,//   7
                182.4f-dx, dy-143.2f,//   8
                170.2f-dx, dy-128.4f,//   9
                146.2f-dx, dy-127.1f,//  10
                177.9f-dx, dy-94.7f,//   11
                195.8f-dx, dy-132.2f,//  12
                203.2f-dx, dy-107.1f,//  13
                223.4f-dx, dy-129.2f,//  14
                235.1f-dx, dy-115.9f,//  15
                214f-dx, dy-69.6f,//   16
                253.4f-dx, dy-162.3f,//  17
                221.2f-dx, dy-138f,//    18
                258.9f-dx, dy-139f,//    19
                292.4f-dx, dy-190.9f,//  20
                279.3f-dx, dy-115.3f,//  21
                293.5f-dx, dy-149.7f,//  22
                321.8f-dx, dy-146.3f,//  23
                321.8f-dx, dy-188.5f,//  24

                // GRUPO 2
                292.4f-dx, dy-616.2f,//  25
                332.4f-dx, dy-556.6f,//  26
                290.8f-dx, dy-565.7f,//  27
                255.8f-dx, dy-551.4f,//  28
                247.7f-dx, dy-514.2f,//  29
                275.5f-dx, dy-522.3f,//  30
                259.5f-dx, dy-451.7f,//  31
                221.4f-dx, dy-505.9f,//  32
                175.7f-dx, dy-492.3f,//  33
                183f-dx, dy-602.1f,//  34
                220f-dx, dy-461.6f,//  35
                231.7f-dx, dy-429.7f,//  36
                189.7f-dx, dy-420.1f,//  37
                216.3f-dx, dy-352f,//  38
                251.1f-dx, dy-343.9f,//  39
                198.1f-dx, dy-311.8f,//  40

                // GRUPO 3
                139.5f-dx, dy-593.6f,//  41
                130.7f-dx, dy-	472.0f,//  42
                91.7f-dx, dy-	488.1f,//  43
                91.7f-dx, dy-	466.2f,//  44
                74.5f-dx, dy-	492.3f,//  45
                55.0f-dx, dy-	420.4f,//  46
                86.7f-dx, dy-	436.3f,//  47
                141.5f-dx, dy-	444.8f,//  48
                174.0f-dx, dy-	466.2f,//  49
                151.6f-dx, dy-	411.4f,//  50
                111.2f-dx, dy-	436.3f,//  51
                134.1f-dx, dy-	377.6f,//  52
                80.4f-dx, dy-	345.5f,//  53
                70.7f-dx, dy-	396.3f,//  54

                // GRUPO 4
                140.1f-dx, dy-	281.1f,//  55
                99.0f-dx, dy-	237.1f,//  56
                88.9f-dx, dy-	263.2f,//  57
                58.1f-dx, dy-	266.5f,//  58
                71.8f-dx, dy-	233.2f,//  59
                33.4f-dx, dy-	223.6f,//  60
                84.4f-dx, dy-	247.2f,//  61
                71.8f-dx, dy-	220.5f,//  62
                56.4f-dx, dy-	203.0f,//  63
                80.5f-dx, dy-	192.7f,//  64
                90.8f-dx, dy-	214.9f,//  65
                58.1f-dx, dy-	167.4f,//  66
                82.4f-dx, dy-	160.3f,//  67
                96.7f-dx, dy-	159.7f,//  68
                93.0f-dx, dy-	128.3f,//  69
                127.9f-dx, dy-	144.3f,//  70
                162.5f-dx, dy-	214.1f,//  71

        };
    }
    void llenaIndices(){
        indices_quino = new short [] {
                0,1,2,// 0
                1,2,3,//
                3,4,6,//
                4,5,6,//
                6,7,8,//
                6,8,9,//
                1,9,10,//
                1,10,11,//
                12,13,14,//
                13,14,15,//
                13,15,16,//
                15,16,17,//
                16,17,18,//
                16,18,19,//
                18,19,20,//
                19,20,22,//
                19,21,22,// 16
        };
        indices_cuerpo = new short [] {
                0,1,2,//0
                1,2,3,//
                1,4,5,//
                1,4,6,//
                3,4,5,//
                4,6,7,//
                3,4,8,//
                3,8,9,//
                3,9,10,//
                8,9,11,//
                8,11,12,//
                11,12,13,//
                12,13,14,//
                13,14,15,//
                13,15,16,//
                13,16,17,//
                13,17,18,//
                13,18,19,//
                13,19,20,//
                16,17,21,//
                17,21,22,//
                17,22,23,//
                22,24,25,// 22
                4,8,26,//
                27,28,29,//
                8,26,30,//
                26,30,31,//
                26,31,32,//
                26,33,34,//
                33,34,35,//
                8,30,36,//
                8,12,36,//
                12,36,37,//
                12,14,37,//
                14,37,38,//
                36,37,39,//
                37,38,40,//
                37,39,40,//
                39,40,41,// 38
                40,41,42,//
                40,42,43,//
                40,43,44,//
                40,44,45,//
                40,45,46,//
                40,46,47,//
                40,47,48,//
                40,48,49,//
                48,49,50,//
                49,50,51,//
                49,51,52,//
                58,52,53,//
                58,53,54,//
                58,54,55,//
                58,55,56,//
                58,56,57,//
                58,57,49,// 55
                41,42,59,//
                42,59,60,//
                42,60,61,//
                42,61,62,//
                42,62,63,//
                42,63,64,//
                41,43,64,//
                61,65,66,//
                65,66,67,//
                68,61,62,//
                68,62,63,//
                68,63,64,// 67
                64,69,70,//
                64,69,71,//
                69,71,72,//
                71,73,74,//
                73,74,75,//
                74,75,76,//
                64,71,77,//
                71,74,77,//
                74,77,78,//
                74,76,78,//
                76,78,79,//
                80,79,78,//
                80,78,81,//
                80,81,82,//
                43,64,84,//
                78,83,84,//
                78,82,83,//
                77,78,84,//
                83,84,85,//
                43,84,86,//
                43,52,86,//
                52,84,86,//
                52,53,84,//
                53,54,85,//
                53,84,85,// 92
        };
        indices_pies = new short [] {
                0,1,2,// 0
                0,2,3,//
                1,2,4,//
                2,4,5,//
                2,3,5,//
                3,5,6,//
                3,6,7,//
                6,7,8,//
                3,7,9,//
                7,9,10,//
                7,8,10,//
                8,10,11,//
                8,11,13,//
                10,11,12,//
                8,13,14,//
                8,14,15,//
                8,15,16,//
                5,6,16,//
                4,16,17,// 18
                14,18,19,// 19
                18,19,20,//
                18,20,21,//
                19,20,22,//
                20,22,23,//
                22,23,24,//
                22,24,25,//
                24,25,26,//
                24,26,27,//
                22,25,28,//
                22,28,29,//
                28,29,30,//
                19,22,29,//
                19,29,30,//
                19,30,31,//
                19,31,32,// 34
        };
        indices_mano_i = new short [] {
                0,1,2,// 0
                3,4,11,//
                3,5,19,//
                2,6,7,//
                7,8,18,//
                7,8,9,//
                7,9,10,//
                9,10,12,//
                7,14,15,//
                10,12,13,//
                10,13,14,//
                13,14,16,//
                14,15,16,//
                13,16,17,// 13
        };
        indices_mano_d = new short [] {
                0,1,2,// 0
                1,2,3,//
                1,3,4,//
                3,4,5,//
                3,5,6,//
                3,6,7,//
                0,8,9,//
                2,9,10,//
                8,9,10,//
                8,10,11,//
                8,11,12,//
                11,12,13,//
                12,14,15,//
                2,11,16,//
                2,16,17,//
                2,17,18,//
                2,18,19,// 16
        };
        indices_iris = new short [] {
                0,1,2, //
                3,4,5, //
        };
        indices_ojos = new short [] {
                0,1,2, // 0
                1,3,4,//
                3,4,5,//
                3,5,6,//
                3,6,7,//
                3,7,8,//
                3,8,9,//
                3,9,10,// 7
                11,12,13,// 8
                11,14,15,//
                14,15,16,//
                13,14,16,//
                13,16,17,//
                16,17,18,// 13
        };
        indices_boca = new short [] {
                0,1,2,// 0
                1,2,3,//
                0,2,4,//
                0,4,5,//
                2,4,5,//
                2,5,6,//
                5,6,7,//
                6,7,8,//
                6,8,9,//
                8,9,10,//
                8,10,11,//
                10,11,12,//
                8,11,13,//
                11,13,14,//
                11,14,15,//
                14,15,16,// 15
        };
        indices_lengua = new short [] {
                0,1,2,// 0
                0,2,3,//
                0,3,4,//
                3,4,5,//
                2,3,6,//
                5,6,7,//
                5,7,8,//
                6,7,9,//
                6,9,10,// 8
        };
        indices_dientes = new short [] {
                0, 1, 2,    //t0
                1, 2, 3,    //t0
                1, 3, 4,    //t0
                3, 4, 5,    //t0
                4, 5, 6,    //t0
                5, 6, 7,    //t0
                6, 7, 8,    //t0
                7, 8, 9,    //t7
                10,11,12, //8
                10,12,13, //
                12,13,14, //
                13,14,15, //
                14,15,16, //
                15,16,17, //
                16,17,18, //
                17,18,19, //
                18,19,20, //
                19,20,21, //
                20,21,22, //
                21,22,23, //19
        };
        indices = new short [] {
                // GRUPO 1 24=triangulos
                2, 1, 0,    //t0
                0, 2, 3,    //t1
                2, 3, 4,    //t2
                2, 4, 5,    //t3
                4, 5, 6,    //t4
                4, 6, 7,    //t5
                6, 7, 8,    //t6
                7, 8, 9,    //t7
                7, 9, 10,    //t8
                9, 10, 11,    //t9
                9, 11, 12,    //t10
                8, 9, 12,    //t11
                11, 12, 13,    //t12
                12, 13, 14,    //t13
                16, 13, 14,    //t14
                14, 15, 16,    //t15
                5, 6, 17,    //t16
                18, 6, 17,    //t17
                17, 18, 19,    //t18
                17, 20, 19,    //t19
                19, 20, 21,    //t20
                20, 21, 22,    //t21
                20, 21, 22,    //t22
                23, 21, 22,    //t23
                23, 24, 22,    //t24

                // GRUPO 2 14-triangulos
                25, 26, 27,    // t25
                27, 28, 29,    // t26
                27, 29, 30,    // t27
                29, 30, 31,    // t28
                29, 31, 32,    // t29
                31, 32, 33,    // t30
                32, 33, 34,    // t31
                31, 33, 35,    // t32
                31, 35, 37,    // t33
                31, 36, 37,    // t34
                36, 37, 38,    // t35
                36, 38, 39,    // t36
                38, 39, 40,    // t37
                26, 27, 30,    // t38

                // GRUPO 3 12-triangulos
                41,42,43,     // t39
                42,43,44,     // t40
                43,45,46,     // t41
                43,44,46,     // t42
                44,46,47,     // t43
                44,47,51,     // t44
                44,48,51,     // t45
                48,50,51,     // t46
                48,49,50,     // t47
                47,51,54,     // t48
                51,52,53,     // t49
                51,53,54,     // t50

                // GRUPO 4 15- triangulos
                55,56,57,     // t51
                56,57,58,     // t52
                58,59,61,     // t53
                56,61,62,     // t54
                59,61,62,     // t55
                58,59,60,     // t56
                56,62,63,     // t57
                56,63,64,     // t58
                56,64,65,     // t59
                63,64,67,     // t60
                63,66,67,     // t61
                66,67,69,     // t62
                67,68,69,     // t63
                68,69,71,     // t64
                69,70,71,     // t65
        };
    }
    public float[] getVerticesTriangulo(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_dientes(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_dientes[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_dientes[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_dientes[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_dientes[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_dientes[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_dientes[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_dientes[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_dientes[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_dientes[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_lengua(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_lengua[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_lengua[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_lengua[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_lengua[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_lengua[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_lengua[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_lengua[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_lengua[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_lengua[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_boca(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_boca[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_boca[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_boca[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_boca[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_boca[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_boca[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_boca[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_boca[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_boca[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_ojos(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_ojos[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_ojos[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_ojos[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_ojos[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_ojos[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_ojos[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_ojos[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_ojos[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_ojos[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_iris(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_iris[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_iris[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_iris[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_iris[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_iris[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_iris[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_iris[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_iris[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_iris[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_mano_d(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_mano_d[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_mano_d[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_mano_d[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_mano_d[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_mano_d[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_mano_d[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_mano_d[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_mano_d[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_mano_d[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_mano_i(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_mano_i[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_mano_i[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_mano_i[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_mano_i[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_mano_i[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_mano_i[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_mano_i[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_mano_i[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_mano_i[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_pies(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_pies[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_pies[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_pies[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_pies[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_pies[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_pies[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_pies[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_pies[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_pies[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_cuerpo(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_cuerpo[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_cuerpo[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_cuerpo[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_cuerpo[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_cuerpo[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_cuerpo[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_cuerpo[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_cuerpo[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_cuerpo[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
    public float[] getVerticesTriangulo_quino(int nro_triangulo){
        // buscamos los indices que forman el triangulo que nos piden
        short indices_aux[] = new short[3];     //{ i1, i2, i3 }
        indices_aux[0] = this.indices_quino[(nro_triangulo*3) + 0];
        indices_aux[1] = this.indices_quino[(nro_triangulo*3) + 1];
        indices_aux[2] = this.indices_quino[(nro_triangulo*3) + 2];

        // buscamos los vertices que forman los indices que encotramos
        float vertices_aux[] = new float[6];    //{ i0=(x1,y1) , i1=(x2,y2) , i2=(x3,y3) }
        vertices_aux[0] = this.vertices_quino[(indices_aux[0]*2)+0];
        vertices_aux[1] = this.vertices_quino[(indices_aux[0]*2)+1];
        vertices_aux[2] = this.vertices_quino[(indices_aux[1]*2)+0];
        vertices_aux[3] = this.vertices_quino[(indices_aux[1]*2)+1];
        vertices_aux[4] = this.vertices_quino[(indices_aux[2]*2)+0];
        vertices_aux[5] = this.vertices_quino[(indices_aux[2]*2)+1];
        return vertices_aux;
    }
}
