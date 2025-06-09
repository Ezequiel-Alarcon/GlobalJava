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


public class Provincia extends Base{
    private String nombre;

    // Uno a muchos: una provincia → muchas localidades
    @Builder.Default
    private Set<Localidad> localidades = new HashSet<>();

    // una provincia → un pais
    private Pais pais;


    //(?)
    public void agregarLocalidad(Localidad localidad) {
        if (localidad != null) {
            this.localidades.add(localidad);
        }
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", localidades=" + localidades.size() +
                ", paisId=" + (pais != null ? pais.getId() : null) +
                '}';
    }
}
