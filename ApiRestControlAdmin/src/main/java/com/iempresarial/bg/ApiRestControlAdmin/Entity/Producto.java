package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.time.OffsetDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cat_producto")
public class Producto {

    @Id
    private Long ideproducto;
	private Long ideciaemisora;
	private String lovtipoproducto;
	private String codigoproducto;
	private String descriproducto;
	private String lovunidadmedida;
	private Double costo;
	private String indfacturarsinexistencia;
	private String descripcionfactura;
	private String stsproducto;
	private OffsetDateTime fechasts;
	private String codigonovell;
	private String lovclasificacionproducto;
	private String descripciontalon;
	private String lovsubclasiprod;
	private Long ideflujo;

	@OneToMany(mappedBy="producto")
    private List<RequerimientoProducto> requerimientoproducto;
	
	
}
