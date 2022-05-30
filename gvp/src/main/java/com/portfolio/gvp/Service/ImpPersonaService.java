
package com.portfolio.gvp.Service;

import com.portfolio.gvp.Entity.Persona;
import com.portfolio.gvp.Interface.IPersonaService;
import com.portfolio.gvp.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long Id) {
        ipersonaRepository.deleteById(Id);
    }

    @Override
    public List<Persona> findPersona() {
       List<Persona> persona = ipersonaRepository.findAll();
       
       return persona;
    }
    
}
