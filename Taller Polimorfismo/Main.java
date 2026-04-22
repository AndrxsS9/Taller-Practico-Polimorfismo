public class Main {

    public static void main(String[] args) {

        Usuario est = new Estudiante(1, "Andres", "andrxs@mail.com", "300123", "Ing Sistemas");

        MedioEnvio email = new CorreoElectronico();
        MedioEnvio sms = new SMS();
        MedioEnvio app = new AppMovil();

        Notificacion n1 = new PublicacionCalificacion("001", est, 4.5, email);
        Notificacion n2 = new RecordatorioPago("002", est, 500000, sms);
        Notificacion n3 = new CancelacionClase("003", est, "Física", app);
        Notificacion n4 = new ConfirmacionEvento("004", est, "Seminario IA", email);

        GestorNotificaciones gestor = new GestorNotificaciones();

        gestor.agregar(n1);
        gestor.agregar(n2);
        gestor.agregar(n3);
        gestor.agregar(n4);

        gestor.enviarTodas();
    }
}
