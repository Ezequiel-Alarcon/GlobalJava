package Entities;

import Entities.Protected.Articulo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

//extiende de Articulo cual tiene base como clase padre (?)
public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    // Uno a muchos: Un manufacturado tiene muchos detalles
    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();
}
