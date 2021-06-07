/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesur.entornos;

/**
 *
 * @author paco
 */
public class Calificación {
    private Double teórico;
    private Double práctico;

    public Calificación(Double teórico, Double práctico) {
        this.teórico = teórico;
        this.práctico = práctico;
    }

    public Calificación() {
    }

    public Double getTeórico() {
        return teórico;
    }

    public void Double(Double teórico) {
        this.teórico = teórico;
    }

    public Double getPráctico() {
        return práctico;
    }

    public void setPráctico(Double práctico) {
        this.práctico = práctico;
    }

    @Override
    public String toString() {
        return "Calificaci\u00f3n{" + "te\u00f3rico=" + teórico + ", pr\u00e1ctico=" + práctico + '}';
    }
    
    public Double calcularMedia(){
        
        if((teórico<5) && (práctico<5)){
            return Math.max(práctico, teórico);
        }
        else if(teórico>=5 && práctico<5){
             return práctico;
        }
        else if(teórico<5 && práctico>=5){
             return teórico;
        }
        else {
            return (teórico+práctico)/2;
        }
    }
    
    
}
