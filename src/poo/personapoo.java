package poo;

public class personapoo 
{
    // Ejercicio 1: crea atributos.
    String apellidos;
    String dni;
    String email;
    String telefono;
    String profesion;
    int aniosExperiencia;
    int edad;


    // Ejercicio 2: a partir de la clase Personapoo amplía sus funcionalidades añadiendo 
    //una función get y set para cada atributo.

    // get para leer un valor ya puesto:
    public String getApellidos()
    {
        return apellidos;
    }

    private String getDni()
    {
        return dni;
    }

    private String getEmail()
    {
        return email;
    }

    private String getTelefono()
    {
        return telefono;
    }

    private String getProfesion()
    {
        return profesion;
    }

    private int getAniosExperiencia()
    {
        return aniosExperiencia;
    }


    // set para asignar un valor:
     private void setApellidos(String apellidos) 
     { 
        this.apellidos= apellidos; 
     }

     private void setDni(String dni)
     {
        this.dni= dni;
     }

     private void setEmail(String email)
     {
        this.email= email;
     }

     private void setTelefono(String telefono)
     {
        this.telefono=telefono;
     }

     private void setProfesion(String profesion)
     {
        this.profesion=profesion;
     }

     private void setAniosExperiencia(int aniosExperiencia)
     {
        this.aniosExperiencia=aniosExperiencia;
     }

     // Eejercicio 3: metodo estaJubilado().
     public boolean estaJubilado()
     {
        if (this.edad>65)
        {
        System.out.println("La persona está jubilada");
        return true; 
        }

        else if (this.edad>18)
        {
        System.out.println("La persona está en edad para trabajar");
        }
        else 
        {
            System.out.println("La persona es menor y no puede trabajar");
        }
        return false;
    }

    // Ejercicio 4.1: Se implemente un método mostrarInfo() en cada clase que muestre sus datos por consola.
    public void mostrarinformacion()
    {
        System.out.println("Información sobre la persona:");
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Emailk: " + email);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Profesión: " + profesion);
        System.out.println("Años experiencia: " + aniosExperiencia);
        System.out.println("Edad: " + edad);
    }

}

