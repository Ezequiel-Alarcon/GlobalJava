package Entities;

import lombok.*;
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
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    // Un domicilio → muchos clientes
    @Builder.Default
    private Set<Cliente> clientes = new HashSet<>();

    //(?)
    public void agregarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
        }
    }

    //(?)
    public void agregarCliente(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", cp=" + cp +
                ", sucursalId=" + (sucursal != null ? sucursal.getId() : null) +
                ", localidadId=" + (localidad != null ? localidad.getId() : null) +
                ", pedidos=" + pedidos.size() +
                ", clientes=" + clientes.size() +
                '}';
    }
}
