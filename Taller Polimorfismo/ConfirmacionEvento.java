import java.util.HashMap;
import java.util.Map;

public class ConfirmacionEvento extends Notificacion {

    private String evento;

    public ConfirmacionEvento(String codigo, Usuario u, String evento, MedioEnvio medio) {
        super(codigo, u, medio);
        this.evento = evento;
    }

    @Override
    public void construirMensaje() {
        mensaje = "Inscripción confirmada al evento: " + evento;
    }

    @Override
    public Map<String, Object> obtenerMetadata() {
        Map<String, Object> data = new HashMap<>();
        data.put("evento", evento);
        return data;
    }
}
