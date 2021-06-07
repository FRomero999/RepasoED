/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesur.entornos;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author paco
 */
public class Alumno extends Persona{
    
    private Calificación notaED;
    private Calificación notaLM;

    public Alumno() {
    }

    public Calificación getNotaED() {
        return notaED;
    }

    public void setNotaED(Calificación notaED) {
        this.notaED = notaED;
    }

    public Calificación getNotaLM() {
        return notaLM;
    }

    public void setNotaLM(Calificación notaLM) {
        this.notaLM = notaLM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        
        Pattern pattern = Pattern.compile("^[0-9]{9}$");
        Matcher matcher = pattern.matcher(telefono); 
        if(matcher.matches()) this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile("^(.+)@(\\S+)$");
        Matcher matcher = pattern.matcher(email); 
        if(matcher.matches()) this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", telefono=").append(telefono);
        sb.append(", email=").append(email);
        sb.append(", nacimiento=").append(fechaNacimiento);
        sb.append(", notaED=").append(notaED);       
        sb.append(", notaLM=").append(notaLM);

        sb.append('}');
        return sb.toString();
    }
    
    public Integer numeroAprobados(){
        Integer aprobados=0;
        if(notaED.calcularMedia()>5){
            aprobados++;
        }
        if(notaLM.calcularMedia()>5){
            aprobados++;
        }        
        return aprobados;
    }
               
      
}
