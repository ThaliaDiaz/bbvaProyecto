/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bbva.proyectobbva.model.repository;

import java.util.List;
import pe.bbva.proyectobbva.model.entity.Banner;

/**
 *
 * @author ron
 */
public interface BannerRepository {
    
    public Banner obtenerPorCodigo(String codigo);
    void registrar(Banner banner);
    List<Banner> obtenerTodos();
}
