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

public class Usuario extends Base {
    private String auth0Id;
    private String username;

    // un usuario → un cliente
    private Cliente cliente;

    @Override
    public String toString() {
        return "Usuario{" +
                "auth0Id='" + auth0Id + '\'' +
                ", username='" + username + '\'' +
                ", clienteId=" + (cliente != null ? cliente.getId() : null) +
                '}';
    }
}
