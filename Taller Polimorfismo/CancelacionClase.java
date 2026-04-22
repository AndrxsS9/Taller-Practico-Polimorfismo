import java.util.HashMap;
import java.util.Map;

public class CancelacionClase extends Notificacion {

    private String clase;

    public CancelacionClase(String codigo, Usuario u, String clase, MedioEnvio medio) {
        super(codigo, u, medio);
        this.clase = clase;
    }

    @Override
    public void construirMensaje() {
        mensaje = "La clase " + clase + " ha sido cancelada.";
    }

    @Override
    public Map<String, Object> obtenerMetadata() {
        Map<String, Object> data = new HashMap<>();
        data.put("clase", clase);
        return data;
    }
}
