import java.util.Enumeration;
import java.util.Vector;

public class Figuras_class {



        Vector<Figura> figuras = new Vector<Figura>();

        // Método para agregar cualquier figura
        public void addFigura(Figura f) {
            figuras.add(f);
        }

        // Método para dibujar todas las figuras
        public void dibujarFiguras() {
            Enumeration<Figura> figs = figuras.elements();
            while (figs.hasMoreElements()) {
                Figura f = figs.nextElement();
                f.dibujar();
            }
        }


}
