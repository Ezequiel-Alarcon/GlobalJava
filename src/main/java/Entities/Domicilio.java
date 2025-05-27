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

public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;

    private Localidad localidad;
    //falta vincularlo con cliente y pedido

}
