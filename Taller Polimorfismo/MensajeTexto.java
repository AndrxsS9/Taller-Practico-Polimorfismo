public class MensajeTexto implements MedioEnvio {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("[SMS] Enviado a " + destino + ": " + mensaje);
    }
}
