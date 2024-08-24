public class ConfiguracionUsuario implements RecursoPersistente, Notificable {
    @Override
    public void load() {
        System.out.println("Configuracion usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion usuario almacenada");
    }
    @Override
    public void notificar() {
        System.out.println("notificar; Configuracion sistema almacenada");
    }
}