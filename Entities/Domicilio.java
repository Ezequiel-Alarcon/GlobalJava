package GlobalJava.Entities;

public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;

    //muchos a unos
    private Localidad localidad;

    public Domicilio() {
    }

    //falta vincularlo con cliente y pedido
    public Domicilio(long id, String calle, Integer numero, Integer cp) {
        super(id);
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }

}
