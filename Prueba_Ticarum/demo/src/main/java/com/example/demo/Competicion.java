package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class Competicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String deporte;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Integer pistasDisponibles;

    public Competicion() {

    }

    public Competicion(String nombre, String deporte, LocalDate fechaInicio, LocalDate fechaFin,
            Integer pistasDisponibles) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pistasDisponibles = pistasDisponibles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getPistasDisponibles() {
        return pistasDisponibles;
    }

    public void setPistasDisponibles(Integer pistasDisponibles) {
        this.pistasDisponibles = pistasDisponibles;
    }
}
