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
@Table(name = "cat_talla_producto")
public class TallaProducto {

    @Id
    private Long idetallaproducto;
	private Long idetipoproducto;
	private String descritallaproducto;
	private String usuario;
	private OffsetDateTime fechaingreso;
	private String numtallaproducto;

	@OneToMany(mappedBy="tallaproducto")
    private List<RequerimientoProducto> requerimientoproducto;

}
