package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Categoria extends Base{
    private String denominacion;

    private Set<Sucursal> sucursales;

    private Categoria categoriaPadre;
    private Set<Categoria> subCategorias;
}
