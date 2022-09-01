
// Simular las notas [0..20] de una clase de n alumnos, imprimir
// en orden de creación y ordenadas descendientemente
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        int total;
        System.out.print("Ingrese la cantidad de numeros que desea almacenar: ");
        total = scan.nextInt();
        generarElementos(total, notas);
        scan.close();
    }

    public static int numAleatorio() {
        return (int) (Math.random() * 21);
    }

    public static void generarElementos(int cantidad, ArrayList<Integer> nums) {
        for (int i = 0; i < cantidad; i++) {
            nums.add(numAleatorio());
        }
        System.out.println(nums);
    }

    public static ArrayList<Integer> mayor(ArrayList<Integer> nums) {
        ArrayList<Integer> nuevo = new ArrayList<>();
        int mayor;
        mayor = nums.get(0);
        for (int i = nums.size(); i > 0; i--) {
            if (nums.get(i) >= mayor) {
                mayor = nums.get(i);
            }
            nuevo.add(nums.get(i));
            nums.remove(i);
        }
        return nuevo;
    }
}
