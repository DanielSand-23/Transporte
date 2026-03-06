package Transporte;
import java.time.LocalDate;

public class Viaje {

    private String ciudadDestino;
    private String direccion;
    private LocalDate fechaViaje;
    private LocalDate fechaRegreso;
    private String descripcionCarga;
    private double montoViaje;
    private Vehiculo vehiculo;

    public Viaje(String ciudadDestino, String direccion, LocalDate fechaViaje,
                 LocalDate fechaRegreso, String descripcionCarga, double montoViaje, Vehiculo vehiculo) {
        this.ciudadDestino = ciudadDestino;
        this.direccion = direccion;
        this.fechaViaje = fechaViaje;
        this.fechaRegreso = fechaRegreso;
        this.descripcionCarga = descripcionCarga;
        this.montoViaje = montoViaje;
        this.vehiculo = vehiculo;
        vehiculo.agregarViaje(this);
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public LocalDate getFechaRegreso() {
        return fechaRegreso;
    }

    public String getDescripcionCarga() {
        return descripcionCarga;
    }

    public double getMontoViaje() {
        return montoViaje;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "ciudadDestino='" + ciudadDestino + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaViaje=" + fechaViaje +
                ", fechaRegreso=" + fechaRegreso +
                ", descripcionCarga='" + descripcionCarga + '\'' +
                ", montoViaje=" + montoViaje +
                '}';
    }
}
