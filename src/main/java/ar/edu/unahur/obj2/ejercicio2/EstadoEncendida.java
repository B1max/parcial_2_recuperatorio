package ar.edu.unahur.obj2.ejercicio2;

public class EstadoEncendida extends Estado {
    public EstadoEncendida(CafeExpresso maquina) {
        super(maquina);
    }

    @Override
    public void encender() {
        System.out.println("La máquina ya está encendida");
    }

    @Override
    public void apagar() {
        this.maquina.setEncendida(false);
    }

    @Override
    public void servirCafe() {
        System.out.println("Sirviendo Café");
    }

    @Override
    public void darVapor() {
        System.out.println("Generando vapor");
    }

    @Override
    public boolean isEncendida() {
        return true;
    }

    /*@Override
    public void setEncendida(boolean encendida) {
        super.setEncendida(encendida);
    }*/
}
