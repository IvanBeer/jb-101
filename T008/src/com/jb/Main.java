package com.jb;

public class Main {

    public static void main(String[] args) {

	    int y = 1;
        int g = 0;
        int h = 0;

        for ( int x = 0; x != 11; x++ ){
            if( h <= g && h <= y){
                h = g + y;
                System.out.print(h + " ");
            }
            if( y <= g && y <= h){
                y = g + h;
                System.out.print(y + " ");
            }
            if( g <= y && g <= h){
                g = y + h;
                System.out.print(g + " ");
            }
        }
    }
}
