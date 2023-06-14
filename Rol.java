package pregunta02;

public class Rol {
    private String nombre;
    private PermisoRol[] permisoRol;
    private int indice;


    public Rol() {
        this.permisoRol = new PermisoRol[10];
        this.indice = 0;
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PermisoRol[] getPermisoRol() {
        return permisoRol;
    }

    public void setPermisoRol(PermisoRol[] permisoRol) {
        this.permisoRol = permisoRol;
    }

    public void agregarPermisoRol(PermisoRol permisoRol) {
        this.permisoRol[this.indice] = permisoRol;
        this.indice++;
    }

    public void listarPermisoRol() {
        for (int i=0; i<this.indice; i++) {
            System.out.println("ROL: "+this.permisoRol[i].getRol().getNombre()+" PERMISO: "+this.permisoRol[i].getPermiso().getNombre());
        }
    }
    public PermisoRol  buscarPermisoRol(String permbuscado) {
        for (int i = 0; i < indice; i++) {
            if (permisoRol[i].getPermiso().getNombre()== permbuscado ) {

                System.out.println("......Rol-Permiso encontrado......");

                System.out.println("ROL "+ permisoRol[i].getRol().getNombre()+" PERMISO " +permisoRol[i].getPermiso().getNombre());
                return permisoRol[i];
            }
            else {
                System.out.println("...No se encontro el permiso... ");
            }
            break;
        }
        return null;
    }



    public void modificarPermisoRol(String permbuscado, PermisoRol nuevoPermisoRol) {


        for (int i = 0; i < indice; i++) {
            if (permisoRol[i].getPermiso().getNombre()== permbuscado) {
                permisoRol[i].getPermiso().setNombre(nuevoPermisoRol.getPermiso().getNombre());
                permisoRol[i].getRol().setNombre(nuevoPermisoRol.getRol().getNombre());

                System.out.println("...ROL-Permiso Modificado...");
                System.out.println("ROL " + permisoRol[i].getRol().getNombre() + " PERMISO " + permisoRol[i].getPermiso().getNombre());
            }
        }
         this.listarPermisoRol();

    }


    public void ordenarPermisoRol() {


        for (int i = 0; i < indice; i++) {
            for (int j = i + 1; j < indice; j++) {

                if (permisoRol[i].getRol().getNombre().compareTo(permisoRol[j].getRol().getNombre()) > 0) {

                    PermisoRol aux = permisoRol[i];
                    permisoRol[i] = permisoRol[j];
                    permisoRol[j] = aux;

                }

            }

        }
        System.out.println("...MOSTRAR ORDEN DE ROLES Y PERMISOS ALFABETICAMENTE...");
         for(int i= 0; i<indice ;i++)
         {
             System.out.println("ROL: " +permisoRol[i].getRol().getNombre()+" PERMISO: "+permisoRol[i].getPermiso().getNombre());
         }

    }
    public void eliminarPermisoRol (String rolpermeliminado)
    {
        for (int i = 0; i < indice; i++) {
            if (permisoRol[i].getPermiso().getNombre() == rolpermeliminado) {
                for (int j = i; j < indice - 1; j++)
                {
                    permisoRol[j] = permisoRol [j+1];
                }
                permisoRol[indice -1 ]= null;
                indice --;
                this.listarPermisoRol();
                break;
            }
        }
    }

}
