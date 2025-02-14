package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="per_cliente")
public class Cliente {
    @Id
    @Column(name = "idecliente")
    private Long idecliente;
    private Long idepersona;

    private Long ideciaemisora;
    
    private String stscliente;

    private String codcliente;

    private String nombretalon;
    
    @OneToOne
    @JoinColumn(name="idepersona", insertable=false,updatable=false)
    private Persona persona;

    @OneToMany(mappedBy="cliente")
    private List<Pedido> pedido;

}
