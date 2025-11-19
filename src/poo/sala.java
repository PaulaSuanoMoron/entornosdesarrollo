package poo;
import java.util.ArrayList;
import java.util.List;

public class sala 
{
    
    
// Ejercicio 6: Crea una nueva clase que se llame Sala y que incluya:
// caracteristicas
private String nombre;
private int capacidad;
private String pizarra;
private String tipo;
private boolean disponible;

public sala (String nombre, int capacidad, String pizarra, String tipo, boolean disponible)
{
this.nombre=nombre;
this.capacidad=capacidad;
this.pizarra=pizarra;
this.tipo=tipo;
this.disponible=disponible; 
}

/*estaDisponible() - Indicará a través de un mensaje por pantalla si la sala se 
encuentra disponible para su reserva */ 

public void estaDisponible()
{
    if (disponible)
    {
        System.out.println("La sala está disponible para la reserva");
    }
    else
    {
        System.out.println("La sala no está disponible para la reserva");
    }
}

    // Ejercicio 4.1: Se implemente un método mostrarInfo() en cada clase que muestre sus datos por consola.
    public void mostrarinformacion()
    {
        System.out.println("Información sobre la sala:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pizarra: " + pizarra);
        System.out.println("Tipo: " + tipo);
        System.out.println("Disponible para reserva: " + disponible);
        

    }

    // PRACTICA 4

    // Ejercicio 3:
    private List<personapoo> personasDentro;
    {
        this.personasDentro= new ArrayList<>();
    }

    // entrarPersona(Persona p): Considera que no puede superar su capacidad.
    // (metodo para permitir o no entrar a una persona a la sala)
    public void entrarPersona(personapoo x)
    // persona x hace referencia a cualquier persona
    {
        if (personasDentro.size()<capacidad)
        //.size devuelve el numero de personas en sala
        {
            personasDentro.add(x);
            System.out.println(x.getApellidos() + " ha entrado en la sala.");
        }
        else
        {
            System.out.println(x.getApellidos() + " no puede entrar en la sala");

        }
    }



    private personapoo responsable;

    public void setResponsable(personapoo p) {
        this.responsable = p;
    }

   
public String getNombre() {
        return nombre;
    }


public personapoo getResponsable() {
    return responsable;
}

public int obtenerNumeroPersonasDentro() {
        return personasDentro.size();
    }

}
