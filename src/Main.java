import java.util.LinkedList;
import java.util.Scanner;
public class Main {

    static Scanner numeros = new Scanner(System.in);

    public static void main(String[] args) {

        // Calcular y mostrar la edad mínima y la edad máxima

        int edad,
        edadMax = -1,
        edadMin = 9999;
        System.out.println("---- Hay que introducir 5 edades ----");
        for(int i = 1; i <= 5; i++) {
            System.out.print("Edad " + i + " : ");
            edad = numeros.nextInt();
            if(edad > edadMax)
                edadMax = edad;
            if(edad < edadMin)
                edadMin = edad;
        }

        System.out.println("La edad maxima es : " + edadMax);
        System.out.println("La edad minima es : " + edadMin);

    }
}