package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
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
public class Pedido extends Base{
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    // Muchos pedidos → un domicilio
    private Domicilio domicilio;

    // Muchos pedidos → una sucursal (?
    private Sucursal sucursal;

    // Muchos pedidos → un cliente
    private Cliente cliente;

    // Un Pedido → Una factura
    private Factura factura;

    // Un Pedido → Muchos DetallePedido (?
    private Set<detallePedido> detallePedidos = new HashSet<>();

}
