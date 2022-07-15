
package com.portfolio.gvp.Controller;

import com.portfolio.gvp.Entity.Usuarios;
import com.portfolio.gvp.Interface.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "https://villanueva-gabriel.web.app")
public class UsuariosController {
    @Autowired IUsuariosService iusuariosService;
    
    @PostMapping("/usuario/login")
    public Boolean getUsuarios(@RequestBody Usuarios usuario){
        return iusuariosService.getUsuarios(usuario);
    }  
}