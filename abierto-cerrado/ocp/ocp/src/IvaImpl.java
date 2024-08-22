// Implementación concreta de Iva
public class IvaImpl implements Iva {
    private static final float IVA_DEFAULT = 0.16f;

    @Override
    public float calculaIva(float importeFactura) {
        return importeFactura * IVA_DEFAULT;
    }
}