/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Models.Conexion;
import Models.Socio;

public class SocioDAO extends Conexion {
    
    public boolean registrar(Socio socio) {
        // La consulta SQL con signos de interrogación como comodines
        String sql = "INSERT INTO Socio (nombre, dni, telefono, email, apt_medico, estado_membresia) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection con = getConexion(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            // Reemplazamos los comodines con los datos del objeto Socio
            ps.setString(1, socio.getNombre());
            ps.setInt(2, socio.getDNI());
            ps.setString(3, socio.getTelefono());
            ps.setString(4, socio.getEmail());
            ps.setString(5, socio.getAptMedico());
            ps.setString(6, socio.getEstadoMembresia());
            
            // Ejecutamos la consulta
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println("Error al registrar socio: " + e.getMessage());
            return false;
        }
    }
}
