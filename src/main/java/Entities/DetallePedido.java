package Entities;

import Entities.Protected.Articulo;
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

public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subTotal;

    // un detallePedido → un Pedido
    private Pedido pedido;

    // un detallePedido → un articulo
    private Articulo articulo;

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", pedidoId=" + (pedido != null ? pedido.getId() : null) +
                ", articuloId=" + (articulo != null ? articulo.getId() : null) +
                '}';
    }
}
