package poo;


// Praáctica 5, crear herencia de persona usuario

public class librodigi extends libro 
{

    private String formato;
    private double tamanioMB;

    public librodigi(String titulo, int isbn, String editorial, String idioma,int anio, String disponibleReserva,String formato, double tamanioMB) 
    {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.idioma = idioma;
        this.anio = anio;
        this.dispobibleReserva = disponibleReserva;
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

}


