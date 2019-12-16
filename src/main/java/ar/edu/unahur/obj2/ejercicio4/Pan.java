package ar.edu.unahur.obj2.ejercicio4;

public abstract class Pan {
    private boolean semillas;
    //private boolean integral;
    private int nivelDetostado;

    public Pan(boolean semillas,  int nivelDetostado) {
        this.semillas = semillas;
       // this.integral = integral;
        this.nivelDetostado = nivelDetostado;
    }
    public void hornear(){
            if(isSemillas()){
                System.out.println("Por favor agregue las semillas");
            }
            //System.out.println("Por favor agregue harina integral");
            System.out.println("Por favor agregue leche");
            System.out.println("Por favor agregue agua");
            System.out.println("Por favor agregue margarina");
            System.out.println("Por favor agregue levadura");
            System.out.println("Por favor agregue sal");
            System.out.println("Por favor agregue azucar");
    }

    public boolean isSemillas() {
        return semillas;
    }

    public void setSemillas(boolean semillas) {
        this.semillas = semillas;
    }
/*
    public abstract boolean isIntegral();

    public void setIntegral(boolean integral) {
    }*/

    public int getNivelDetostado() {
        return nivelDetostado;
    }

    public void setNivelDetostado(int nivelDetostado) {
        this.nivelDetostado = nivelDetostado;
    }
    public void hornearElPan() {
        for (int i = 0; i < this.getNivelDetostado(); i++) {
            System.out.println("Horneando el pan");
        }
    }
}
