package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ing_pedido_x_producto")
public class PedidoProducto {

    @Id
    private Long idepedidoproducto;
    private Long idepedido;
    private Long ideproducto;
    private Long idetallaproducto;
    private Double cantidad;
    private Double precioventaprod;
    private String usuario;
    private Date fechaingreso;
    private Double cantidaddespachada;
    private Date fechamod;
    private String usuariomod;
    private Integer prioridad;
    private String ordencompra;
    private String autorizar;

    @ManyToOne
    @JoinColumn(name="idepedido",insertable=false,updatable=false)    
    private Pedido pedido;

}
