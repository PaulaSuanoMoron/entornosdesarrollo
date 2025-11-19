package poo;

public class salaInfor extends sala {

    private int numEquipos;

    public salaInfor(String nombre, int capacidad, String pizarra, String tipo, boolean disponible, int numEquipos) {
        super(nombre, capacidad, pizarra, tipo, disponible);
        this.numEquipos = numEquipos;
    }
}

