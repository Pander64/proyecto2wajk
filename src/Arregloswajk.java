public class Arregloswajk
{
    // Lectura de arreglos de una dimension
    public static void lecArr1(int arr[]) {
        int val;
        for (int i = 0; i < arr.length; i++) {
            val = arr[i];
        }
    }
    public static void lecArr1(String arr[]) {
        String val;
        for (int i = 0; i < arr.length; i++) {
            val = arr[i];
        }
    }
    public static void lecArr1(float arr[]) {
        float val;
        for (int i = 0; i < arr.length; i++) {
            val = arr[i];
        }
    }

    // Lectura de arreglos de dos dimensiones
    public static void lecArr2(int arr[][]) {
        int val;
        for (int i = 0; i < arr.length; i++) {
            for (int x =0; x < arr[0].length; x++) {
                val = arr[i][x]
            }
        }
    }
    public static void lecArr2(String arr[][]) {
        String val;
        for (int i = 0; i < arr.length; i++) {
            for (int x =0; x < arr[0].length; x++) {
                val = arr[i][x]
            }
        }
    }
    public static void lecArr2(float arr[][]) {
        float val;
        for (int i = 0; i < arr.length; i++) {
            for (int x =0; x < arr[0].length; x++) {
                val = arr[i][x]
            }
        }
    }

    // Ordenar arreglos asc/desc
    public static void ordArr(int arr[], char ord) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                int aux = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = aux;
            }
        }
    }
    public static void ordArr(String arr[], char ord) {
        // Se escribe le proceso de ordenar
        // No se como hacer de strings
    }
    public static void ordArr(float arr[], char ord) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                float aux = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = aux;
            }
        }
    }

    // Operaciones entre matrices
    public static void opArr(int arr1[], int arr2[], char operacion) {
        String tipo;
        switch (operacion) {
            case '+': tipo = "suma";
                    break;
            case '-': tipo = "resta";
                    break;
            case '*': tipo = "mult";
                    break;
            case 'p': tipo = "prom";
                    break;
            default: tipo = "suma";
                    break;
        }
        // Ejecutar accion dependiendo del tipo
    }
    public static void opArr(float arr1[], float arr2[], char operacion) {
        String tipo;
        switch (operacion) {
            case '+': tipo = "suma";
                    break;
            case '-': tipo = "resta";
                    break;
            case '*': tipo = "mult";
                    break;
            case 'p': tipo = "prom";
                    break;
            default: tipo = "suma";
                    break;
        }
        // Ejecutar accion dependiendo del tipo
    }

    // Insertar elementos en una vector
    public static void insertV(int vec, char lugar) {
        // Nos envian el vector y el lugar
        // Solo hay que insertar elementos
        // Realmente no se que proceso poner aqui, no esta definida bien la pregunta
    }
    public static void insertV(float vec, char lugar) {
        // Nos envian el vector y el lugar
        // Solo hay que insertar elementos
        // Realmente no se que proceso poner aqui, no esta definida bien la pregunta
    }
    public static void insertV(String vec, char lugar) {
        // Nos envian el vector y el lugar
        // Solo hay que insertar elementos
        // Realmente no se que proceso poner aqui, no esta definida bien la pregunta
    }

    // Insertar elementos en una vector ordenado
    public static void insertVO(int vec) {
        // Nos envian el vector ya ordenado
        // Solo hay que insertar elementos
        // Realmente no se que proceso poner aqui, no esta definida bien la pregunta
    }
    public static void insertVO(float vec) {
        // Nos envian el vector ya ordenado
        // Solo hay que insertar elementos
        // Realmente no se que proceso poner aqui, no esta definida bien la pregunta
    }
    public static void insertVO(String vec) {
        // Nos envian el vector ya ordenado
        // Solo hay que insertar elementos
        // Realmente no se que proceso poner aqui, no esta definida bien la pregunta
    }
}