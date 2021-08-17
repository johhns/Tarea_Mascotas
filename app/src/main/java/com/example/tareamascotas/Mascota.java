package com.example.tareamascotas;

public class Mascota {

    private int foto ;
    private String nombre;
    private String puntuacion ;

    public Mascota(int foto, String nombre, String puntuacion) {
        this.foto = foto;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRating() {
        return puntuacion;
    }

    public void setRating(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

