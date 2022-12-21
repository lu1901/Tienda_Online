package com.tienda.ciclo4.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.ciclo4.modelo.Compras;
import com.tienda.ciclo4.modelo.cliente;
import com.tienda.ciclo4.repositorio.ComprasRepositorio;
import com.tienda.ciclo4.repositorio.crudRepositorio.clienteCrudRepositorio;
@Service
public class ComprasServicio {
    @Autowired
    ComprasRepositorio comprasRepositorio;
    @Autowired
    clienteCrudRepositorio clienteCrudRepositorio;

    public Compras saveCompras(Compras compras){
        return comprasRepositorio.save(compras);
    }
    public Optional <Compras> getComprasById(String id){
        Optional <Compras> compras= comprasRepositorio.findById(id);
        Optional <cliente> cliente = clienteCrudRepositorio.findById(compras.get().getId_Cliente());
        compras.get().setNombre_comprador(cliente.get().getNombre());
        compras.get().setApellido_comprador(cliente.get().getApellido());
        compras.get().setCorreo_comprador(cliente.get().getCorreo());
        return compras;
    }
    public String deleteComprasById(String id){
    if(comprasRepositorio.existsById(id)){
        comprasRepositorio.deleteById(id);
        return "compra eliminada";

    }else{
        return "no existe";
    }

    
    }
}
