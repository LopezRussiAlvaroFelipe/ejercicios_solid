import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    private IVA calculadoraIVA;
    private Deduccion calculadoraDeduccion;

    public Factura(String codigo, Date fechaEmision, float importeFactura, int porcentajeDeduccion) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.importeFactura = importeFactura;
        this.porcentajeDeduccion = porcentajeDeduccion;

        this.calculadoraIVA = new IVA(); // Inyeccion de dependencia para IVA
        this.calculadoraDeduccion = new Deduccion(); // Inyeccion de dependencia para Deduccion
    }

    // Método que calcula el total de la factura delegando la responsabilidad
    public void calcularTotal() {
        importeDeduccion = calculadoraDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        importeIVA = calculadoraIVA.calcularIVA(codigo, importeFactura);
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
