package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturado {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    // Uno a muchos: Un manufacturado tiene muchos detalles
    private List<ArticuloManufacturadoDetalle> detalles;
}
