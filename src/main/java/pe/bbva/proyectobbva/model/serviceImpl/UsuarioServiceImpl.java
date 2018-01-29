/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bbva.proyectobbva.model.serviceImpl;

/**
 *
 * @author Ronald R
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.bbva.proyectobbva.model.entity.Usuario;
import pe.bbva.proyectobbva.model.repository.UsuarioRepository;
import pe.bbva.proyectobbva.model.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public boolean autenticar(String nroDocumento, String contrasenia) {
        Usuario usuario = usuarioRepository.obtenerDatosUsuario(nroDocumento);
        if (contrasenia.equals(usuario.getContraseña())) {
            return true;
        } else {
            return false;
        }

    }

}
