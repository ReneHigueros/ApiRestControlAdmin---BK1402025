package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cfg_pr_flujos_x_centro_costo_sig_depto")
public class FlujoCentroCostoDetSiguiente {

    @Id
    private Long idesigdepto;

	private Long ideflujocencos;
	private Long idecentrocosto;
	private Integer orden;
	private Date fechaingreso;
	private String usuario;

    @ManyToOne
    @JoinColumn(name="ideflujocencos",insertable=false,updatable=false)
    private FlujoCentroCostoDet flujocentrocostodet;


}
