package com.example.demo.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "t_product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "marca")
    private String marca;
    
    @Column(name = "pais")
    private String pais;
    
    @Column(name = "f_produccion")
    private Date f_produccion;

    @Column(name = "f_vencimiento")
    private Date f_vencimiento;
    
}
