package com.iempresarial.bg.ApiRestControlAdmin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iempresarial.bg.ApiRestControlAdmin.DTO.OrdenCentroCostoDTO;
import com.iempresarial.bg.ApiRestControlAdmin.Entity.OrdenCentroCosto;

@Repository
public interface OrdenCentroCostoRepository extends JpaRepository<OrdenCentroCosto, Long>{

     public List<OrdenCentroCostoDTO> findByIdeordenprogra(Long ideordenprogra);

     public OrdenCentroCosto findByIdeordenprogcencos(Long ideordenprogcencos);

    @Query(value="select c.idecentrocosto, a.indsalida, c.descripcion descripcioncencos, a.ideordenprogcencos, a.idetipomovimiento, a.ideordenprogra, a.fechaingreso "+
    " from general.ing_pr_orden_x_centro_costo a "+
    " INNER JOIN cfg_tipo_movimiento b ON a.idetipomovimiento = b.idetipomovimiento "+
    " INNER JOIN cfg_pr_centro_costo c ON a.idecentrocosto = c.idecentrocosto "+
    " where b.lovgrptipoprocmov = :lovgrpproceso "+
	" and b.tipomovimiento = :tipomov "+
	" and a.indsalida = :indicador "+
	" and a.ideordenprogra = :ideorden ", nativeQuery=true )
    
    public OrdenCentroCostoDTO getCencosActual(@Param("ideorden") Long ideordenprogra, @Param("lovgrpproceso") String lovgrpproceso, @Param("tipomov") String tipomov, String indicador);


}
