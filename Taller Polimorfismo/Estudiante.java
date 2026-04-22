public class Estudiante extends Usuario {

    private String programa;

    public Estudiante(int id, String nombre, String correo, String telefono, String programa) {
        super(id, nombre, correo, telefono);
        this.programa = programa;
    }
}
