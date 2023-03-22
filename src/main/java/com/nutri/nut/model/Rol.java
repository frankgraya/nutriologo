package com.nutri.nut.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Rol {


    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
