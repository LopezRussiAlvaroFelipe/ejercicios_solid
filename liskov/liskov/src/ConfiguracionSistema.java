public class ConfiguracionSistema implements RecursoPersistente, Notificable {
    @Override
    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }
    @Override
    public void notificar() {
        System.out.println("notificar ; Configuracion sistema almacenada");
    }
}