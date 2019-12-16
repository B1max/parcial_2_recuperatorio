package ar.edu.unahur.obj2.ejercicio4;

public class PanIntegral extends Pan {
    public PanIntegral(boolean semillas, int nivelDetostado) {
        super(semillas, nivelDetostado);
    }

    public void hornear(){
        System.out.println("Por favor agregue harina integral");
        super.hornear();
    }

   /* @Override
    public boolean isIntegral() {
        return true;
    }*/
}
