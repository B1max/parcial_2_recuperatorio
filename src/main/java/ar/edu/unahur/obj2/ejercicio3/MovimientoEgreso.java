package ar.edu.unahur.obj2.ejercicio3;

public class MovimientoEgreso extends TipoMovimiento {
    public MovimientoEgreso(double monto) {
        super(monto);
    }
    public double calcularNuevoSaldo(double saldo){
        return saldo-getMonto();
    }
}

