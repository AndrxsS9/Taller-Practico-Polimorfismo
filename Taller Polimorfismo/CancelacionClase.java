public class CancelacionClase extends Notificacion {

    private String clase;

    public CancelacionClase(String codigo, Usuario usuario, String clase, MedioEnvio medio) {
        super(codigo, usuario, medio);
        this.clase = clase;
    }

    @Override
    public void construirMensaje() {
        mensaje = "La clase " + clase + " ha sido cancelada.";
    }
}
