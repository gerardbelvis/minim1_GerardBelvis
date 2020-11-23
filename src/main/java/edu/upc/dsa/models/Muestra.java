package edu.upc.dsa.models;

public class Muestra {

    private String idMuestra;
    private String idClinico;
    private String idPersona;
    private String fechaExtraccion;
    private String idLab;
    private String resultado;
    private String comentario;

    public Muestra(String idMuestra, String idClinico, String idPersona, String fechaExtraccion, String idLab) {
        this.idMuestra = idMuestra;
        this.idClinico = idClinico;
        this.idPersona = idPersona;
        this.fechaExtraccion = fechaExtraccion;
        this.idLab = idLab;
    }


    public String getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(String idMuestra) {
        this.idMuestra = idMuestra;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdClinico() {
        return idClinico;
    }

    public void setIdClinico(String idClinico) {
        this.idClinico = idClinico;
    }

    public String getFechaExtraccion() {
        return fechaExtraccion;
    }

    public void setFechaExtraccion(String fechaExtraccion) {
        this.fechaExtraccion = fechaExtraccion;
    }

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        this.idLab = idLab;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
