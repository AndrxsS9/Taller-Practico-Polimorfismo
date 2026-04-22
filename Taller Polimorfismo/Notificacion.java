import java.util.Date;
import java.util.Map;

public abstract class Notificacion {

    protected String codigo;
    protected Usuario destinatario;
    protected String mensaje;
    protected Date fechaEnvio;
    protected EstadoNotificacion estado;
    protected MedioEnvio medio;

    public Notificacion(String codigo, Usuario destinatario, MedioEnvio medio) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.medio = medio;
        this.estado = EstadoNotificacion.PENDIENTE;
    }

    public abstract void construirMensaje();
    public abstract Map<String, Object> obtenerMetadata();

    public void procesarEnvio() {
        construirMensaje();
        Map<String, Object> datos = obtenerMetadata();

        boolean enviado = medio.ejecutarEnvio(destinatario, mensaje, datos);

        if (enviado) {
            estado = EstadoNotificacion.ENVIADA;
            fechaEnvio = new Date();
        } else {
            estado = EstadoNotificacion.FALLIDA;
        }
    }
}
