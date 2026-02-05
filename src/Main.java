import java.util.LinkedList;
import java.util.Scanner;
public class Main {

    static Scanner numeros = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> edades = new LinkedList<>();
        // Pedir al usuario que introduzca 5 edades (enteros) y mostrar las edades
        //introducidas por pantalla.
        int edad;
        System.out.println("---- Hay que introducir 5 edades ----");
        for(int i = 1; i <= 5; i++) {
            System.out.print("Edad " + i + " : ");
            edad = numeros.nextInt();
            edades.add(edad);
        }

        System.out.print("Las edades introducidos : ");
        for(int i = 0; i < edades.size(); i++)
            System.out.print(edades.get(i) + " ");
    }
}