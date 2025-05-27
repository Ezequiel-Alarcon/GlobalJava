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

    //muchos a unos
    private Empresa empresa;

    //uno a uno
    private Domicilio domicilio;

    private Set<Categoria> categorias = new HashSet<>();
    //Falta vincular Promocion

}
