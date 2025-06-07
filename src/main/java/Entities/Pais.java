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

public class Pais extends Base{
    private String nombre;

    //un pais → muchas provincias
    private Set<Provincia> provincias = new HashSet<>();

    //(?)
    public void agregarProvincia(Provincia provincia) {
        if (provincia != null) {
            this.provincias.add(provincia);
        }
    }
}
