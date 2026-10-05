package com.salesianostriana.dam.ejerciciodto.DTO;

import com.salesianostriana.dam.ejerciciodto.modelalumno.Alumno;
import lombok.Value;

@Value
public class AlumnoDto {

    String nombre;
    String apellidos;
    String email;
    String curso;
    String direccion;

    public AlumnoDto(Alumno alumno) {

        this.nombre = alumno.getNombre();
        this.apellidos = alumno.getApellido1() + " " + alumno.getApellido2();
        this.email = alumno.getEmail();
        this.curso = alumno.getCurso().getNombre();
        this.direccion = (alumno.getDireccion() != null)
                ? alumno.getDireccion().getTipoVia() + " " +
                alumno.getDireccion().getLinea1() + ", " +
                alumno.getDireccion().getPoblacion()
                : "";
    }

    public static AlumnoDto of(Alumno a){
        return new AlumnoDto(a);
    }

}
