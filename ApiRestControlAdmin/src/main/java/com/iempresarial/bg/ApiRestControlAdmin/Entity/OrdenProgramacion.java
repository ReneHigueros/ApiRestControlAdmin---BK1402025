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
@Table(name = "ing_pr_orden_programacion")
public class OrdenProgramacion {

    @Id
    private Long ideordenprogra;

    private Long ideproceso;
    private Long ideciaemisora;
    private Long idesucursal;
    private Long ideflujo;
    private Long idemotivo;
    private Long numordenprogra;
    private OffsetDateTime fechaordenprogra;
    private String stsordenprogra;
    private OffsetDateTime fechastsprogra;
    private String observacion;
    private String usuario;
    private OffsetDateTime fechaingreso;
    private String usuariomod;
    private OffsetDateTime fechamod;
    private Long numtalon;
    private Long totaltalon;

    @OneToMany(mappedBy="ordenprogramacion")
    private List<OrdenProgramacionDetalle> ordenprogramaciondetalle;

     @OneToMany(mappedBy="ordenProgramacion")
    private List<OrdenCentroCosto> ordencentrocosto;


}
