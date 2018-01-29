package pe.bbva.proyectobbva.model.repository;

import java.util.List;
import pe.bbva.proyectobbva.model.entity.Banner;
import pe.bbva.proyectobbva.model.entity.Usuario;

/**
 *
 * @author ron
 */
public interface UsuarioRepository {
    
    public Usuario obtenerDatosUsuario(String nroDocumento);
}
