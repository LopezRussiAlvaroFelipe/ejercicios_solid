public class ConfiguracionSistema implements RecursoPersistente {
    @Override
    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }
}