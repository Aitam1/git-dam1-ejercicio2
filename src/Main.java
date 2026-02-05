import java.util.LinkedList;
import java.util.Scanner;
public class Main {

    static Scanner numeros = new Scanner(System.in);

    public static void main(String[] args) {

        // Contar y mostrar cuántos mayores de edad y cuántos menores de edad.

        int edad,
        mayoresDeEdad = 0,
        menorDeEdad = 0;
        System.out.println("---- Hay que introducir 5 edades ----");
        for(int i = 1; i <= 5; i++) {
            System.out.print("Edad " + i + " : ");
            edad = numeros.nextInt();
            if(edad >= 18)
                mayoresDeEdad++;
            else
                menorDeEdad++;
        }

        System.out.println("Mayor de edad : " + mayoresDeEdad);
        System.out.println("Menor de edad : " + menorDeEdad);

    }
}