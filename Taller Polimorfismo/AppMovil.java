import java.util.Map;

public class AppMovil implements MedioEnvio {

    @Override
    public boolean ejecutarEnvio(Usuario destinatario, String mensaje, Map<String, Object> datosExtra) {
        System.out.println("[APP] a usuario: " + destinatario.nombre);
        System.out.println("Mensaje: " + mensaje);
        return true;
    }
}
