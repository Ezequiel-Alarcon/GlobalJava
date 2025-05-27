package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    private Set<Domicilio> domicilios = new HashSet<>();

    // Muchos a uno: muchas localidades → una provincia
    private Provincia provincia;
}
