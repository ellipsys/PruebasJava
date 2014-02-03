package com.caboa.PruebasJava;

import java.util.Scanner;

public class Funciones
{
    //Función que dice Hola Mundo.
    public void holaMundo()
    {
        System.out.println("Hola, mundo. Esto es una función.");
    }
    
    //Función que suma dos números.
    public void sumarEntrada()
    {
        int x, y, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        x = entrada.nextInt();
        System.out.println("Introduce otro número; ");
        y = entrada.nextInt();
        resultado = x + y;
        System.out.println(x + " + " + y + " es igual a: " + resultado);
    }
    
}
