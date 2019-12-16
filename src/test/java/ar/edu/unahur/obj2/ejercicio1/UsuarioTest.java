package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UsuarioTest {

    private Usuario profesor;
    private Usuario alumno;
    private Usuario ayudante;
    private Usuario rector;


    @BeforeMethod
    public void setUp() {
        profesor = new Usuario(new PermisoProfesor());
        alumno = new Usuario(new PermisoAlumno());
        ayudante = new Usuario(new PermisoAyudante());
        rector = new Usuario("RECTOR");
    }

    @Test
    public void testLoginProfesor() { assertEquals(profesor.permisosLogin(), "Permisos de profesor"); }

    @Test
    public void testLoginAlumno() { assertEquals(alumno.permisosLogin(), "Permisos de alumno"); }

    @Test
    public void testLoginAyudante() { assertEquals(ayudante.permisosLogin(), "Permisos de ayudante"); }

    @Test(expectedExceptions = RuntimeException.class)
    public void testLoginRector() { assertEquals(rector.permisosLogin(), "Permisos de rector"); }
}