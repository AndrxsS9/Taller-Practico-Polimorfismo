public class Profesor extends Usuario {

    private String departamento;

    public Profesor(int id, String nombre, String correo, String telefono, String departamento) {
        super(id, nombre, correo, telefono);
        this.departamento = departamento;
    }
}
