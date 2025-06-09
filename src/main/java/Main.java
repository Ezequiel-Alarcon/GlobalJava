// Main.java

import Entities.*;
import Enums.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos un pais
        Pais pais = Pais.builder()
                .nombre("Argentina")
                .build();

        // 2. Crear una provincia y la vinculamos al pais
        Provincia provincia = Provincia.builder()
                .nombre("Buenos Aires")
                .pais(pais)
                .build();
        pais.agregarProvincia(provincia);

        // 3. Creamos una localidad y la vinculamos a la provincia
        Localidad localidad = Localidad.builder()
                .nombre("La Plata")
                .provincia(provincia)
                .build();
        provincia.agregarLocalidad(localidad);

        // 4. Creamos una empresa
        Empresa empresa = Empresa.builder()
                .nombre("MiEmpresa")
                .razonSocial("MiEmpresa S.A.")
                .cuil(123456789)
                .build();

        // 5. Creamos una sucursal y la vinculamos a la empresa y a la localidad
        Sucursal sucursal = Sucursal.builder()
                .nombre("Sucursal Centro")
                .horaApertura(LocalTime.of(9, 0))
                .horaCierre(LocalTime.of(18, 0))
                .empresa(empresa)
                .build();
        empresa.agregarSucursal(sucursal);

        // 6. Creamos un domicilio y lo vinculamos a la sucursal y a la localidad
        Domicilio domicilio = Domicilio.builder()
                .calle("Calle Falsa")
                .numero(123)
                .cp(1900)
                .sucursal(sucursal)
                .localidad(localidad)
                .build();
        sucursal.setDomicilio(domicilio);

        // 7. Creamos un usuario
        Usuario usuario = Usuario.builder()
                .auth0Id("auth0|123")
                .username("usuario1")
                .build();

        // 8. Creamos un cliente y lo vinculamos al usuario y al domicilio
        Cliente cliente = Cliente.builder()
                .nombre("Juan")
                .apellido("Perez")
                .telefono("2211234567")
                .email("juan@mail.com")
                .fechaNacimiento(LocalDate.of(1990, 1, 1))
                .usuario(usuario)
                .build();
        usuario.setCliente(cliente);
        cliente.agregarDomicilio(domicilio);
        domicilio.agregarCliente(cliente);

        // 9. Creamos una unidad de medida
        UnidadMedida unidadMedida = UnidadMedida.builder()
                .denominacion("Unidad")
                .build();

        // 10. Creamos una categoria y la vinculamos a la sucursal
        Categoria categoria = Categoria.builder()
                .denominacion("Bebidas")
                .build();
        sucursal.agregarCategoria(categoria);
        categoria.agregarSucursal(sucursal);

        // 11. Creamos un articulo manufacturado y lo vinculamos a unidad de medida y categoria
        ArticuloManufacturado articulo = ArticuloManufacturado.builder()
                .denominacion("Café")
                .precioVenta(150.0)
                .categoria(categoria)
                .unidadMedida(unidadMedida)
                .tiempoEstimadoMinutos(5)
                .preparacion("Preparar café")
                .build();
        unidadMedida.agregarArticulo(articulo);

        // 12. Creamos una imagen y la vinculamos al articulo y al cliente
        Imagen imagen = Imagen.builder()
                .denominacion("cafe.jpg")
                .articulo(articulo)
                .cliente(cliente)
                .build();
        articulo.agregarImagen(imagen);

        // 13. Creamos una promocion y la vinculamos al articulo y a la sucursal
        Promocion promocion = Promocion.builder()
                .denominacion("Promo Café")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.now().plusDays(7))
                .horaDesde(LocalTime.of(10, 0))
                .horaHasta(LocalTime.of(12, 0))
                .descripcionDescuento("2x1 en café")
                .precioPromocional(200.0)
                .tipoPromocion(TipoPromocion.HAPPYHOUR)
                .build();
        promocion.agregarArticulo(articulo);
        promocion.agregarSucursal(sucursal);
        articulo.agregarPromocion(promocion);
        sucursal.agregarPromocion(promocion);

        // 14. Creamos un pedido y lo vinculamos al cliente, sucursal y domicilio
        Pedido pedido = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(10, 30))
                .total(200.0)
                .totalCosto(100.0)
                .estado(Estado.PREPARACION)
                .tipoEnvio(TipoEnvio.DELIVERY)
                .formaPago(FormaPago.EFECTIVO)
                .fechaPedido(LocalDate.now())
                .domicilio(domicilio)
                .sucursal(sucursal)
                .cliente(cliente)
                .build();
        cliente.agregarPedido(pedido);
        sucursal.agregarPedido(pedido);
        domicilio.agregarPedido(pedido);

        // 15. Creamos un detalle de pedido y lo vinculamos al pedido y al articulo
        DetallePedido detallePedido = DetallePedido.builder()
                .cantidad(2)
                .subTotal(300.0)
                .pedido(pedido)
                .articulo(articulo)
                .build();
        pedido.agregarDetallePedido(detallePedido);
        articulo.agregarDetallePedido(detallePedido);

        // 16. Creamos una factura y la vinculamos al pedido
        Factura factura = Factura.builder()
                .fechaFacturacion(LocalDate.now())
                .formaPago(FormaPago.EFECTIVO)
                .totalVenta(200.0)
                .pedido(pedido)
                .build();
        pedido.setFactura(factura);


        // Imprimimos los objetos creados para verificar
        System.out.println("Pais: " + pais);
        System.out.println("Provincia: " + provincia);
        System.out.println("Localidad: " + localidad);
        System.out.println("Empresa: " + empresa);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Usuario: " + usuario);
        System.out.println("Cliente: " + cliente);
        System.out.println("UnidadMedida: " + unidadMedida);
        System.out.println("Categoria: " + categoria);
        System.out.println("ArticuloManufacturado: " + articulo);
        System.out.println("Imagen: " + imagen);
        System.out.println("Promocion: " + promocion);
        System.out.println("Pedido: " + pedido);
        System.out.println("DetallePedido: " + detallePedido);
        System.out.println("Factura: " + factura);
    }
}