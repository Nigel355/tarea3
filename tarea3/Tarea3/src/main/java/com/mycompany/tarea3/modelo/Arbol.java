/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tarea3.modelo;
import jakarta.persistence.*;
/**
 *
 * @author nigel
 */
@Entity
@Table(name = "arbol")
public class Arbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_comun", nullable = false)
    private String nombreComun;

    @Column(name = "tipo_flor")
    private String tipoFlor;

    @Column(name = "dureza_madera")
    private Integer durezaMadera;

    @Column(name = "altura_maxima")
    private Integer alturaMaxima;

    @Column(name = "ruta_imagen")
    private String rutaImagen;

    // Constructor vacío (recomendado para JPA)
    public Arbol() {}

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public Integer getDurezaMadera() {
        return durezaMadera;
    }

    public void setDurezaMadera(Integer durezaMadera) {
        this.durezaMadera = durezaMadera;
    }

    public Integer getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(Integer alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
