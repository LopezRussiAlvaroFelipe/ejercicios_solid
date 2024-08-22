public class Main {
    public static void main(String[] args) {
        Deduccion deduccion = new DeduccionImpl();
        Iva iva = new IvaImpl();

        Factura factura = new Factura(deduccion, iva);
        factura.importeFactura = 12000;
        factura.porcentajeDeduccion = 10;

        factura.calcularTotal();
        System.out.println("Total de la factura: " + factura.importeTotal);
    }
}
