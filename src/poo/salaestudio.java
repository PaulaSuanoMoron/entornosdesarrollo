package poo;


//Practica 4

public class salaestudio extends sala 
{

    private int numMesas;

    public salaestudio(String nombre, int capacidad, String pizarra, String tipo, boolean disponible, int numMesas) 
    {
        super(nombre, capacidad, pizarra, tipo, disponible);
        this.numMesas = numMesas;
    }

}


