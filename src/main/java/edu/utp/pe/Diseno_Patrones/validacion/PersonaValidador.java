package edu.utp.pe.Diseno_Patrones.validacion;

import edu.utp.pe.Diseno_Patrones.exception.ValidacionException;
import edu.utp.pe.Diseno_Patrones.modelo.Persona;

public class PersonaValidador implements Validador<Persona> {
    @Override
    public void validar(Persona persona) {
        if (persona == null) {
            throw new ValidacionException("La persona no puede ser nula");
        }
        if (persona.getNombres() == null || persona.getNombres().isBlank()) {
            throw new ValidacionException("El nombre de la persona es obligatorio");
        }
    }
}
