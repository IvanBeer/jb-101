package com.jb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String g = "Троллейбус";
        String y = "Сдаюсь";
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");

        for( int x = 0; x !=3; x++){
            String answer = in.nextLine();
            if( answer.equals(g)){
                System.out.println("Правильно!");
                break;
            } else if( answer.equals(y)){
                System.out.println("Правильный ответ: троллейбус.");
                break;
            } else System.out.println("Подумай еще.");
        }
        // java это вам не C#
        // с ним просто не бывает "12" == "12"  -> True
    }
}
