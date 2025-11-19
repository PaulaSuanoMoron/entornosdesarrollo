package poo;

import java.util.ArrayList;
import java.util.List;


// act4

public class salalectura extends sala 
{
    private List<libro> libros;

    public salalectura(String nombre, int capacidad, String pizarra, String tipo, boolean disponible) 
    {
        super(nombre, capacidad, pizarra, tipo, disponible);
        this.libros = new ArrayList<>();
    }

    public void addLibro(libro l) 
    {
        libros.add(l);
    }

}


