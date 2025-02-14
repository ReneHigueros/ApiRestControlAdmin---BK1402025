package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Data
@Entity
@Table(name = "ing_pr_orden_x_centro_costo")
public class OrdenCentroCosto {

    @Id    
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "pk_correlativo")
    @TableGenerator(name = "pk_correlativo", table = "cat_correlativo", pkColumnName = "tabla", valueColumnName="correlativoactual", pkColumnValue = "sq_ing_pr_orden_x_centro_costo", allocationSize = 1)
    private Long ideordenprogcencos;
    private Long ideordenprogra;
    private Long idecentrocosto;
    private Long idetipomovimiento;
    private Long idemotivo;
    private Date fechaingreso;
    private String usuario;
    private Long ideproceso;
    private String indsalida;
    private Long ideseleccionador;
    private Long idedeptocencos;
    private Integer paresmalos;
    private Integer suelasmalas;
    private Long idemotivosuelasmalas;

    @ManyToOne
    @JoinColumn(name="idecentrocosto", insertable=false, updatable=false)
    private CentroCosto centrocosto;
 
    @ManyToOne
    @JoinColumn(name="idetipomovimiento", insertable=false, updatable=false)
    private CfgTipoMovimiento cfgtipomovimiento;

    @ManyToOne
    @JoinColumn(name="ideordenprogra", insertable=false,updatable=false )
    private OrdenProgramacion ordenProgramacion;

}
