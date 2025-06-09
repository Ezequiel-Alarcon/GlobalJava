package Entities;

import lombok.*;
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
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();

    //una sucursal → muchas promociones
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

    // Una sucursal → Muchos pedidos
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    //(?)
    public void agregarCategoria(Categoria categoria) {
        if (categoria != null) {
            categorias.add(categoria);
        }
    }

    //(?)
    public void agregarPromocion(Promocion promocion) {
        if (promocion != null) {
            promociones.add(promocion);
        }
    }

    //(?)
    public void agregarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
        }
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horaApertura=" + horaApertura +
                ", horaCierre=" + horaCierre +
                ", empresaId=" + (empresa != null ? empresa.getId() : null) +
                ", domicilioId=" + (domicilio != null ? domicilio.getId() : null) +
                ", categorias=" + categorias.size() +
                ", promociones=" + promociones.size() +
                ", pedidos=" + pedidos.size() +
                '}';
    }
}
