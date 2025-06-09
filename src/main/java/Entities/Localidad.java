package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Localidad extends Base{
    private String nombre;

    // una localidad → muchos domicilios
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();

    // Muchos a uno: muchas localidades → una provincia
    private Provincia provincia;

    //(?)
    public void agregarDomicilio(Domicilio domicilio) {
        if (domicilio != null) {
            domicilios.add(domicilio);
        }
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", domicilios=" + domicilios.size() +
                ", provinciaId=" + (provincia != null ? provincia.getId() : null) +
                '}';
    }
}
