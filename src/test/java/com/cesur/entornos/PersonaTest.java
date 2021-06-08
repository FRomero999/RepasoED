package com.cesur.entornos;

import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    

    @Test
    public void testSetEmail() {

        String email;
        String resultado;
        
        Alumno somebody = new Alumno();
        
        email = "francisco.romero@cersurformacion.com";
        somebody.setEmail(email);
        resultado = somebody.getEmail();
        assertEquals(email,resultado);
        
        email = "@";
        somebody.setEmail(email);
        resultado = somebody.getEmail();
        assertNotEquals(email,resultado);

        email = "francisco.romero@";
        somebody.setEmail(email);
        resultado = somebody.getEmail();
        assertNotEquals(email,resultado);

        email = "@cersurformacion.com";
        somebody.setEmail(email);
        resultado = somebody.getEmail();
        assertNotEquals(email,resultado);
        
        email = "francisco.romero.cersurformacion.com";
        somebody.setEmail(email);
        resultado = somebody.getEmail();
        assertNotEquals(email,resultado);        
        
    }
    
}
