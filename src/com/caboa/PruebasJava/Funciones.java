package com.caboa.PruebasJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.net.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Funciones
{
    //Función que dice Hola Mundo.
    public void holaMundo()
    {
        System.out.println("Hola, mundo. Esto es una funcion.");
    }
    
    //Función que suma dos números.
    public void sumarEntrada()
    {
        //Crea las variables con el resultado y las dos entradas.
        int x, y, resultado;
        Scanner entrada = new Scanner(System.in); //Pide entrada.
        System.out.println("Introduce un número: ");
        x = entrada.nextInt(); //Pide otra entrada.
        System.out.println("Introduce otro número; ");
        y = entrada.nextInt(); //Suma la entrada.
        resultado = x + y;
        System.out.println(x + " + " + y + " es igual a: " + resultado); //Lo saca todo por la salida de consola.
    }
    
    //Función que descarga un archivo.
    public void descargarArchivo()
    {
        Scanner escaner = new Scanner(System.in);
        //Bloque para crear el directorio y si existe borrar todo lo que hay dentro.
        try
        {
            File directory = new File("\\PruebaJavaDescarga");
            if(!directory.exists())
            {
                directory.mkdir();
            }
            else
            {
                File[] archivos = directory.listFiles();
                for (File archivo : archivos) {
                    archivo.delete();
                }
                directory.delete();
                directory.mkdir();
            }
            System.out.println("Carpeta creada, descargando archivo...");
            URL website = new URL("http://www.quickmeme.com/img/a8/a8aa5dc509f0d6fc9269c8be93e4341c83645c6120fdcd9d0f983fbb92274bf1.jpg".toString());
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("\\PruebaJavaDescarga\\imagen.jpg");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            System.out.println("Archivo descargado.\nPresione enter para salir.");
            escaner.nextLine();
        }
        //Si hay algún error, se muestra en pantalla.
        catch (IOException ex)
        {
            System.out.println(ex.toString());
        }
        
    }
    
}