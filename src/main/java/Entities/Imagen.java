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

public class Imagen extends Base{
    private String denominacion;

    //una Imagen, un cliente
    private Cliente cliente;

    // muchas imágenes → un artículo
    private Articulo articulo;

    //muchas imágenes → promocion
    private Promocion promocion;
}
