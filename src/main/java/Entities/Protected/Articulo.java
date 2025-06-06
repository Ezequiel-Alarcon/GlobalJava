package Entities.Protected;

import Entities.*;
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

public abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;

    // Uno a uno con Categoria
    private Categoria categoria;

    // Uno a muchos con Imagen
    private Set<Imagen> imagenes = new HashSet<>();

    //muchos artículos → una unidad de medida
    private UnidadMedida unidadMedida;

    // muchos artículos → muchas promociones
    private Set<Promocion> promociones = new HashSet<>();

    // un artículos → muchos detallePedidos
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
}
