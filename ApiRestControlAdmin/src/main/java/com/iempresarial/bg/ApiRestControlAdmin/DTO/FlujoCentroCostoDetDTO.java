package com.iempresarial.bg.ApiRestControlAdmin.DTO;

public interface FlujoCentroCostoDetDTO {

    Long getIdecentrocosto();
    Integer getOrden();
    String getIndsiguientedepto();
    String getIndimpordenprogra();
    String getIndimprimeprograma();

    FlujoCentroCostoDetSiguienteDTO getCentrocostodetsiguiente();

}
