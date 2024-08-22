public class ConfiguracionSistema implements Loadable, Savebeable,Inotificable {
    @Override
    public void load() {
        System.out.println("Configuracion usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion usuario almacenada");
    }

    @Override
    public void notificar(){
        System.out.println("Configuracion usuario notificada");
    }
}