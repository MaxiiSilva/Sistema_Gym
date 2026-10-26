/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Actividad;
import Models.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author idra2
 */

public class ActividadDAO extends Conexion {
        /*
        registra una nueva activiadaD en la base de datos
        @param actividad obajeto Actividad a registrar
        @param true Ssi se registro con exito, false caso contrario
        */
     public boolean Registrar_Actividad(Actividad actividad){
         String sql = "INSERT INTO actividad(nombre_clase, cupos, horarios, profesor, precio) VALUES(?,?,?,?,?)";
         
         try(Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)){
         ps.setString(1, actividad.getNombre_Actividad());
         ps.setInt(2, actividad.getCupos());
         ps.setString(3, actividad.getHorarios());
         ps.setString(4, actividad.getProfesor());
         ps.setDouble(5, actividad.getPrecio());
         } catch (SQLException e){
             System.err.println("Error al registrar actividad: " + e.getMessage());
         }
         return false;
     }
}
