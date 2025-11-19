package poo;

import java.util.ArrayList;
import java.util.List;
public class biblio 

{
    
     // Ejercicio 3.5: crea una biblioteca que incluya:

     // Caracteristicas:
     private String nombre;
     private String direccion;
     private int horarioApertura; //hora por defecto 9
     private int horarioCierre; //hora por defeco 22

     public biblio (String nombre, String direccion, int horarioApertura, int horarioCierre)
     {
        this.nombre=nombre;
        this.direccion=direccion;
        this.horarioApertura=9;
        this.horarioCierre=22;
     }

     // Funcionalidades:


     //GET
     private String getNombre()
    {
        return nombre;
    }
    
    private String getDireccion()
    {
        return direccion;
    }

    private int getHorarioApertura()
    {
        return horarioApertura;
    }

    private int getHorarioCierre()
    {
        return horarioCierre;
    }


    //SET
     private void setNombre(String nombre) 
     { 
        this.nombre= nombre; 
     } 

     private void setDireccion(String direccion) 
     { 
        this.direccion= direccion; 
     } 

     private void setHorarioApertura(int horarioApertura) 
     { 
        this.horarioApertura= horarioApertura; 
     } 

     private void setHorarioCierre(int horarioCierre) 
     { 
        this.horarioCierre= horarioCierre; 
     } 



     public void estaAbierta(int hora)
     // int hora es una variable local que solo existe dentro de los parametros del metodo estaAbierta
     {
        if (hora<this.horarioApertura || hora>this.horarioCierre) 
        {
            System.out.println("La biblioteca esta cerrada");
        }
       else 
       {
        System.out.println("La biblioteca está abierta");
       }

      }




   // Ejercicio 4.1: Se implemente un método mostrarInfo() en cada clase que muestre sus datos por consola.
    public void mostrarinformacion()
    {
        System.out.println("Información sobre la biblioteca:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Horario de apertura: " + horarioApertura);
        System.out.println("Horario de cierre: " + horarioCierre);
        System.out.println("Libros disponibles: ");
        mostrarLibros();
        System.out.println("Salas disponibles: ");
        mostrarSalas();

        // de la practica 5
        System.out.println("Personas registradas en la biblioteca:");

        for (personapoo p : personas) 
        {
        p.mostrarinformacion();
        }

        System.out.println("Responsables de sala:");
        for (sala s : salas) 
        {
        System.out.println("Sala: " + s.getNombre());
        // null para cuando una variable es nula no tiene valor
        if (s.getResponsable() != null)
            System.out.println("El responsable es: " + s.getResponsable().getApellidos());
        else
        System.out.println("No hay");
        }

    }

    // Ejercicio 4.2: 

    // Usa List<Libro> y List<Sala> como atributos privados.

   private List<libro> libros;
   private List<sala> salas;

   // Inicialízalas en el constructor con new ArrayList<>().
   {
      this.libros = new ArrayList<>();
      this.salas = new ArrayList<>();
   }
   
   // Añadir y eliminar libros (addLibro, removeLibro).

   // add libro
    public void addLibro(libro libro) 
    {
      libros.add(libro);
    }
   
   // remove libro
    public void removeLibro(libro libro) 
    {
      libros.remove(libro);
    }
   

    //Añadir y eliminar salas (addSala, removeSala).

    // add sala
    public void addSala(sala sala)
    {
      salas.add(sala);
    }

    // remove sala
    public void removeSala(sala sala)
    {
      salas.remove(sala);
    }


    // Mostrar los libros y salas disponibles

    // mostrar sala:
public void mostrarSalas()
    {
      for (sala sala : salas)
      {
         sala.mostrarinformacion();
      }
    }


    // mostrar libros
        public void mostrarLibros()
    {
      for (libro libro : libros)
      {
         libro.mostrarinformacion();
      }
    }

    // Crea un método mostrarBiblioteca() que imprima el contenido completo.
    // lo implemento en el anterior ya creado.

    /*Añade un método buscarLibroPorTitulo(String titulo) que
      devuelva el libro si existe o null en caso contrario */

       public libro buscarLibroPorTitulo(String titulo) 
       {

        for (libro libro : libros) 
        {
         
         if (libro.getTitulo().equalsIgnoreCase(titulo)) 
         {
         return libro;
         }

        }

        return null;
      }
   

     // Amplía la clase Biblioteca para que contenga una lista de Sala.

    //Implementa en ella los siguientes métodos:
      //i. addSala(Sala sala): Añade una sala a la biblioteca. (ya hecho anteriormente)

      //ii. mostrarSalas(): Muestra todas las salas con su número de personas. (Modificamos sala.java)
      
      public void mostrarSalasYpersonas()
      {
        System.out.println("Salas y número de personas dentro");
        for (sala sala : salas) 
        {
        System.out.println("Sala: " + sala.getNombre() + " Personas dentro: " + sala.obtenerNumeroPersonasDentro());
        }
      }
    

      //iii. mostrarSalasDisponibles(): Muestra solo las salas que tienen 0 personas.
      public void mostrarSalasDisponibles()
      {
        System.out.println("Salas con 0 personas dentro:");
        for (sala sala : salas) 
        {
        if (sala.obtenerNumeroPersonasDentro() == 0)
            sala.mostrarinformacion();
        }
      }


      // En la clase Biblioteca, añade un método para mostrar cuántas personas hay en total en todas las salas.
      public void totalDePersonasEnSala() 
      {
      int total=0;
      for (sala sala : salas) 
      {
        total= total + sala.obtenerNumeroPersonasDentro();
      }

      System.out.println("Total de personas en todas las salas: " + total);
    }



    // PRÁCTICA 5
    List<personapoo> personas;
    

    public void registrarVisita(personapoo p)
    {
    System.out.println("Visita registrada de: " + p.getApellidos());
    personas.add(p);
    }

    public void asignarResponsable(sala s, personapoo p)
    {
    s.setResponsable(p);
    }
  
    






}
      





















