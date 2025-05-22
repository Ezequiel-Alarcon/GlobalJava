package GlobalJava.Entities;

import java.time.LocalTime;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horaApertura;
    private LocalTime horaCierre;

    //muchos a unos
    private Empresa empresa;

    //uno a uno
    private Domicilio domicilio;

    public Sucursal() {
    }

    //Falta vincular Promocion
    public Sucursal(long id, String nombre, LocalTime horaApertura, LocalTime horaCierre) {
        super(id);
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
