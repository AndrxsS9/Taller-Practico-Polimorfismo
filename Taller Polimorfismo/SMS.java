import java.util.Map;

public class SMS implements MedioEnvio {

    @Override
    public boolean ejecutarEnvio(Usuario destinatario, String mensaje, Map<String, Object> datosExtra) {
        System.out.println("[SMS] a " + destinatario.getTelefono());
        System.out.println("Mensaje: " + mensaje);
        return true;
    }
}
