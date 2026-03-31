import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static Scanner numeros = new Scanner(System.in);

    public static void main(String[] args) {

        int edad,
                mayoresDeEdad = 0,
                menorDeEdad = 0,
                suma = 0;

        LinkedList<Integer> edades = new LinkedList<>();

        System.out.println("---- Hay que introducir 5 edades ----");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Edad " + i + " : ");
            edad = numeros.nextInt();
            edades.add(edad);
            suma += edad;
            if (edad >= 18)
                mayoresDeEdad++;
            else
                menorDeEdad++;
        }

        System.out.println("Mayor de edad : " + mayoresDeEdad);
        System.out.println("Menor de edad : " + menorDeEdad);

        // Version 4: Rangos de edad
        int rango1 = 0, rango2 = 0, rango3 = 0, rango4 = 0;
        for (int e : edades) {
            if (e <= 17)
                rango1++;
            else if (e <= 30)
                rango2++;
            else if (e <= 50)
                rango3++;
            else
                rango4++;
        }
        System.out.println("Rango 0-17 : " + rango1);
        System.out.println("Rango 18-30 : " + rango2);
        System.out.println("Rango 31-50 : " + rango3);
        System.out.println("Rango +51 : " + rango4);


        // Version 5: Indicar si todas las personas son mayores de edad
        boolean todasMayores = true;
        for (int e : edades) {
            if (e < 18) {
                todasMayores = false;
                break;
            }
        }
        System.out.println("Todas mayores de edad : " + todasMayores);
    }
}