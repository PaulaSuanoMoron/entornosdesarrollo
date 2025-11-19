package poo;

public class main 

{
public static void main(String[] args)

{
// 1. Crear biblioteca
biblio biblioteca = new biblio("Central", "Calle Larga", 9, 22);

// 2. Crear libros
librofisico lf = new librofisico("El Quijote", 54232, "x", "Español", 2000, "si", 600, "Estante 1");
                                                                                //NUMPAG
librodigi ld = new librodigi("La cenicienta", 1234, "y", "Español", 2000, "no", "PDF", 4);
                                                                     //FORMATO Y TAMAÑO ARCHIVO
biblioteca.addLibro(lf);
biblioteca.addLibro(ld);

// 3. Crear salas
salalectura sl = new salalectura("Sala de lectura 1", 30, "tiza", "lectura", true);
salaestudio se = new salaestudio("Sala de studio ", 30, "rotulador", "estudio", true, 10);
salaInfor si = new salaInfor("Sala de ordenadores", 15, "digital", "informatica", true, 8);

biblioteca.addSala(sl);
biblioteca.addSala(se);
biblioteca.addSala(si);

// 4. Crear personas
usuario u1 = new usuario(1);
empleado e1 = new empleado("Bibliotecario", 1200);

biblioteca.registrarVisita(u1);
biblioteca.registrarVisita(e1);

// 5. Asignar responsables
biblioteca.asignarResponsable(sl, e1);

// 6. Mostrar todo
biblioteca.mostrarinformacion();
   

 }

}


