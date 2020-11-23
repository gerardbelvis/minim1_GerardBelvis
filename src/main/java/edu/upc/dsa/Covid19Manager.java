package edu.upc.dsa;

import edu.upc.dsa.models.Laboratorio;
import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.Persona;

import java.util.HashMap;
import java.util.List;

public interface Covid19Manager {

    //Añadir una persona
    public Persona añadirPersona(String id, String nombre, String apellidos, int edad, String salud);
    public Persona añadirPersona(Persona persona);
    public HashMap<String, Persona> getContenedorUsuarios();

    //Extraer muestra sobre una persona y enviarla a un lab
    public int extraerMuestra(Muestra muestra);

    //Procesar la muestra
    public int procesarMuestra(Laboratorio lab);

    //Lista de las muestras procesadas de una persona
    public List<Muestra> getMuestras(Persona id);

    public void tearDown();
}
