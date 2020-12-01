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
@Table(name = "series")
public class Serie {

    @Id
    @Column(name = "titulo")
    private String titulo;

    @Column(name = "ser_temp")
    private String temporadas;

    @Column(name = "ser_epi")
    private String episodios;

    public Serie(String titulo, String temporadas, String ano, String episodios) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public Serie() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public String getEpisodios() {
        return episodios;
    }

    public void setEpisodios(String episodios) {
        this.episodios = episodios;
    }

}
