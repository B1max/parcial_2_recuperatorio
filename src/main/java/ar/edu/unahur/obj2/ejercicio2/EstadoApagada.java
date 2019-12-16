package ar.edu.unahur.obj2.ejercicio2;

public class EstadoApagada extends Estado {

    public EstadoApagada(CafeExpresso maquina) {
        super(maquina);
    }

    @Override
    public void encender() {
        this.maquina.setEncendida(true);
    }

    @Override
    public void apagar() {
        System.out.println("La máquina ya está apagada");
    }

    @Override
    public void servirCafe() {
        System.out.println("La máquina  está apagada");
    }

    @Override
    public void darVapor() {
        System.out.println("La máquina está apagada");
    }
    public boolean isEncendida() {
        return false;
    }
}
