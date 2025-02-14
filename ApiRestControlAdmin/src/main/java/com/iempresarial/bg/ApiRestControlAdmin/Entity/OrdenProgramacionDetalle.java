package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ing_pr_orden_programacion_detalle")
public class OrdenProgramacionDetalle {

    @Id
    private Long ideordenprogradet;
    private Long ideordenprogra;
	private Long idedetprogra;
	private Integer cantidadpares;

    
    @ManyToOne
    @JoinColumn(name="ideordenprogra",insertable=false,updatable=false)
    private OrdenProgramacion ordenprogramacion;

    @ManyToOne
    @JoinColumn(name="idedetprogra",insertable=false,updatable=false)
    private DetalleProgramacion detalleprogramacion;

}
