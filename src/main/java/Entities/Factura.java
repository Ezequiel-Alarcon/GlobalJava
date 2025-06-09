package Entities;

import Enums.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

    // Una factura → Un pedido
    private Pedido pedido;

    @Override
    public String toString() {
        return "Factura{" +
                "fechaFacturacion=" + fechaFacturacion +
                ", mpPaymentId=" + mpPaymentId +
                ", mpMerchantOrderId=" + mpMerchantOrderId +
                ", mpPreferenceId='" + mpPreferenceId + '\'' +
                ", mpPaymentType='" + mpPaymentType + '\'' +
                ", formaPago=" + formaPago +
                ", totalVenta=" + totalVenta +
                ", pedidoId=" + (pedido != null ? pedido.getId() : null) +
                '}';
    }
}
