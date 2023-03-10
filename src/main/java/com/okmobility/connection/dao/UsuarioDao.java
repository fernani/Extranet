
package com.okmobility.connection.dao;

import com.okmobility.connection.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
    
}
