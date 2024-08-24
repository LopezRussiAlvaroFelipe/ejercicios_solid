public class ConfiguracionHoraria implements RecursoSoloLectura , Notificable {
    @Override
    public void load() {
        System.out.println("Configuracion horaria cargada");
        notificar();
    }
    @Override
    public void notificar() {
        System.out.println("notificar; Configuracion horaria cargada");
    }
}
