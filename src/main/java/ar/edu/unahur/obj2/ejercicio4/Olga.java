package ar.edu.unahur.obj2.ejercicio4;

public class Olga {

    Pan pan ;

    public Olga(boolean semillas,boolean integral, int nivelDetostado){
        if(integral){
            pan = new PanIntegral(semillas,nivelDetostado);
        }else{
            pan = new PanBlanco(semillas,nivelDetostado);
        }
    }
    public void hornear(){
        pan.hornear();
    }
    public void hornearElPan(){
        this.pan.hornearElPan();
    }
}
