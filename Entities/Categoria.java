package GlobalJava.Entities;

import java.util.HashSet;
import java.util.Set;

public class Categoria {
    private String denominacion;

    //??
    private Categoria categoriaPadre; //0
    private Set<Categoria> subCategorias = new HashSet<>();//null

    //mucho a muchos
    private Set<Sucursal> sucursales = new HashSet<>();

    public Categoria() {
    }

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }


}
