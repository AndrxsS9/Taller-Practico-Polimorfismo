import java.util.ArrayList;
import java.util.List;

public class GestorNotificaciones {

    private List<Notificacion> lista = new ArrayList<>();

    public void agregar(Notificacion n) {
        lista.add(n);
    }

    public void enviarTodas() {
        for (Notificacion n : lista) {
            n.procesarEnvio();
        }
    }
}
