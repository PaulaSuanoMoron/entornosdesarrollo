package poo.practica6;

import java.util.Date;
import java.util.List;

public class estudiante extends persona
{

//b. Sus atributos
private boolean repetidor;

// e. Los atributos que representen relaciones
private List<matricula> matriculas;

// d. Los constructores que consideres necesarios
public estudiante(String dni, String nombre, Date fechaNacimiento, direccion domicilio, boolean repetidor, List<matricula> matriculas) 
{
super(dni, nombre, fechaNacimiento, domicilio);
this.repetidor = repetidor;
this.matriculas = matriculas;
}

//c. Sus métodos (no es necesario implementar su lógica, sólo establecer su definición)
public matricula inscribirse(curso c) 
{
return null; 
}
}


