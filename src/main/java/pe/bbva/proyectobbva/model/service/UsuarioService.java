/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bbva.proyectobbva.model.service;


/**
 *
 * @author Ronald
 */
public interface UsuarioService {

    boolean autenticar(String nroDocumento, String contrasenia);
}
