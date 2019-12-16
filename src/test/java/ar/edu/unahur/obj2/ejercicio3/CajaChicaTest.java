package ar.edu.unahur.obj2.ejercicio3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class CajaChicaTest {

    private MovimientoIngreso movimiento1;
    private MovimientoEgreso movimiento2;
    private MovimientoEgreso movimiento3;
    private CajaChica cajaChica;


    @BeforeMethod
    public void setUp() {
        cajaChica = new CajaChica(new ArrayList<>(), 100);
        movimiento1 = new MovimientoIngreso(15);
        movimiento2 = new MovimientoEgreso( 30);
        movimiento3 = new MovimientoEgreso(10);
    }

    @Test
    public void testGetSaldo() {
        cajaChica.registrarMovimiento(movimiento1);
        cajaChica.registrarMovimiento(movimiento2);
        cajaChica.registrarMovimiento(movimiento3);
        assertEquals(cajaChica.saldo(), 75.0);
    }
}