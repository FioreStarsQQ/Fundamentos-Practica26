
// Simular las notas [0..20] de una clase de n alumnos, calcular
// la frecuencia y que me muestre tipo histograma los resultados
import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> notasRegistro = new ArrayList<>();
        int cant, nota;
        System.out.print("Ingrese la cantidad de estudiantes: ");
        cant = scan.nextInt();
        for (int i = 0; i < 21; i++) {
            notasRegistro.add(0);
        }
        for (int i = 0; i < cant; i++) {
            nota = notaAleatorio();
            notasRegistro.set(nota, notasRegistro.get(nota) + 1);
        }
        System.out.println(notasRegistro);
        System.out.println("Histograma");
        int posicion = 0;
        for (Integer n : notasRegistro) {
            System.out.print((posicion++) + " : ");
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }

    public static int notaAleatorio() {
        return (int) (Math.random() * 21);
    }

}
