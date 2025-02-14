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
@Table(name = "cfg_tipo_movimiento")
public class CfgTipoMovimiento {

    @Id
    private Long idetipomovimiento;

    private String descripcion;
    private String stsmovimiento;
    private String tipomovimiento;
    private String lovgrptipoprocmov;
    private String usuario;
    private OffsetDateTime fechaingreso;
    private String operacion;

     @OneToMany(mappedBy="cfgtipomovimiento")
    private List<OrdenCentroCosto> ordecentrocosto;


}
