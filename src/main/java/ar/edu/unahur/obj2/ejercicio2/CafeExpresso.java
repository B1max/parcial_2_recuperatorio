package ar.edu.unahur.obj2.ejercicio2;

public class CafeExpresso {
    private Estado estadoActual;
    private Estado apagada = new EstadoApagada(this);
    private Estado encendida = new EstadoEncendida(this);

    public CafeExpresso() {
        this.estadoActual = apagada;
    }

    public void encender() {
        estadoActual = encendida;
    }


    public void apagar() {
        estadoActual = apagada;
    }

    public void servirCafe() {
        estadoActual.servirCafe();
    }

    public void darVapor() {
        estadoActual.darVapor();
    }

    public boolean isEncendida() {
        return estadoActual.isEncendida();
    }

    public void setEncendida(boolean encendid) {
        if (encendid) {
            setEncendida();
        } else {
            setApagada();
        }
    }

    public void setApagada() {
        estadoActual = apagada;
    }

    public void setEncendida() {
        estadoActual = encendida;
    }
}
