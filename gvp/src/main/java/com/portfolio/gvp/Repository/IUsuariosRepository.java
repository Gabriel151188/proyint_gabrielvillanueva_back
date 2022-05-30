
package com.portfolio.gvp.Repository;

import com.portfolio.gvp.Entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios,Long> {
    
}
