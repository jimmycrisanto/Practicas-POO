package ec.edu.ister.vista;

import ec.edu.ister.modelo.*;

import ec.edu.ister.controlador.*;


import java.io.IOException;



//Clase principal que hará uso del servidor
public class AplicacionServidor
{
    public static void main(String[] args) throws IOException
    {        
        Servidor serv = new Servidor(); //Se crea el servidor
        
        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
    }
    

}
