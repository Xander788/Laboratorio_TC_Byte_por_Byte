/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajos_Social;

/**
 *
 * @author Braya
 */
public class Trabajo_social {
    private int cedula;
    private String nombre;
    private String correo;
    private String telefono;
    private String canton;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCanton() {
        return canton;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public Trabajo_social(int cedula, String nombre, String correo, String telefono, String canton) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.canton = canton;
    }

    @Override
    public String toString() {
        return "Trabajo_social: " + "cedula: " + cedula + " nombre: " + nombre + " correo: " + correo + " telefono: " + telefono + " canton: " + canton;
    }
    
}
