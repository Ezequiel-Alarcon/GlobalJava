package Entities;

import Entities.Protected.Articulo;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
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
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();

    public void agregarManufacturadoDetalle(ArticuloManufacturadoDetalle detalle) {
        if (detalle != null) {
            this.detalles.add(detalle);
        }
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", detalles=" + detalles.size() +
                ", precioVenta=" + precioVenta +
                ", denominacion='" + denominacion + '\'' +
                '}';
    }
}
