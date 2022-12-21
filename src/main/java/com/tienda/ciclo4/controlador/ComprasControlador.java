package com.tienda.ciclo4.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.ciclo4.modelo.Compras;
import com.tienda.ciclo4.servicio.ComprasServicio;

@RestController
@RequestMapping("/Compras")

public class ComprasControlador {
    @Autowired
    ComprasServicio comprasServicio;

    @PostMapping()
    public Compras SaveCompras(@RequestBody Compras compras ){
        return comprasServicio.saveCompras(compras);

    }
    @GetMapping("/{id}")
    public Optional<Compras> getComprasById(@PathVariable("id") String id){
        return comprasServicio.getComprasById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteComprasById(@PathVariable("id")String id){
        comprasServicio.deleteComprasById(id);
    }
  
    
}

