import java.util.Map;

public interface MedioEnvio {
    boolean ejecutarEnvio(Usuario destinatario, String mensaje, Map<String, Object> datosExtra);
}
