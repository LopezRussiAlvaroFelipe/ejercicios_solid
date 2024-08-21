public class IVA {
    private static final float IVA_DEFAULT = 0.16f;

    public float calcularIVA(String codigo, float importeFactura) {
        if (codigo.equals("0")) {
            return 0; // No se aplica IVA para código 0
        }
        return importeFactura * IVA_DEFAULT;
    }
}

