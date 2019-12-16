package ar.edu.unahur.obj2.ejercicio4;

public class PanBlanco extends Pan {
    public PanBlanco(boolean semillas,  int nivelDetostado) {
        super(semillas,  nivelDetostado);
    }
    public void hornear(){
        System.out.println("Por favor agregue harina");
        super.hornear();
    }
}
