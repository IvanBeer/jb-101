package com.jb;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // C# 4live
	    Random rnd = new Random();

        int[] Array = new int[10];

        for(int x = 0; x != 10; x++){
            Array[x] = rnd.nextInt(6) + 1;
            System.out.print(Array[x]+" ");
        }
        System.out.println();

        int max = Array[0];
        int min = Array[0];
        double average1 = 0;

        for(int y = 0; y != 10; y++){
            if(min <= Array[y]) min = Array[y];
            if(max >= Array[y]) max = Array[y];
            average1 += Array[y];
        }
        average1 /= 10;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average1);
    }
}
