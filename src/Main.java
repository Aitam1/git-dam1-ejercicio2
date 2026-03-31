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

        // Version 4: Media de edad
        double media = (double) suma / edades.size();
        System.out.println("Media de edad : " + media);

        // Version 5: Edades ordenadas de menor a mayor
        Collections.sort(edades);
        System.out.println("Edades ordenadas : " + edades);
    }
}