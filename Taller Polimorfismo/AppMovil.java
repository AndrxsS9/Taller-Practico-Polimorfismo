public class AppMovil implements MedioEnvio {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("[APP] Notificación enviada a " + destino + ": " + mensaje);
    }
}
