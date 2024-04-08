package com.example.mate;

public class Usuario {
    private String nombre;
    private String edad;
    private String carrera;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return edad;
    }

    public String getTelefono() {
        return carrera;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.edad = email;
    }

    public void setTelefono(String telefono) {
        this.carrera = telefono;
    }

    public Usuario(String nombre, String edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
}
