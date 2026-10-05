package com.salesianostriana.dam.ejerciciodto;

import com.salesianostriana.dam.ejerciciodto.DTO.AlumnoDto;
import com.salesianostriana.dam.ejerciciodto.DTO.ProductDto;
import com.salesianostriana.dam.ejerciciodto.modelalumno.Alumno;
import com.salesianostriana.dam.ejerciciodto.modelalumno.Curso;
import com.salesianostriana.dam.ejerciciodto.modelalumno.Direccion;
import com.salesianostriana.dam.ejerciciodto.modelproduct.Categoria;
import com.salesianostriana.dam.ejerciciodto.modelproduct.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainDeMentira {

    @PostConstruct
    public void main(){

        Categoria c = Categoria.builder()
                .nombre("Informatica")
                .build();

        Producto p = Producto.builder()
                .nombre("Portatil")
                .pvp(999.99)
                .imagenes(List.of("imagen1.jpg", "imagen2.jpg"))
                .categoia(c)
                .build();

        ProductDto productDto = ProductDto.of(p);
        System.out.println("ProductoDto");
        System.out.println(productDto);


        Curso curso = Curso.builder()
                .nombre("DAM2")
                .build();

        Direccion dir = Direccion.builder()
                .tipoVia("Calle")
                .linea1("San Jacinto 12")
                .poblacion("Sevilla")
                .build();

        Alumno alumno = Alumno.builder()
                .nombre("Juan")
                .apellido1("Ruiz")
                .apellido2("Sanchez")
                .email("juan.perez@email.com")
                .curso(curso)
                .direccion(dir)
                .build();

        AlumnoDto alumnoDto = AlumnoDto.of(alumno);
        System.out.println("\nAlumnoDto");
        System.out.println(alumnoDto);

    }

}
