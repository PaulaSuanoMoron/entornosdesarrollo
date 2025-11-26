package poo.practica6;

import java.util.Date;

public class matricula 
{
// b. Sus atributos
private Date fecha;
private double notaFinal;

// e. Los atributos que representen relaciones
private estudiante estudiante;
private curso curso;

// d. Los constructores que consideres necesarios
public matricula(Date fecha, double notaFinal, estudiante estudiante, curso curso) 
{
this.fecha = fecha;
this.notaFinal = notaFinal;
this.estudiante = estudiante;
this.curso = curso;
}

// c. Sus métodos (no es necesario implementar su lógica, sólo establecer su definición)
public double calcularNotaFinal() 
{
return 0; 
}
}

