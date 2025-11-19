package poo;

public class libro {
    // Ejercicio 4: crea las siguientes caracteristicas y funcionalidades.

    // Características
    String titulo;
    int isbn;
    String editorial;
    String idioma;
    int numPaginas;
    int anio;
    String dispobibleReserva;

    //Funcionalidades
    // GET
        
    
    public String getTitulo()
    {
        return titulo;
    }
    private int getIsbn()
    {
        return isbn;
    }
   
    private String getEditorial()
    {
        return editorial;
    }

    private String getIdioma()
    {
        return idioma;
    }

    private int getNumPaginas()
    {
        return numPaginas;
    }

    private int getAnio()
    {
        return anio;
    }

    private String getDisponibleReserva()
    {
        return dispobibleReserva;
    }


    // SET
     private void setTitulo(String titulo) 
     { 
        this.titulo= titulo;
     } 
     
     private void setIsbn(int isbn) 
     { 
        this.isbn= isbn; 
     } 
     
     private void setEditorial(String editorial) 
     { 
        this.editorial= editorial; 
     } 
     
     private void setIdioma(String idioma) 
     { 
        this.idioma= idioma; 
     } 
     
     private void setNumPaginas(int numPaginas) 
     { 
        this.numPaginas= numPaginas; 
     } 
     
     private void setAnio(int anio) 
     { 
        this.anio= anio; 
     } 
     
     private void setDisponibleReserva(String disponibleReserva) 
     { 
        this.dispobibleReserva= disponibleReserva; 
     }


    /*estaDisponible(): Indicará a través de un mensaje por pantalla si el libro se encuentra
     disponible para su reserva*/
     private boolean disponible;
     public void estaDisponible()
     {
        if (disponible)
        {
        System.out.println("El libro " + titulo + " no está disponible para reservar");
        }

        else
        {
        System.out.println("El libro " + titulo + " no está disponible para reservar");
        }
     }

     /*esExtranjero() - Indicará a través de un mensaje por pantalla si e 
     libro está escrito en un idioma diferente al español.*/
     public void esExtranjero()
     {
        if (idioma.equalsIgnoreCase("espaniol"))
        {
            System.out.println("El libro no es extranjero, está en español");
        }
        else
        {
            System.out.println("El libro está escrito en otro idioma que no es español, es extranjero");
        }
     }


     /*información() - Indicará a través de un mensaje por pantalla la información del 
     libro con el siguiente formato: “Libro: Título - Editorial (Año). 
     Idioma, número de páginas. Está /No está disponible”. */
     private String disponibilidad;
     public void informacion()
     {
        // Con esto damos dos posibles valores a disponibilidad, si la 1º no es true, pasa a la 2º.
        disponibilidad = disponible ? "Está disponible" : "No está disponible";

        System.out.println("Libro: " + titulo + " - " + editorial + "(" + anio + ")." 
        + idioma + ", " + numPaginas + ". " + disponibilidad + ".");
     }


    // Ejercicio 4.1: Se implemente un método mostrarInfo() en cada clase que muestre sus datos por consola.
    public void mostrarinformacion()
    {
        System.out.println("Información sobre los libros:");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Editorial: " + editorial);
        System.out.println("Idioma: " + idioma);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Año: " + anio);
        System.out.println("Disponible para reserva: " + dispobibleReserva);

    }
}
