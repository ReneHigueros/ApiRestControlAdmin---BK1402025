package com.iempresarial.bg.ApiRestControlAdmin.DTO;

import java.util.List;

public interface DetalleProgramacionDTO {

    Long getIdedetprogra();
    Long getIdereqproducto();
    Long getIdeproducto();
    Long getIdetallaproducto();
    Integer getCantidadpares();

    List<RequerimientoProductoDTO> getRequerimientoproducto();

}
