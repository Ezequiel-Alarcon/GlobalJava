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

// Un ArticuloInsumo extiende de Articulo, que es la clase padre (?)
public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    //Un ArticuloInsumo → muchos ArticuloManufacturadoDetalle
    private Set<ArticuloManufacturadoDetalle> articuloManufacturados = new HashSet<>();

    //(?)
    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle detalle) {
        this.articuloManufacturados.add(detalle);
    }
}
