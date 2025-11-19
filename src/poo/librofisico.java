package poo;


// Praáctica 5, crear herencia de persona usuario

public class librofisico extends libro
{

    private int numPaginas;
    private String ubicacion;

    public librofisico(String titulo, int isbn, String editorial, String idioma, int anio, String disponibleReserva, int numPaginas, String ubicacion) 
    {
        // ya eran de libro estos atributos, hay que definirlos otra vez
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.idioma = idioma;
        this.anio = anio;
        this.dispobibleReserva = disponibleReserva;

        this.numPaginas = numPaginas;
        this.ubicacion = ubicacion;
    }

}


