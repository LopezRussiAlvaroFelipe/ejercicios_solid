
public class DeduccionImpl implements Deduccion {
    @Override
    public float calculaDeduccion(float importeFactura, int porcentajeDeduccion) {
        if (importeFactura > 10000) {
            return (importeFactura * (porcentajeDeduccion + 3)) / 100;
        } else {
            return (importeFactura * porcentajeDeduccion) / 100;
        }
    }
}

