package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horaApertura;
    private LocalTime horaCierre;

    //una sucursal → una empresa
    private Empresa empresa;

    //una sucursal → un domicilio
    private Domicilio domicilio;

    //una sucursal → muchas categorias
    private Set<Categoria> categorias = new HashSet<>();

    //una sucursal → muchas promociones
    private Set<Promocion> promociones = new HashSet<>();

    // Una sucursal → Muchos pedidos
    private Set<Pedido> pedidos = new HashSet<>();
}
