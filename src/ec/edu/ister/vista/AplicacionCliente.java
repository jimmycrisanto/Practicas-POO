package ec.edu.ister.vista;
import ec.edu.ister.controlador.Conex;
import ec.edu.ister.modelo.*;


import java.io.IOException;


//Clase principal que hará uso del cliente
public class AplicacionCliente
{
    public static void main(String[] args) throws IOException
    {  
        Cliente cli = new Cliente(); //Se crea el cliente
        
        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
}
    