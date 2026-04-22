public class PublicacionCalificacion extends Notificacion {

    private double nota;

    public PublicacionCalificacion(String codigo, Usuario usuario, double nota, MedioEnvio medio) {
        super(codigo, usuario, medio);
        this.nota = nota;
    }

    @Override
    public void construirMensaje() {
        mensaje = "Tu calificación ha sido publicada: " + nota;
    }
}
