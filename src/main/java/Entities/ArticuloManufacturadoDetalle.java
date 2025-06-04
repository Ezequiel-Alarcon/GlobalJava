package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturadoDetalle extends Base {
    private Integer cantidad;


    // Relación muchos a uno con ArticuloInsumo
    private ArticuloInsumo articuloInsumo;

    // Relación muchos a uno con ArticuloManufacturado
    private ArticuloManufacturado articuloManufacturado;
}
