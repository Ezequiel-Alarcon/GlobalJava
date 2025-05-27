package Entities;

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

public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;

    // Un domicilio → una sucursal
    private Sucursal sucursal;

    // Un domicilio → una localidad
    private Localidad localidad;

    // Un domicilio → muchos pedidos
    private Set<Pedido> pedidos = new HashSet<>();

    // Un domicilio → muchos clientes
    private Set<Cliente> clientes = new HashSet<>();
}
