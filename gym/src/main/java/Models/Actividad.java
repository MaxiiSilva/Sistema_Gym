/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author idra2
 */
public class Actividad {
    private int Id_Actividad;
    private  String Nombre_Actividad;
    private int Cupos;
    private String Horarios;
    private String Profesor;
    private double Precio;
    
    public Actividad(){
        //Constructor vacio por defecto
    }
    /*
    @param Id_Actividadd    id de la actividad
    @param Nombre_Actividad     nombre de la clase(yoga,pesas,etc)
    @param Cupos            Cupos maximos disponibles  
    @param Horarios         Horario de la actividad
    @param Profesor         Nombre del proferson de la actividad
    @param Precio           Precios de las Actividades
    */
    
    public Actividad(int Id_Actividad, String Nombre_Actividad, int Cupos, String Horarios, String Profesor, double Precio){
        this.Id_Actividad = Id_Actividad;
        this.Nombre_Actividad = Nombre_Actividad;
        this.Cupos = Cupos;
        this.Horarios = Horarios;
        this.Profesor = Profesor;
        this.Precio = Precio;
    }

    public int getId_Actividad() {
        return Id_Actividad;
    }

    public void setId_Actividad(int Id_Actividad) {
        this.Id_Actividad = Id_Actividad;
    }

    public String getNombre_Actividad() {
        return Nombre_Actividad;
    }

    public void setNombre_Actividad(String Nombre_Actividad) {
        this.Nombre_Actividad = Nombre_Actividad;
    }

    public int getCupos() {
        return Cupos;
    }

    public void setCupos(int Cupos) {
        this.Cupos = Cupos;
    }

    public String getHorarios() {
        return Horarios;
    }

    public void setHorarios(String Horarios) {
        this.Horarios = Horarios;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}

