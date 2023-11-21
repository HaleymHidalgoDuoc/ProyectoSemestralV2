package Modelo;

import java.util.Date;

/**
 *
 * @author Haleym Hidalgo
 */
public class Cliente {
    //Atributos
    private String idCliente;
    private String tipoCliente;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private Date fechaNacimiento;
    private String direccion;
    private String email;
    private String telefono;
    
    //Constructor
    public Cliente(String idCliente, String tipoCliente, String nombre, String apellidoP, String apellidoM, Date fechaNacimiento, String direccion, String email, String telefono) {
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }
    
    //Accesadores y Mutadores
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
