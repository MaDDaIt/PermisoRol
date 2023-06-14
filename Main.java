package pregunta02;

public class Main {
    public static void main(String args[])
    {


        Rol rol = new Rol();
        rol.agregarPermisoRol(new PermisoRol(new Rol(" csuario"), new Permiso("Agregar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(" asuario"), new Permiso("Editar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(" bsuario"), new Permiso("bliminar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol("secretaria"),new Permiso("Seleccionar")));
       rol.listarPermisoRol();
       rol.buscarPermisoRol("Agregar");
        rol.ordenarPermisoRol();
      rol.modificarPermisoRol("Agregar",new PermisoRol(new Rol("Administrar"),new Permiso("hacer")));
       rol.eliminarPermisoRol("Seleccionar");
    }
}
