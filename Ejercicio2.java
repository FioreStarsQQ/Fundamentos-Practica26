
// En un juego de dados que consiste en lanzar 2 dados y ver su
// suma. Confirmar que el 7 es la suma con más probabilidad.
// Hacer un experimento que confirme la afirmación anterior con
// n lanzamientos. Que muestre el número de mayor frecuencia
// y de menor
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int cant, suma;
        System.out.print("Ingrese la cantidad de lanzamientos: ");
        cant = scan.nextInt();
        for (int i = 0; i < 11; i++) {
            numeros.add(0);
        }
        for (int i = 0; i < cant; i++) {
            suma = sumaDados(numAleatorio(), numAleatorio());
            numeros.set(suma - 2, numeros.get(suma - 2) + 1);
        }
        System.out.println(numeros);
        int num = 2;
        System.out.println("Probabilidades de obtener una suma al lanzar dos dados:");
        for (Integer n : numeros) {
            double prob = n * (100.0 / (cant * 1.0));
            System.out.println((num++) + " : " + prob + " %");
        }
        System.out.println("La suma con mayor frecuencia es " + mayor(numeros));
        System.out.println("La suma con menor frecuencia es " + menor(numeros));
        scan.close();
    }

    public static int numAleatorio() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int sumaDados(int a, int b) {
        return a + b;
    }

    public static int mayor(ArrayList<Integer> nums) {
        int mayor, posicion = 0;
        mayor = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > mayor) {
                mayor = nums.get(i);
                posicion = i + 2;
            }
        }
        return posicion;
    }

    public static int menor(ArrayList<Integer> nums) {
        int menor, posicion = 0;
        menor = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < menor) {
                posicion = i + 2;
            }
        }
        return posicion;
    }
}
