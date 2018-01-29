/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bbva.proyectobbva.model.entity;


/**
 *
 * @author iOni
 */
public class Banner{
    
    private Integer id;
    private String codigo;
    private String titulo;
    
    private byte[] imagen;
    private String sImagen;
    
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getsImagen() {
        return sImagen;
    }

    public void setsImagen(String sImagen) {
        this.sImagen = sImagen;
    }

    
    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Banner{" + "codigo=" + codigo + ", titulo=" + titulo + ", imagen=" + imagen + ", estado=" + estado + '}';
    }
    
}
