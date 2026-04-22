public abstract class Usuario {

    protected int id;
    protected String nombre;
    protected String correo;
    protected String telefono;

    public Usuario(int id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
}
