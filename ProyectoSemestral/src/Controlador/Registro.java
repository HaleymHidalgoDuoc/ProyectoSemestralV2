package Controlador;

import Modelo.Empleado;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Haleym Hidalgo
 */
public class Registro {
    //Metodos
    public Empleado buscarRUT(String identificacion) {
        Empleado cuenta = new Empleado();

        try {
            //Crear Conexcion
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion(); // Error Aqui -------------
            System.out.println("Conexion Exitosa");

            //Consultar
            String query = "SELECT * FROM empleado WHERE rut_empleado = " + "'" + identificacion + "';";
            PreparedStatement stmt = cnx.prepareStatement(query);

            //Permanencia de Datos
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cuenta.setRutEmpleado(rs.getString("rut_empleado"));
                cuenta.setTipoEmpleado(rs.getString("tipo_empleado"));
                cuenta.setNombre(rs.getString("nombre"));
                cuenta.setApellidoP(rs.getString("apellidop"));
                cuenta.setApellidoM(rs.getString("apellidom"));
                cuenta.setDireccion(rs.getString("direccion"));
                cuenta.setEmail(rs.getString("email"));
                cuenta.setTelefono(rs.getString("telefono"));
                cuenta.setContrasenia(rs.getString("contrasenia"));
            }

            //Cerrar la Conexion
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar empleado por id" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar empleado por id" + e.getMessage());
        }
        return cuenta;
    }
}
