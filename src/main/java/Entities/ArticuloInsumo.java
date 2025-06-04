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

public class ArticuloInsumo extends Base {
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;


}
