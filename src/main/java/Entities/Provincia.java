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


public class Provincia extends Base{
    private String nombre;

    // Uno a muchos: una provincia → muchas localidades
    private Set<Localidad> localidades = new HashSet<>();

    // Una provincia tiene un pais
    private Pais pais;

}
