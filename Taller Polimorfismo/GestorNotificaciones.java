import java.util.ArrayList;
import java.util.List;

public class GestorNotificaciones {

    private List<Notificacion> notificaciones;

    public GestorNotificaciones() {
        notificaciones = new ArrayList<>();
    }

    public void agregarNotificacion(Notificacion n) {
        notificaciones.add(n);
    }

    public void enviarTodas() {
        for (Notificacion n : notificaciones) {
            n.enviar();
        }
    }

    public void mostrarEstados() {
        for (Notificacion n : notificaciones) {
            System.out.println("Código: " + n.getCodigo() + " Estado: " + n.getEstado());
        }
    }
}
