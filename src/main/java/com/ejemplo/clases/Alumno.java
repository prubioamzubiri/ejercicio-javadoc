/**
 * Representa a un alumno en un curso.
 *
 * @author [Tu nombre]
 */
package com.ejemplo.clases;

public class Alumno {
    /**
     * Identificador del alumno.
     */
    private String identificador;
    /**
     * Nombre del alumno.
     */
    private String nombre;
    /**
     * Curso en el que se encuentra el alumno.
     */
    private String curso;

    /**
     * Constructor de la clase Alumno.
     *
     * @param identificador Identificador del alumno.
     * @param nombre        Nombre del alumno.
     * @param curso         Curso en el que se encuentra el alumno.
     */
    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }

    /**
     * Matricula al alumno en un curso.
     * Agrega un uno a el nombre del curso
     * El curso no debe estar vacio.
     *
     * @param curso Curso en el que se matricula el alumno.
     */
    public void matricular(String curso){
        this.curso = curso + " 1";
    }

    /**
     * Avanza el curso del alumno.
     *
     * Si el alumno está en el primer curso, pasa al segundo. Si ya está en el último curso, se titula.
     */
    public void pasarDeCurso(){
        String[] curso = this.curso.split(" ");
        int numeroCurso = Integer.parseInt(curso[1]);
        if(numeroCurso == 1)
        {
            this.curso = curso[0] + " " + (numeroCurso + 1);
        }
        else{
            this.curso = "Titulado en " + curso[0];
        }

    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}