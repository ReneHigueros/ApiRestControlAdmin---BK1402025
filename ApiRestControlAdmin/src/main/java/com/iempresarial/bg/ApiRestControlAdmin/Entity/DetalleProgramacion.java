package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.time.OffsetDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "ing_pr_detalle_programacion")
public class DetalleProgramacion {

    @Id
    private Long idedetprogra;
    
	private Long idedeptocencoslinea;
	private Long ideempleado;
	private Long ideordenprogra;
	private Long idereqproducto;
	private Long ideproducto;
	private Long idetallaproducto;
	private Long ideorden;
	private Integer cantidadpares;
	private OffsetDateTime fechaingreso;
	private String usuario;
	private String stsdetprogra;
	private OffsetDateTime fechasts;
	private String usuariomod;
	private Integer paresproducidos;
	private Integer paresxprograma;
	private Long idedeptocencos;
	private Long ideestacion;
	private Integer cambio;
	private Integer agrupaprodprograma;

	
    @OneToMany(mappedBy="detalleprogramacion")
    private List<OrdenProgramacionDetalle> ordenprogramaciondetalle;

	
    @OneToOne
    @JoinColumn(name="idereqproducto",insertable=false,updatable=false)
    private RequerimientoProducto requerimientoproducto;

}
