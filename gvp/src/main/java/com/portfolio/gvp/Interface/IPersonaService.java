
package com.portfolio.gvp.Interface;

import com.portfolio.gvp.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona (Long Id);
            
    //Buscar una Persona
    public List<Persona> findPersona();
}
