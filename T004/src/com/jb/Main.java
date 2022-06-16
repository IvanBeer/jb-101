package com.jb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        for (int x = num-1; x != 0; x--)
        {
            num = num + x;
        }
        System.out.printf("Ответ: " + num);
        in.close();
    }
}
