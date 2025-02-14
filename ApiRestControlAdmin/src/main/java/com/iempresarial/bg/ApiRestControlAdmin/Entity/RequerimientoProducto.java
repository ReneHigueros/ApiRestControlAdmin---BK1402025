package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ing_pr_req_x_producto")
public class RequerimientoProducto {

    @Id
    private Long idereqproducto;
    
	private Long iderequerimiento;
	private Long idepedido;
	private Long ideproducto;
	private Long ideflujo;
	private Long idetallaproducto;
	private Integer cantidadpares;
	private Integer cantidadparesprogra;
	private String lovmotivoespera;
	private String descrimotivoespera;
	private String indadelantarprogra;
	private String lovformadistribucionprogradet;
	private String stsreqproducto;
	private String usuario;
	private OffsetDateTime fechaingreso;
	private String usuariomod;
	private OffsetDateTime fechamod;
	private String ordencompra;
	private String imprimirprogra;
	private String indstock;
	private Integer prioridadtalon;

	@OneToOne(mappedBy="requerimientoproducto")
    private DetalleProgramacion detalleprogramacion;

	@ManyToOne
    @JoinColumn(name="idepedido",insertable=false,updatable=false)
    private Pedido pedido;

	@ManyToOne
    @JoinColumn(name="ideproducto",insertable=false,updatable=false)
    private Producto producto;

	@ManyToOne
    @JoinColumn(name="idetallaproducto",insertable=false,updatable=false)
    private TallaProducto tallaproducto;
}
