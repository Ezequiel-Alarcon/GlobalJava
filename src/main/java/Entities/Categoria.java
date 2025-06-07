package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;
import java.util.HashSet;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Categoria extends Base{
    private String denominacion;

    //(?)
    private Set<Sucursal> sucursales = new HashSet<>();

    private Categoria categoriaPadre;

    //(?)
    private Set<Categoria> subCategorias = new HashSet<>();

    //(?)
    public void agregarSucursal(Sucursal sucursal) {
        if (sucursal != null) {
            this.sucursales.add(sucursal);
        }
    }

    //(?)
    public void agregarSubCategoria(Categoria subCategoria) {
        if (subCategoria != null) {
            this.subCategorias.add(subCategoria);
        }
    }
}
