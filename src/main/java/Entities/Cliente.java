package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Cliente extends Base {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    // un cliente → un usuario (?
    private Usuario usuario;

    //un cliente → una imagen (?
    private Imagen imagen;

    // Un cliente → muchos domicilios
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();

    // Un cliente → muchos pedidos
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    //(?)
    public void agregarDomicilio(Domicilio domicilio) {
        if (domicilio != null) {
            domicilios.add(domicilio);
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
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", usuarioId=" + (usuario != null ? usuario.getId() : null) +
                ", imagenId=" + (imagen != null ? imagen.getId() : null) +
                ", domicilios=" + domicilios.size() +
                ", pedidos=" + pedidos.size() +
                '}';
    }
}
