package com.ibexsys.pad1;

/**
 * Created by tj on 2/15/17.
 */
public class Array3D {
    int array[][][] = new int[1][2][3];

    public static void main(String[] args) {


        Array3D a = new Array3D();
        a.printArray();


    }

    public void printArray() {

        array[0][0][0] = 8;
        array[0][0][2] = 12;
        array[0][0][1] = 10;
        array[0][1][0] = 40;
        array[0][1][2] = 11;
        array[0][1][1] = 21;

        for (int i = 0; i < 1; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 3; k++)
                    System.out.println(array[i][j][k]);

    }


}
