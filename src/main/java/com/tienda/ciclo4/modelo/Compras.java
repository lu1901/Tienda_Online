package com.tienda.ciclo4.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Document("compras")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Compras {
    @Id
    private String id;
    private String id_Cliente;
    private String nombre_comprador;
    private String apellido_comprador;
    private String correo_comprador;
    private String referencia;
    private String color;
    private String talla;
    private int valor_total;
    
}
