public class Main {
    public static void main(String[] args) {
        // Ejercicio OpenBootcamp
        int numeroWhile = -5;
        while (numeroWhile < 3){
            if (numeroWhile < 0){
                System.out.println(Integer.toString(numeroWhile) + " es negativo");
            } else if (numeroWhile > 0){
                System.out.println(numeroWhile + " es positivo");
            } else {
                System.out.println(numeroWhile + " es cero");
            }
            numeroWhile++;
        }
        do {
            System.out.println("Do while: " + numeroWhile);
        } while (numeroWhile < 3);
        for (int i=0;i<=3;i++){
            System.out.println("for var: " + i);
        }
        int estacion = (int)(Math.random()*4);
        switch (estacion){
            case 0:
                System.out.println("Es primavera");
                break;
            case 1:
                System.out.println("Es verano");
                break;
            case 2:
                System.out.println("Es otoño");
                break;
            case 3:
                System.out.println("Es invierno");
        }
    }
}