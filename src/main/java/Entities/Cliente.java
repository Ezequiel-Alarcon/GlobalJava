package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    private Set<Domicilio> domicilios = new HashSet<>();

    // Un cliente → muchos pedidos
    private Set<Pedido> pedidos = new HashSet<>();
}
