package ar.edu.unahur.obj2.ejercicio1;

public class PermisoInexistente implements Permiso {
    @Override
    public String mostrarPermiso() {
        return "Tipo de usuario inexistente";
    }
}
