package edu.upc.dsa.models;

import java.lang.reflect.Array;
import java.util.Queue;

public class Laboratorio {

    private String idLab;
    private String nombreLab;
    private Queue<Muestra> colaMuestrasPendientes;

    public Laboratorio(String idLab, String nombreLab) {
        this.idLab = idLab;
        this.nombreLab = nombreLab;
    }

    public Laboratorio(Queue<Muestra> colaMuestrasPendientes) {
        this.colaMuestrasPendientes = colaMuestrasPendientes;
    }

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        this.idLab = idLab;
    }

    public String getNombreLab() {
        return nombreLab;
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }
    public Queue<Muestra> getColaMuestrasPendientes() {
        return colaMuestrasPendientes;
    }

    public void setColaMuestrasPendientes(Queue<Muestra> colaMuestrasPendientes) {
        this.colaMuestrasPendientes = colaMuestrasPendientes;
    }
}
