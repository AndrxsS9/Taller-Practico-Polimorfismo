public class Main {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Carlos", "carlos@mail.com");
        Usuario u2 = new Usuario("Ana", "3001234567");

        MedioEnvio email = new CorreoElectronico();
        MedioEnvio sms = new MensajeTexto();
        MedioEnvio app = new AppMovil();

        GestorNotificaciones gestor = new GestorNotificaciones();

        gestor.agregarNotificacion(new RecordatorioPago("001", u1, 500000, email));
        gestor.agregarNotificacion(new PublicacionCalificacion("002", u1, 4.5, app));
        gestor.agregarNotificacion(new CancelacionClase("003", u2, "Física", sms));
        gestor.agregarNotificacion(new ConfirmacionEvento("004", u2, "Seminario IA", email));

        gestor.enviarTodas();
        gestor.mostrarEstados();
    }
}
