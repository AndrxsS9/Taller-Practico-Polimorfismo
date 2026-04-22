import java.util.HashMap;
import java.util.Map;

public class PublicacionCalificacion extends Notificacion {

    private double nota;

    public PublicacionCalificacion(String codigo, Usuario u, double nota, MedioEnvio medio) {
        super(codigo, u, medio);
        this.nota = nota;
    }

    @Override
    public void construirMensaje() {
        mensaje = "Tu nota es: " + nota;
    }

    @Override
    public Map<String, Object> obtenerMetadata() {
        Map<String, Object> data = new HashMap<>();
        data.put("nota", nota);
        return data;
    }
}
