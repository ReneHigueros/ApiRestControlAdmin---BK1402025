package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.time.OffsetDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ing_pedido")
public class Pedido {
    @Id
    private Long idepedido;
    private Long idecliente;
    private Long idesucursal;
    private Long ideciaemisora;
    private Long ideempleado;
    private String seriepedido;
    private Long numpedido;
    private OffsetDateTime fechapedido;
    private String stspedido;
    private OffsetDateTime fechasts;
    private String usuario;
    private OffsetDateTime fechaingreso;
    private Long idemotivo;
    private String observacion;
    private String descrimotivonoauto;
    private Long ideclientesucursal;
    private Long numprecioventa;
    private Double totalpedido;
    private String indcambiaprecioventa;
    private Long idemoneda;
    private Double tasacompra;
    private String stsrequerimiento;
    private OffsetDateTime fechaentrega;
    private String ordencompra;
    private String indpasarreq;
    private String campania;
    private String clientenovell;
    private String indimpetiquetasmuestras;
    private String indmuestras;
    private String indnorequerimiento;

    @ManyToOne
    @JoinColumn(name="idecliente",insertable=false,updatable=false)
    private Cliente cliente;

    @OneToMany(mappedBy="pedido")
    private List<PedidoProducto> detallepedido;

    @OneToMany(mappedBy="pedido")
    private List<RequerimientoProducto> requerimientoproducto;

}
