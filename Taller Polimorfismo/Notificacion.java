import java.util.Date;

public abstract class Notificacion {

    protected String codigo;
    protected Usuario usuario;
    protected String mensaje;
    protected Date fechaEnvio;
    protected EstadoNotificacion estado;
    protected MedioEnvio medio;

    public Notificacion(String codigo, Usuario usuario, MedioEnvio medio) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.medio = medio;
        this.estado = EstadoNotificacion.PENDIENTE;
    }

    public abstract void construirMensaje();

    public void enviar() {
        try {
            construirMensaje();
            medio.enviar(usuario.getContacto(), mensaje);
            fechaEnvio = new Date();
            estado = EstadoNotificacion.ENVIADA;
        } catch (Exception e) {
            estado = EstadoNotificacion.FALLIDA;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public EstadoNotificacion getEstado() {
        return estado;
    }
}
