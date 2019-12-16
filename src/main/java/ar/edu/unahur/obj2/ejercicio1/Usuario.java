package ar.edu.unahur.obj2.ejercicio1;

public class Usuario {

    private Permiso tipoDeUsuario;

    public Usuario(Permiso tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
    public Usuario(String usuario){tipoDeUsuario = new PermisoInexistente();    }

    public String permisosLogin() {
        return tipoDeUsuario.mostrarPermiso();
    }
}
