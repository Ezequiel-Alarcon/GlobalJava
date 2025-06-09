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

// Un ArticuloInsumo extiende de Articulo, que es la clase padre (?)
public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    //Un ArticuloInsumo → muchos ArticuloManufacturadoDetalle
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articuloManufacturados = new HashSet<>();

    //(?)
    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle detalle) {
        this.articuloManufacturados.add(detalle);
    }

    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                "precioCompra=" + precioCompra +
                ", stockActual=" + stockActual +
                ", stockMaximo=" + stockMaximo +
                ", esParaElaborar=" + esParaElaborar +
                ", articuloManufacturados=" + articuloManufacturados.size() +
                ", precioVenta=" + precioVenta +
                ", denominacion='" + denominacion + '\'' +
                '}';
    }
}
