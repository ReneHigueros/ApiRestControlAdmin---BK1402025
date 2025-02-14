package com.iempresarial.bg.ApiRestControlAdmin.DTO;

import java.util.List;

public interface OrdenProgramacionDetalleDTO {

    Long getCantidadpares();
    Long getIdedetprogra();

    List<DetalleProgramacionDTO> getDetalleprogramacion();

}
