/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author idra2
 */
public class Clase {
    private int Id_Clase;
    private int Id_Actividad;
    private int Id_Socio;
    
    public Clase(){
    //Cosntrcutor vacio
    }
    /*
    @param Id_Clase         id de inscripcion o calse asginada
    @param Id_Actividad     id de la actividad asociada
    @param Id_Socio         id del socio inscripto
    */
    
    public Clase(int Id_Clase, int Id_Actividad, int Id_Socio){
        this.Id_Clase = Id_Clase;
        this.Id_Actividad = Id_Actividad;
        this.Id_Socio = Id_Socio;
    }

    public int getId_Clase() {
        return Id_Clase;
    }

    public void setId_Clase(int Id_Clase) {
        this.Id_Clase = Id_Clase;
    }

    public int getId_Actividad() {
        return Id_Actividad;
    }

    public void setId_Actividad(int Id_Actividad) {
        this.Id_Actividad = Id_Actividad;
    }

    public int getId_Socio() {
        return Id_Socio;
    }

    public void setId_Socio(int Id_Socio) {
        this.Id_Socio = Id_Socio;
    }
    
}
