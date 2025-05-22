package GlobalJava.Entities;

import java.util.HashSet;
import java.util.Set;

public class Localidad {
    private String nombre;

    //unos a muchos
    private Set<Domicilio> domicilios = new HashSet<>();

    public Localidad() {
    }

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }
}
