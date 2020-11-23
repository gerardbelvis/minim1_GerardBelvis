package edu.upc.dsa;

import edu.upc.dsa.models.Laboratorio;
import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.Persona;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import java.util.*;

public class Covid19ManagerImpl implements Covid19Manager {

    private static Covid19ManagerImpl instancia;
    private static Logger logger = LogManager.getLogger(Covid19ManagerImpl.class);

    //Estructuras de datos del Covid19Manager
    private HashMap<String, Persona> contenedorUsuarios;
    private Laboratorio[] listaLaboratorios;
    private Queue<Muestra> muestrasPendientes;
    private LinkedList<Muestra> muestrasUsuario;

    //Singleton: constructor privado
    private Covid19ManagerImpl(){
        this.contenedorUsuarios = new HashMap<String, Persona>();
        this.listaLaboratorios = new Laboratorio[100];
        this.muestrasPendientes = new Queue<Muestra>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Muestra> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Muestra muestra) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Muestra> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean offer(Muestra muestra) {
                return false;
            }

            @Override
            public Muestra remove() {
                return null;
            }

            @Override
            public Muestra poll() {
                return null;
            }

            @Override
            public Muestra element() {
                return null;
            }

            @Override
            public Muestra peek() {
                return null;
            }
        };
        this.muestrasUsuario = new LinkedList<Muestra>();

    }

    public static Covid19ManagerImpl getInstance(){
        if (instancia == null) instancia = new Covid19ManagerImpl();
        return instancia;
    }


    @Override
    public Persona añadirPersona(String id, String nombre, String apellidos, int edad, String salud) {
        return this.añadirPersona(id, nombre, apellidos, edad, salud);
    }

    public Persona añadirPersona(Persona persona) {
        this.contenedorUsuarios.put(persona.getId(),persona);
        return persona;
    }

    public HashMap<String, Persona> getContenedorUsuarios(){
        return this.contenedorUsuarios;
    }

    @Override
    public int extraerMuestra(Muestra muestra) {
        logger.info("Extrae la muestra:"+ muestra);
        return 0;
    }

    @Override
    public int procesarMuestra(Laboratorio lab) {
        return 0;
    }

    @Override
    public List<Muestra> getMuestras(Persona id) {
        return null;
    }

    @Override
    public void tearDown() {
        this.contenedorUsuarios.clear();
        this.muestrasUsuario.clear();
        this.muestrasPendientes.clear();
        this.listaLaboratorios.;

    }
}
