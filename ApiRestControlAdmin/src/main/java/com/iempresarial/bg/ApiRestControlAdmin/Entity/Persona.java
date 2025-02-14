package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "per_persona")
public class Persona {

   @Id 
    private Long idepersona;

    private String lovtipopersona;
    private String nit;
    private String primernombre;
    private String segundonombre;
    private String primerapellido;
    private String segundoapellido;
    private String nombrecomercial;
    private String descripcia;
    
    @OneToOne(mappedBy="persona")
    private Cliente cliente;


}