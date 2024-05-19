import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamiento metO = new MetodosOrdenamiento();
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        //int valorDado = r.nextInt(10)+1;
        
        System.out.println("Bienvenido al Proyecto que mide la eficiencia, en base al tiempo de ejecucion, del codigo :P.");
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        //System.out.println(r.nextInt(10));
        int [] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = r.nextInt(100); //CAMBIAR EL LIMITE DE LOS NUMEROS "ALEATORIOS"
        }
        metO.metodoBurbujaMejorado(arreglo, false);
        metO.metodoSeleccion(arreglo, false);
        metO.metodoInsercion(arreglo, false);

        scanner.close();
    }
}
