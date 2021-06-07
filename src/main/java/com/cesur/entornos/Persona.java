/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesur.entornos;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author paco
 */
public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected String telefono;
    protected Date fechaNacimiento;
    protected String email;

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + '}';
    }
    
    public Integer calcularEdad(){
        Date hoy = new Date();
        long diffInMillies = Math.abs(hoy.getTime() - fechaNacimiento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)/365;
        return Math.round(diff);
    }
    
}
