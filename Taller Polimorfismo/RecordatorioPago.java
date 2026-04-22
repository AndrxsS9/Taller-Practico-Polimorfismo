public class RecordatorioPago extends Notificacion {

    private double monto;

    public RecordatorioPago(String codigo, Usuario usuario, double monto, MedioEnvio medio) {
        super(codigo, usuario, medio);
        this.monto = monto;
    }

    @Override
    public void construirMensaje() {
        mensaje = "Recordatorio: tienes un pago pendiente de $" + monto;
    }
}
