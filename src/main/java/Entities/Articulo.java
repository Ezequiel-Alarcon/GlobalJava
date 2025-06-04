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

public class Articulo extends Base {
    private String denominacion;
    private Double precioVenta;

    // Uno a uno con Categoria
    private Categoria categoria;

    // Uno a muchos con Imagen
    private List<Imagen> imagenes;
}
