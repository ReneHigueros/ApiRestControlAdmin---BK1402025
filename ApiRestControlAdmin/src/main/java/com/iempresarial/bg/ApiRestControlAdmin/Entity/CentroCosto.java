package com.iempresarial.bg.ApiRestControlAdmin.Entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cfg_pr_centro_costo")
public class CentroCosto {
    @Id
    private Long idecentrocosto;
    
    private Long ideciaemisora;
    private String codcentrocosto;
    private String descripcion;
    private Integer orden;
    private String indingfichaconsumo;
    private String lovtipocentrocosto;
    private String indcierre;
    private String lovfrmaingmeta;
    private Long ideplantaproduccion;
    private String usuario;
    private Date fechaingreso;
    private String usuariomod;
    private Date fechamod;
    private String indactualizaparesprogra;
    private String indcabinas;
    private String indvisualizareporte;

   /*  @OneToMany(mappedBy="centrocosto")
    private List<OrdenCentroCosto> ordencentrocosto;
*/
}
