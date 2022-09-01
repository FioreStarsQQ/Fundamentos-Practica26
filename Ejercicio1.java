// Inicializar aleatoriamente un ArrayList de n elementos
// enteros, imprimir el promedio, el mayor, el menor y que
// muestre sólo los elementos con valor par

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int cant;
        double promedio;
        System.out.print("Ingrese la cantidad de numeros que desea almacenar: ");
        cant = scan.nextInt();
        generarElementos(cant, numeros);
        promedio = (double) suma(numeros) / (cant * 1.0);
        System.out.println("La suma de los elementos es " + suma(numeros) + "\nEl promedio es " + promedio);
        System.out.println("El numero mayor es " + mayor(numeros));
        System.out.println("El numero menor es " + menor(numeros));
        quitarElementos(numeros);
        scan.close();
    }

    public static int numAleatorio() {
        return (int) (Math.random() * 10) + 1;
    }

    public static void generarElementos(int cantidad, ArrayList<Integer> nums) {
        for (int i = 0; i < cantidad; i++) {
            nums.add(numAleatorio());
        }
        System.out.println(nums);
    }

    public static void quitarElementos(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }

    public static int suma(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer n : nums) {
            sum += n;
        }
        return sum;
    }

    public static int mayor(ArrayList<Integer> nums) {
        int mayor;
        mayor = nums.get(0);
        for (Integer n : nums) {
            if (n > mayor) {
                mayor = n;
            }
        }
        return mayor;
    }

    public static int menor(ArrayList<Integer> nums) {
        int menor;
        menor = nums.get(0);
        for (Integer n : nums) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }
}