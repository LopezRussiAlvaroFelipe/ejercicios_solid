import java.util.Vector;
import java.util.Iterator;

public class Configuracion {
    Vector<Savebeable> confLectura = new Vector<Savebeable>();
    Vector<Loadable> confPersistente = new Vector<Loadable>();

    public void cargarConfiguracion() {
        confLectura.add(new ConfiguracionSistema());
        confLectura.add(new ConfiguracionUsuario());
        confLectura.add(new ConfiguracionHoraria());

        for (Iterator<Savebeable> i = confLectura.iterator(); i.hasNext(); ) {
            i.next().save();
        }
    }

    public void salvarConfiguracion() {
        confPersistente.add(new ConfiguracionSistema());
        confPersistente.add(new ConfiguracionUsuario());

        for (Iterator<Loadable> i = confPersistente.iterator(); i.hasNext(); ) {
            i.next().load();
        }
    }
}

