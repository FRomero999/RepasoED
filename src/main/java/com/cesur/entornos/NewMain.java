package com.cesur.entornos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        Alumno yo = new Alumno();
        yo.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse("04/08/1979") );
        yo.setApellidos("Romero");
        yo.setNombre("Francisco");
        yo.setTelefono("665454989");
        yo.setEmail("francisco.romero@cersurformacion.com");
        yo.setNotaED(new Calificación(5.3,9.2));
        yo.setNotaLM(new Calificación(4.0,7.0));
        
        System.out.println(yo);
        System.out.println(yo.calcularEdad());
        System.out.println(yo.getNotaED().calcularMedia());
        System.out.println(yo.getNotaLM().calcularMedia());
        System.out.println(yo.numeroAprobados());

    }
    
}
