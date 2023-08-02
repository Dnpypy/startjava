public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        multiplyArrayElements();
        deleteArrayElements();
        outputAlphabet();
        addArrayUnicElemenets();
    }

    public static void reverseArray() {
        System.out.println("\n1.Реверс значений массива: ");
        int[] reverseArray = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("   До реверса: ");
        printArray(reverseArray);
        var length = reverseArray.length;
        for(int i = 0; i < length; i++) {
            var temp = reverseArray[i];
            reverseArray[i] = reverseArray[--length];
            reverseArray[length] = temp;
        }

        System.out.print("\nПосле реверса: ");
        printArray(reverseArray);
    }

    public static void multiplyArrayElements() {
        System.out.println("\n\n2.Произведение элементов массива: ");
        int[] multipliers = new int[9];
        var multi = 1;
        var length = multipliers.length;
        for (int i = 1; i < length; i++) {
            multipliers[i] = i; 
            multi *= multipliers[i];
        }
        for (int i = 1; i < length; i++) {
            System.out.print(i == (length - 1) ? i + " = " + multi : i + " * ");
        }
    }

    public static void deleteArrayElements() {
        System.out.println("\n\n3.Удаление элементов массива: ");
        float[] realNumbers = new float[15];
        var length = realNumbers.length;
        for(int i = 0; i < length; i++) {
            realNumbers[i] = (float) Math.random();
        }

        System.out.println("исходный массив: ");
        printFloatArray(realNumbers);
        
        var averageIndex = length / 2;
        var zeroIndex = 0;
        var average = realNumbers[averageIndex];
        for(int i = 0; i < length; i++) {
            if (average < realNumbers[i]) {
                realNumbers[i] = 0.0f;
                zeroIndex++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        printFloatArray(realNumbers);
        System.out.println("\nКоличество обнуленных ячеек: " + zeroIndex);
    }

    public static void outputAlphabet() {
        System.out.println("\n4.Вывод алфавита лесенкой: ");
        char[] alphabet = new char[26];

        var length = alphabet.length; 
        for(char ch = 0; ch < length; ch++) {
            alphabet[ch] = (char) ('A' + ch);
        }
        
        for(int i = 0; i <= length - 1; i++) {
            for(int y = 0; y <= i; y++) {
                System.out.print(alphabet[y]);
            }
            System.out.println();
        }
    }

    public static void addArrayUnicElemenets() {
        System.out.println("\n5.Заполнение массива уникальными числами: ");
        int[] uniqueNumbers = new int[30];
        var length = uniqueNumbers.length;
        
        var count = 0;
        while (true) {
            count = 0;
            for(int i = 0; i < length - 1; i++) {
                if (contains(uniqueNumbers, uniqueNumbers[i])) {
                    uniqueNumbers[i] = (int)(31 + Math.random() * 69);
                } 
            }
            if (count == 0) {
                break;
            }
            
        }
        bubbleSort(uniqueNumbers);
        for(int i = 0; i < length; i++) {
            System.out.print(i == 10 || i == 20 ? uniqueNumbers[i] + "\n": uniqueNumbers[i] + " ");
        }
    }

    private static void printFloatArray(float[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i == 8) { System.out.println(); };
            System.out.printf("%.3f ", array[i]);
        }
    }

    private static void printArray(int[] array) {
        for(int i : array) { 
            System.out.print(i + " ");
        }
    }

    private static boolean contains(int[] uniqueArray, int item) {
      for (int n : uniqueArray) {
         if (item == n) {
            return true;
         }
      }
      return false;
    }

    private static int[] bubbleSort(int[] uniqueArray) {
        boolean isSorted = false;
        var num = 0;
        var length = uniqueArray.length;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < length - 1; i++) {
                if(uniqueArray[i] > uniqueArray[i + 1]) {
                    isSorted = false;

                    num = uniqueArray[i];
                    uniqueArray[i] = uniqueArray[i + 1];
                    uniqueArray[i + 1] = num;
                }
            }
        }
        return uniqueArray;
    }
}