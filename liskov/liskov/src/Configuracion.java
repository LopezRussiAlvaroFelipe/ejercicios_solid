import java.util.Vector;
import java.util.Iterator;

public class Configuracion {
    Vector<RecursoSoloLectura> confLectura = new Vector<RecursoSoloLectura>();
    Vector<RecursoPersistente> confPersistente = new Vector<RecursoPersistente>();

    public void cargarConfiguracion() {
        confLectura.add(new ConfiguracionSistema());
        confLectura.add(new ConfiguracionUsuario());
        confLectura.add(new ConfiguracionHoraria());

        for (Iterator<RecursoSoloLectura> i = confLectura.iterator(); i.hasNext(); ) {
            i.next().load();
        }
    }

    public void salvarConfiguracion() {
        confPersistente.add(new ConfiguracionSistema());
        confPersistente.add(new ConfiguracionUsuario());

        for (Iterator<RecursoPersistente> i = confPersistente.iterator(); i.hasNext(); ) {
            i.next().save();
        }
    }
}

