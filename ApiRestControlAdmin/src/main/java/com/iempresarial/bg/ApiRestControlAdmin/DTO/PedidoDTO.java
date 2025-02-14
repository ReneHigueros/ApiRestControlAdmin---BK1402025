package com.iempresarial.bg.ApiRestControlAdmin.DTO;

import java.time.OffsetDateTime;

public interface PedidoDTO {

    String getSeriepedido();
    Long getNumpedido();
    OffsetDateTime getFechapedido();
    String getStspedido();
    String getOrdencompra();
    String getCampania();
    OffsetDateTime getFechaentrega();

   // List<PedidoProductoDTO> getPedidoProducto();

  // List<PedidoProductoDTO> getDetallepedido();

    ClienteDTO getCliente();
    

}
