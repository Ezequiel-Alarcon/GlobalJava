package Entities;

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

    //una Promocion → muchos articulos (?)
    private Set<Articulo> articulos = new HashSet<>();

    //una Promocion → una imagen (?)
    private Imagen imagen;
}
