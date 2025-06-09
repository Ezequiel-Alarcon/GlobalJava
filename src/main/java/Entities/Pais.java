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

public class Pais extends Base{
    private String nombre;

    //un pais → muchas provincias
    @Builder.Default
    private Set<Provincia> provincias = new HashSet<>();

    //(?)
    public void agregarProvincia(Provincia provincia) {
        if (provincia != null) {
            this.provincias.add(provincia);
        }
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", provincias=" + provincias.size() +
                '}';
    }
}
