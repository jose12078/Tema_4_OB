public class Main {
    public static void main(String[] args){
        int numeroIf = 2;
        if (numeroIf > 0) {
            System.out.println("El número es positivo\n");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo\n");
        } else {
            System.out.println("El número es cero\n");
        }

        // Bucle while codigo a partir de abajo.
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }
        System.out.println(); // Salto de línea

        // Bucle do while codigo a partir de abajo.
        int numeroDoWhile = 0;

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);

        }while (numeroDoWhile < 3);
        System.out.println(); // Salto de línea

        //Codigo de For a partir de abajo;
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println(); // Salto de línea

        //Codigo de Switch a partir de abajo.

        var estacion = "INVIERNO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("La estacion es PRIMAVERA\n");
                break;
            case"VERANO":
                System.out.println("La estacion es VERANO\n");
                break;
            case "OTOÑO":
                System.out.println("La estacion es OTOÑO\n");
                break;
            case "INVIERNO":
                System.out.println("La estacion es INVIERNO\n");
                break;

            default:{
                System.out.println("NO se encuentra la estacion\n");
            }
        }
    }
}
