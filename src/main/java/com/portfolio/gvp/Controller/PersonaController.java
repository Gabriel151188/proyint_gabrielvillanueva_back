
package com.portfolio.gvp.Controller;

import com.portfolio.gvp.Entity.Persona;
import com.portfolio.gvp.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PostMapping("/personas/editar")
    public Boolean editPersona(@RequestBody Persona perfil){
        List<Persona> persona = ipersonaService.findPersona();
        System.out.println("**********");
        System.out.println(persona.get(0).getAcercademi());
        System.out.println(perfil.acercademi);
        persona.get(0).setAcercademi(perfil.acercademi);
        
        ipersonaService.savePersona(persona.get(0));
        return true;
    }
}