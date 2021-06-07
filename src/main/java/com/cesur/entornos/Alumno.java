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
