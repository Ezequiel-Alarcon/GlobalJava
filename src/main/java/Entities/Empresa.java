package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private Integer cuil;

    //una empresa → muchas sucursales
    private Set<Sucursal> sucursales = new HashSet<>();

    //(?)
    public void agregarSucursal(Sucursal sucursal) {
        if (sucursal != null) {
            this.sucursales.add(sucursal);
        }
    }
}
