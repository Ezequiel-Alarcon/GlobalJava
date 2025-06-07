package Entities;

import Entities.Protected.Articulo;
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

public class UnidadMedida extends  Base{
    private String denominacion;

    // una unidad de medida → muchos artículos
    private Set<Articulo> articulos = new HashSet<>();

    // (?)
    public void agregarArticulo(Articulo articulo) {
        if (articulo != null) {
            this.articulos.add(articulo);
        }
    }
}
