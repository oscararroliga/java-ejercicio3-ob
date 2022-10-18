public class Main{

    public static void suma( int numer1, int numer2, int numer3){

        int resultado = numer1 + numer2 + numer3;

        System.out.println("El resultado es "+resultado);
    }

public static class Coche{
    static int puertas = 4;
    void ponerPuertas(int cantPuertas){
        puertas += cantPuertas;
        System.out.println(String.valueOf(Coche.puertas));
    }
}

public static void main(String[] args){
    suma(12, 18, 20);
    Coche miCoche = new Coche();
    miCoche.ponerPuertas(1);
}
}
