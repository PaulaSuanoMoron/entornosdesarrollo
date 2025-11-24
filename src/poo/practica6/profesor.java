package poo.practica6;

import java.util.Date;
import java.util.List;

public class profesor extends persona {

// b. Sus atributos
private double salario;

//e. Los atributos que representen relaciones
private List<curso> cursosDictados;

// d. Los constructores que consideres necesarios
public profesor(String dni, String nombre, Date fechaNacimiento, direccion domicilio, double salario, List<curso> cursosDictados) 
{
super(dni, nombre, fechaNacimiento, domicilio);

this.salario = salario;
this.cursosDictados = cursosDictados;

}

// c. Sus métodos (no es necesario implementar su lógica, sólo establecer su definición)
public void asignarCurso(curso c) 
{

}

}
