package Entities;

import Entities.Protected.Articulo;
import Enums.TipoPromocion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;

    //una Promocion → muchas sucursales
    private Set<Sucursal> sucursales = new HashSet<>();

    //una Promocion → muchos articulos
    private Set<Articulo> articulos = new HashSet<>();

    //una Promocion → muchas imagenes
    private Set<Imagen> imagenes = new HashSet<>();

    //(?)
    public void agregarSucursal(Sucursal sucursal) {
        if (sucursal != null) {
            this.sucursales.add(sucursal);
        }
    }

    //(?)
    public void agregarArticulo(Articulo articulo) {
        if (articulo != null) {
            this.articulos.add(articulo);
        }
    }

    //(?)
    public void agregarImagen(Imagen imagen) {
        if (imagen != null) {
            this.imagenes.add(imagen);
        }
    }
}
