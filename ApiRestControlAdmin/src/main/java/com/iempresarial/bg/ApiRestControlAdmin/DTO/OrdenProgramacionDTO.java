package com.iempresarial.bg.ApiRestControlAdmin.DTO;

import java.time.OffsetDateTime;
import java.util.List;

public interface OrdenProgramacionDTO {

    Long getIdeordenprogra();
    Long getNumordenprogra();
    OffsetDateTime getFechaordenprogra();
    String getStsordenprogra();

    List<OrdenProgramacionDetalleDTO> getOrdenprogramaciondetalle();

}
