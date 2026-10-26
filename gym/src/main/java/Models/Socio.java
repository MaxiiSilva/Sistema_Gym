/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * @author Usuario
 */
package Models;

public class Socio {
    private int Id_Socio;
    private String Nombre;
    private int DNI;
    private String Telefono;
    private String Email;
    private String AptMedico;
    private String EstadoMembresia;
    public Socio() {}
    public String getNombre() { return Nombre; }
    public void setNombre(String Nombre) 
    { this.Nombre = Nombre; }

    public int getId_Socio() {
        return Id_Socio;
    }

    public int getDNI() {
        return DNI;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public String getAptMedico() {
        return AptMedico;
    }

    public String getEstadoMembresia() {
        return EstadoMembresia;
    }

    public void setIdSocio(int Id_Socio) {
        this.Id_Socio = Id_Socio;
    }

    public void setDni(int DNI) {
        this.DNI = DNI;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAptMedico(String AptMedico) {
        this.AptMedico = AptMedico;
    }

    public void setEstadoMembresia(String EstadoMembresia) {
        this.EstadoMembresia = EstadoMembresia;
    }
    
}