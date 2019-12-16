package ar.edu.unahur.obj2.ejercicio3;

import java.util.List;

public class CajaChica {

    private List<TipoMovimiento> movimientos;
    private double saldo;

    public CajaChica(List<TipoMovimiento> movimientos, double saldoInicial) {
        this.movimientos = movimientos;
        saldo = saldoInicial;
    }

    public double saldo(){
        for (TipoMovimiento movimiento: movimientos) {
            this.saldo = movimiento.calcularNuevoSaldo(this.saldo);
        }

        return getSaldo();
    }

    public void registrarMovimiento(TipoMovimiento movimiento){
        movimientos.add(movimiento);
    }

    private double getSaldo() {
        return saldo;
    }
}
