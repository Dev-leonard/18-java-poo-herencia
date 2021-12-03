package org.leonard.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno  alumno = new Alumno();
        alumno.setNombre("Edwin");
        alumno.setApellido("Leon");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luis");
        profesor.setApellido("Pepa");
        profesor.setAsigantura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor" + profesor.getAsigantura() + ": " + profesor.getNombre() + " " + profesor.getApellido());




    }
}
