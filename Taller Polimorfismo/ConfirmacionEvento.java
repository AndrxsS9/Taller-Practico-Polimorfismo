public class ConfirmacionEvento extends Notificacion {

    private String evento;

    public ConfirmacionEvento(String codigo, Usuario usuario, String evento, MedioEnvio medio) {
        super(codigo, usuario, medio);
        this.evento = evento;
    }

    @Override
    public void construirMensaje() {
        mensaje = "Confirmación: estás inscrito en el evento " + evento;
    }
}
