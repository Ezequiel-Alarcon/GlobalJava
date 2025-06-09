package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import lombok.*;
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

    // Un Pedido → Muchos DetallePedido (inicializa en el constructor?)
    @Builder.Default
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    //(?)
    public void agregarDetallePedido(DetallePedido detallePedido){
        if (detallePedido != null) {
            detallePedidos.add(detallePedido);
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", domicilioId=" + (domicilio != null ? domicilio.getId() : null) +
                ", sucursalId=" + (sucursal != null ? sucursal.getId() : null) +
                ", clienteId=" + (cliente != null ? cliente.getId() : null) +
                ", facturaId=" + (factura != null ? factura.getId() : null) +
                ", detallePedidos=" + (detallePedidos != null ? detallePedidos.size() : 0) +
                '}';
    }
}
