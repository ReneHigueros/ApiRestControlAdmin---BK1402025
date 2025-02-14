package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cfg_pr_flujos_x_centro_costo_det")
public class FlujoCentroCostoDet {

    @Id
    private Long ideflujocencos;
	private Long ideflujo;
	private Long idecentrocosto;
	private Integer orden;
	private String codflujocencosdet;
	private String indsiguientedepto;
	private Date fechaingreso;
	private String usuario;
	private String indimpordenprogra;
	private String indimprimeprograma;

 	@OneToMany(mappedBy="flujocentrocostodet")
	private List<FlujoCentroCostoDetSiguiente> centrocostodetsiguiente;  

}
