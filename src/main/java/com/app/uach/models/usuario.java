package com.app.uach.models;

public class usuario {
    
    private String nombre;
    private String email;
    private int edad = 34;
    
    // Constructor, getters y setters
    public usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    
    public int getEdad() { return edad; }
}
