package poo;

import java.util.ArrayList;
import java.util.List;




// Praáctica 5, crear herencia de persona usuario
// extends para crear herencia

public class usuario extends personapoo 
{

    private int numSocio;
    private List<libro> librosPrestados;

    public usuario(int numSocio) 
    {
        this.numSocio = numSocio;
        this.librosPrestados = new ArrayList<>();
    }

    public int getNumSocio() 
    {
        return numSocio;
    }

    public void prestarLibro(libro l) 
    {
        librosPrestados.add(l);
        System.out.println("El usuario ha prestado: " + l.getTitulo());
    }

   
}


