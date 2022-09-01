// Simular un sorteo de orden de 1 al 6, que sea iterativo

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> orden = new ArrayList<>();
        ArrayList<Integer> ordenAleatorio = new ArrayList<>();
        int posicionAleat, a, respuesta;

        do {
            a = 1;
            for (int i = 0; i < 6; i++) {
                orden.add(a++);
            }
            for (int i = 6; i > 0; i--) {
                posicionAleat = (int) ((Math.random() * orden.size()));
                ordenAleatorio.add(orden.get(posicionAleat));
                orden.remove(posicionAleat);
            }
            
            System.out.println(ordenAleatorio);
            System.out.println("¿Desea generar otro ordenamiento?\nIngrese 1 para continuar otra numero para salir...");
            respuesta = scan.nextInt();
            ordenAleatorio.clear();
        } while (respuesta == 1);
        scan.close();
    }

}
