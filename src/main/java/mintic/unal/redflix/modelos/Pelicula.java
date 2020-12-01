/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Edisson Prieto
 */
@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @Column(name = "titulo")
    private String titulo;

    @Column(name = "pel_resumen")
    private String resumen;

    @Column(name = "pel_ano")
    private String ano;

    @Column(name = "pel_director")
    private String director;

    public Pelicula(String titulo, String resumen, String ano, String director) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.ano = ano;
        this.director = director;
    }
    
      public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
