package poo.practica6;
// necesario importar esta biblioteca para el tipo de variable date
import java.util.Date;
public class persona 
{

// 3b. Sus atributos
private String dni;
private String nombre;
private Date fechaNacimiento;

// 3e. Los atributos que representen relaciones
private direccion domicilio;

// 3d. Los constructores que consideres necesarios
 public persona(String dni, String nombre, Date fechaNacimiento, direccion domicilio) 
 {
 this.dni = dni;
 this.nombre = nombre;
 this.fechaNacimiento = fechaNacimiento;
 this.domicilio = domicilio;
}

// 3c. Sus métodos (no es necesario implementar su lógica, sólo establecer su definición)
public int getEdad() 
{
return 0; 
}



}
