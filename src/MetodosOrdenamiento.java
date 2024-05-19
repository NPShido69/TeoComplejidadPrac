public class MetodosOrdenamiento {

    public int[] metodoSeleccion(int[] arreglo, boolean logs) {
        int tamano = arreglo.length;
        long startTime = System.nanoTime();

        for (int i = 0; i < tamano - 1; i++) {
            int num_menor = i;
            if (logs) {
                //System.out.println("\nPasado numero " + (i + 1) + ":");
            }

            for (int j = i + 1; j < tamano; j++)
                if (arreglo[j] < arreglo[num_menor]) {
                    num_menor = j;
                }

            if (num_menor != i) {
                int temporal = arreglo[i];
                arreglo[i] = arreglo[num_menor];
                arreglo[num_menor] = temporal;
            }
            if (logs) {
                //System.out.println(" El arreglo se encuentra asi: ");
                for (int j = 0; j < tamano; j++) {
                    //System.out.println(arreglo[j] + " ");
                }
                //System.out.println();
            }
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("El tiempo de ejecucion, con el metodo de Seleccion, fue de: " + duration + " segun2 xd");
        return arreglo;
    }

    public int[] metodoInsercion(int[] arreglo, boolean logs) {
        int tamano = arreglo.length;
        long startTime = System.nanoTime();

        for (int i = 1; i < tamano; i++) {
            int elementoActual = arreglo[i];
            int j = i - 1;
            if (logs) {
                //System.out.println("\nInteracion " + i + ":");
                //System.out.println("  Elemento actual:  " + elementoActual);
            }
            while (j >= 0 && (arreglo[j] > elementoActual)) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = elementoActual;

            if (logs) {

                for (int k = 0; k < tamano; k++) {
                    //System.out.print(arreglo[k] + " ");
                }
                //System.out.println();
            }
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("El tiempo de ejecucion, con el metodo de Insercion, fue de: " + duration + " segun2 xd");
        return arreglo;
    }

    public int[] metodoBurbujaMejorado(int[] arreglo, boolean logs) {
        int tamano = arreglo.length;
        long startTime = System.nanoTime();

        for (int i = 0; i < tamano - 1; i++) {
            int num_menor = i;
            if (logs) {
                //System.out.println("\nInteracion" + (i + 1) + ";");
                //System.out.println("Elemento en la posicion " + i + ":" + arreglo[i]);
                for (int j = 0; j < arreglo.length; j++) {
                    if (arreglo[j] > arreglo[num_menor])
                        num_menor = i;
                }
            }
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("El tiempo de ejecucion, con el metodo de Burbuja mejorado, fue de: " + duration + " segun2 xd");
        return arreglo;
    }

}