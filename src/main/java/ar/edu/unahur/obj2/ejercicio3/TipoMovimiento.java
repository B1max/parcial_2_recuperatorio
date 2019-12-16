package ar.edu.unahur.obj2.ejercicio3;

public abstract class TipoMovimiento {
    private double monto;
    public TipoMovimiento(double monto) {
        this.monto = monto;
    }
    public abstract double calcularNuevoSaldo(double saldo);
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
