package com.tarea.openbootcamp;

public class Tipos {

    public static void main(String[] args) {

        System.out.println("tipos de datos");
        // 1. numericos

        // 1.1 enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        long numeroTelefono = 666555444;
        // long precio = null;

        System.out.println("enteros: " + variable1 + " , " + variable2 + " , " + variable3 + " , " + variable4);

        // 1.2 decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;
        variable6 = 20.5d;
        double precioSilla = 49.99;
        System.out.println("decimales: " + variable5 + " , " + variable6);
        // 2 booleano
        boolean variable7 = false;
        boolean variable8 = true;
        System.out.println("booleano: "+ variable7 + " , " + variable8);

        // 3 texto
        char variable9 = 'a';
        String variable10 = "Lorem ipsum dolor sit amet.....";
        System.out.println("Texto: " + variable9 + " , " + variable10);

    }

}


