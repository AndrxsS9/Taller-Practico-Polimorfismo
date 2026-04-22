import java.util.HashMap;
import java.util.Map;

public class RecordatorioPago extends Notificacion {

    private double monto;

    public RecordatorioPago(String codigo, Usuario u, double monto, MedioEnvio medio) {
        super(codigo, u, medio);
        this.monto = monto;
    }

    @Override
    public void construirMensaje() {
        mensaje = "Debe pagar $" + monto;
    }

    @Override
    public Map<String, Object> obtenerMetadata() {
        Map<String, Object> data = new HashMap<>();
        data.put("monto", monto);
        return data;
    }
}
