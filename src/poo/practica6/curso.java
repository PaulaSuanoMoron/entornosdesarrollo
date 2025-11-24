package poo.practica6;

import java.util.List;

public class curso 
{
// b. Sus atributos
private String codigo;
private String nombre;
private int cupoMaximo;

// e. Los atributos que representen relaciones
private List<matricula> inscripciones;
private List<horario> horarios;

// d. Los constructores que consideres necesarios
public curso(String codigo, String nombre, int cupoMaximo, List<matricula> inscripciones, List<horario> horarios) 
{
this.codigo = codigo;
this.nombre = nombre;
this.cupoMaximo = cupoMaximo;
this.inscripciones = inscripciones;
this.horarios = horarios;
}

// c. Sus métodos (no es necesario implementar su lógica, sólo establecer su definición)
public matricula inscribir(estudiante e) 
{
return null;
}
}  

