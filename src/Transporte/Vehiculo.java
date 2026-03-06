package Transporte;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double cargaMaxima;
    private LocalDate fechaAdquisicion;
    private List<Viaje> viajes;

    public Vehiculo(String marca, String modelo, double cargaMaxima, LocalDate fechaAdquisicion) {
        this.marca = marca;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.fechaAdquisicion = fechaAdquisicion;
        this.viajes = new ArrayList<>();
    }

    public void agregarViaje(Viaje viaje) {
        viajes.add(viaje);
    }

    public void eliminarViaje(Viaje viaje) {
        viajes.remove(viaje);
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", fechaAdquisicion=" + fechaAdquisicion +
                ", viajes=" + viajes +
                '}';
    }
}
