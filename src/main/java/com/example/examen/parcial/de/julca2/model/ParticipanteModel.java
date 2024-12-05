package com.example.examen.parcial.de.julca2.model;

public class ParticipanteModel {
    private int id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String lugarResidencia;
    private String numeroEmergencia;
    private String telefonoPersonal;
    private String tipoSangre;
    private String alergias;
    private int distanciaKm;

    // Constructor vacío
    public ParticipanteModel() {
    }

    // Constructor con parámetros
    public ParticipanteModel(int id, String nombres, String apellidos, String dni, String lugarResidencia,
                             String numeroEmergencia, String telefonoPersonal, String tipoSangre, String alergias,
                             int distanciaKm) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.lugarResidencia = lugarResidencia;
        this.numeroEmergencia = numeroEmergencia;
        this.telefonoPersonal = telefonoPersonal;
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.distanciaKm = distanciaKm;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getTelefonoPersonal() {
        return telefonoPersonal;
    }

    public void setTelefonoPersonal(String telefonoPersonal) {
        this.telefonoPersonal = telefonoPersonal;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
}