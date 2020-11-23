package edu.upc.dsa.models;

import java.util.List;

public class Persona {

    private String id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String nivelSalud;
    private List<Muestra> muestrasProcesadas;

    public Persona(String id, String nombre, String apellidos, int edad, String nivelSalud) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nivelSalud = nivelSalud;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNivelSalud(){
        return nivelSalud;
    }

    public void setNivelSalud(String nivelSalud){
        this.nivelSalud = nivelSalud;
    }

    public List<Muestra> getMuestrasProcesadas() {
        return muestrasProcesadas;
    }

    public void setMuestrasProcesadas(List<Muestra> muestrasProcesadas) {
        this.muestrasProcesadas = muestrasProcesadas;
    }
}
