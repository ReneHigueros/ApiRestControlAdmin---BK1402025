package com.iempresarial.bg.ApiRestControlAdmin.DTO;

public interface RequerimientoProductoDTO {

    Long getIdereqproducto();
    Long getIdepedido();
    Long getIdetallaproducto();
    Integer getCantidadpares();
    String getStsreqproducto();

    PedidoDTO getPedido();

    TallaProductoDTO getTallaproducto();

    ProductoDTO getProducto();

}
