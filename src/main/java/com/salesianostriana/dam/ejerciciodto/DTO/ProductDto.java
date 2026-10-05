package com.salesianostriana.dam.ejerciciodto.DTO;

import com.salesianostriana.dam.ejerciciodto.modelproduct.Producto;
import lombok.Value;

@Value
public class ProductDto {

    String nombre;
    Double pvp;
    String imagen;
    String categoria;

    private ProductDto (Producto p){

        this.nombre = p.getNombre();
        this.pvp = p.getPvp();
        this.imagen = (p.getImagenes() != null && !p.getImagenes().isEmpty())
                ? p.getImagenes().get(0)
                : "";
        this.categoria = (p.getCategoia() != null)
                ? p.getCategoia().getNombre()
                : "";

    }

    public static ProductDto of(Producto p){
        return new ProductDto(p);
    }


}
