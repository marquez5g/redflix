package mintic.unal.redflix.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mintic.unal.redflix.modelos.Pelicula;

@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer> {

}