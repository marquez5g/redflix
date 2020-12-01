package mintic.unal.redflix.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mintic.unal.redflix.modelos.Serie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface SerieRepositorio extends JpaRepository<Serie, Integer> {
    
    @Query("SELECT u from Serie u WHERE u.titulo  = :titulo  " )
    Serie findSerieByTitulo( @Param("titulo") String titulo);
  

}