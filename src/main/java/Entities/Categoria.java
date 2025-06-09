package Entities;

import lombok.*;
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
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    private Categoria categoriaPadre;

    //(?)
    @Builder.Default
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

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", sucursales=" + sucursales.size() +
                ", categoriaPadreId=" + (categoriaPadre != null ? categoriaPadre.getId() : null) +
                ", subCategorias=" + subCategorias.size() +
                '}';
    }
}
