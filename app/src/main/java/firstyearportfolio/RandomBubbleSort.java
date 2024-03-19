package firstyearportfolio;

class RandomBubbleSort {
    public static void main(String[] args) {
        double dato, foundInIndex; // Variables para guardar el dato generado y el indice donde se encontró
        long itStartTime, itEndTime, itTotalTime; // Variables utilizadas para calcular tiempo de ejecución
        int arrSize = 100; // Tama
        double[] array = new double[arrSize];
        double[] filledArray = new double[arrSize];
        itStartTime = System.currentTimeMillis();
        dato = generateRandomNum();
        filledArray = fillArrayRDouble(arrSize, array);
        filledArray = bubbleSortArray(filledArray, arrSize);
        foundInIndex = searchArray(filledArray, arrSize, dato);
        printArray(filledArray, arrSize, foundInIndex);
        itEndTime = System.currentTimeMillis();
        itTotalTime = itEndTime - itStartTime;
        System.out.println("Your runtime was: " + itTotalTime);
    }

    static double generateRandomNum() {
        double number;
        double max = 10;
        double min = 0;
        number = Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Searching for value: " + number);
        System.out.println(" ");
        return number;
    }

    static double[] fillArrayRDouble(int size, double[] array) {
        double max = 10;
        double min = 0;
        for (int i = 0; i < size; i++) {
            array[i] = Math.floor(Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    static double[] bubbleSortArray(double[] array, int size) {
        double temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    static double searchArray(double[] array, int size, double dato) {
        for (int i = 0; i <= size; ++i) {
            if (dato == array[i]) {
                return i;
            }
        }
        return -1;
    }

    static void printArray(double[] array, int size, double foundValue) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("The value is in index: " + foundValue + "\n");
    }
}
