package Modelo;

import java.util.Date;

/**
 *
 * @author Haleym Hidalgo
 */
public class Arriendo {
    //Atributos
    private int idRegistro;
    private Date fechaInicio;
    private Date fechaTermino;
    private int precio;
    private String descripcion;
    private Cliente cliente;
    private Empleado vendedor;
    private Vehiculo vehiculo;
    
    //Constructor
    public Arriendo(int idRegistro, Date fechaInicio, Date fechaTermino, int precio, String descripcion, Cliente cliente, Empleado vendedor, Vehiculo vehiculo) {
        this.idRegistro = idRegistro;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
    }
    
    //Accesadores y Mutadores
    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
