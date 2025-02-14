package com.iempresarial.bg.ApiRestControlAdmin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "security_users")
public class Usuario {
    @Id
    @Column(name = "name")
    private String name;

    private String description;
    private Integer priority;
    private Integer user_type;
    private String user_type_app;
    @Column(name = "status_user")
    private String statususer;

    private String password;
}
