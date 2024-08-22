import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    private Deduccion deduccion;
    private Iva iva;

    // Inyección de dependencias a través del constructor
    public Factura(Deduccion deduccion, Iva iva) {
        this.deduccion = deduccion;
        this.iva = iva;
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        importeDeduccion = deduccion.calculaDeduccion(importeFactura, porcentajeDeduccion);
        importeIVA = iva.calculaIva(importeFactura);
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
