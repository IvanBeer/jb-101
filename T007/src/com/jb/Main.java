package com.jb;

public class Main {

    public static void main(String[] args) {
        for (int x = 1; x != 4; x++){
            for(int y = 1; y != 6; y++){
                if(y != 5){
                    System.out.print(" * ");
                } else System.out.println(" * ");
            }
        }
    }
}