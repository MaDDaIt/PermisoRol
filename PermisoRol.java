package pregunta02;

public class  PermisoRol {
    private Rol rol;
    private Permiso permiso;

    public PermisoRol() {

    }

    public PermisoRol(Rol rol, Permiso permiso) {
        this.rol = rol;
        this.permiso = permiso;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }
}
