import java.util.Map;

public class CorreoElectronico implements MedioEnvio {

    @Override
    public boolean ejecutarEnvio(Usuario destinatario, String mensaje, Map<String, Object> datosExtra) {
        System.out.println("[EMAIL] a " + destinatario.getCorreo());
        System.out.println("Mensaje: " + mensaje);
        return true;
    }
}
