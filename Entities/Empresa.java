package GlobalJava.Entities;

import java.util.HashSet;
import java.util.Set;

public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private Integer cuil;

    //uno a muchos
    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa() {
    }

    public Empresa(long id, String nombre, String razonSocial, Integer cuil) {
        super(id);
        this.nombre = nombre;
        this.cuil = cuil;
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazaonSocial() {
        return razonSocial;
    }

    public void setRazaonSocial(String razaonSocial) {
        this.razonSocial = razaonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }


}
