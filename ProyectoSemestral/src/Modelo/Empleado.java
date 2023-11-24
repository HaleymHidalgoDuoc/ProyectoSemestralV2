package Modelo;

/**
 *
 * @author Haleym Hidalgo
 */
public class Empleado {
    //Atributos
    private String rutEmpleado;
    private String tipoEmpleado;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String direccion;
    private String email;
    private String telefono;
    private String contrasenia;
    
    //Constructor
    public Empleado(String rutEmpleado, String tipoEmpleado, String nombre, String apellidoP, String apellidoM, String direccion, String email, String telefono, String contrasenia) {
        this.rutEmpleado = rutEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
    }

    public Empleado() {
    }
    
    //Accesadores y Mutadores
    public String getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    //Metodos Propios
    @Override
    public String toString() {
        return "Empleado{" + "rutEmpleado=" + rutEmpleado + ", tipoEmpleado=" + tipoEmpleado + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + ", contrasenia=" + contrasenia + '}';
    }
    
}
