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

public class ArticuloManufacturadoDetalle extends Base{
    private Integer cantidad;

    // Relación muchos a uno con ArticuloInsumo
    private ArticuloInsumo articuloInsumo;

    // Relación muchos a uno con ArticuloManufacturado
    private ArticuloManufacturado articuloManufacturado;

    @Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "cantidad=" + cantidad +
                ", articuloInsumoId=" + (articuloInsumo != null ? articuloInsumo.getId() : null) +
                ", articuloManufacturadoId=" + (articuloManufacturado != null ? articuloManufacturado.getId() : null) +
                '}';
    }
}
