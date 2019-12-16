package ar.edu.unahur.obj2.ejercicio2;

public abstract class Estado {
    boolean encendida = false;
    CafeExpresso maquina;
    public Estado(CafeExpresso maquina){
        this.maquina = maquina;
    }
    public void encender(){};
    public void apagar(){};
    public void servirCafe(){};
    public void darVapor(){};
    public boolean isEncendida(){
        return this.encendida;
    };
    /*public void setEncendida(boolean encendida){
        this.encendida = encendida;
    };*/
}
