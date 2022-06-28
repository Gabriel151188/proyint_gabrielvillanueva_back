package com.portfolio.gvp.Service;

import com.portfolio.gvp.Entity.Usuarios;
import com.portfolio.gvp.Interface.IUsuariosService;
import com.portfolio.gvp.Repository.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImpUsuariosService implements IUsuariosService{
    @Autowired IUsuariosRepository iusuariosRepository;

    @Override
    public Boolean getUsuarios(Usuarios usuarios) {
        System.out.println("******REQUEST*****");
        System.out.println(usuarios.getEmail());
        System.out.println(usuarios.getPassword());
        Boolean isLogin = false;
        List<Usuarios> res = iusuariosRepository.findAll();
        
        if (usuarios.getEmail().equals(res.get(0).getEmail()) && usuarios.getPassword().equals(res.get(0).getPassword())){
            isLogin = true;
        }

        return isLogin;
    }
}
