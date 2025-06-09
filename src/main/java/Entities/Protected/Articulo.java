package Entities.Protected;

import Entities.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;

    // Uno a uno con Categoria
    private Categoria categoria;

    // Uno a muchos con Imagen
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

    //muchos artículos → una unidad de medida
    private UnidadMedida unidadMedida;

    // muchos artículos → muchas promociones
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

    // un artículos → muchos detallePedidos
    @Builder.Default
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    // (?)
    public void agregarImagen(Imagen imagen){
        if (imagenes != null) {
            imagenes.add(imagen);
        }
    }

    // (?)
    public void agregarPromocion(Promocion promocion) {
        if (promociones != null) {
            promociones.add(promocion);
        }
    }

    // (?)
    public void agregarDetallePedido(DetallePedido detallePedido) {
        if (detallePedidos != null) {
            detallePedidos.add(detallePedido);
        }
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", categoriaId=" + (categoria != null ? categoria.getId() : null) +
                ", imagenes=" + imagenes.size() +
                ", unidadMedidaId=" + (unidadMedida != null ? unidadMedida.getId() : null) +
                ", promociones=" + promociones.size() +
                ", detallePedidos=" + detallePedidos.size() +
                '}';
    }
}
