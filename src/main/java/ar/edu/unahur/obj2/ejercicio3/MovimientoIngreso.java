package ar.edu.unahur.obj2.ejercicio3;

public class MovimientoIngreso extends TipoMovimiento {
    public MovimientoIngreso(double monto) {
        super(monto);
    }

    @Override
    public double calcularNuevoSaldo(double saldo) {
        return saldo+getMonto();
    }
}
