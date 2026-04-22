public class CorreoElectronico implements MedioEnvio {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("[EMAIL] Enviado a " + destino + ": " + mensaje);
    }
}
