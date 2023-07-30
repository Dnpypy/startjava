public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        multiplyArrayElements();
        deleteArrayElements();
        outputAlphabet();
        addArrayUnicElemenets();
    }

    public static void reverseArray() {
        System.out.println("\n1.Реверс значений массива : ");
        int[] reverseArray = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("   До реверса : ");
        for(int i : reverseArray) { 
            System.out.print(i + " ");
        }
        var temp = 0;
        for(int i = 0; i < reverseArray.length; i++) {
            temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length - i - 1];
            reverseArray[reverseArray.length - i - 1] = reverseArray[i];
        }

        System.out.println();
        System.out.print("После реверса : ");
        for(int i : reverseArray) { 
            System.out.print(i + " ");
        }
    }

    public static void multiplyArrayElements() {
        System.out.println("\n\n2.Произведение элементов массива : ");
        int[] multiplyArray = new int[9];
        var sum = 0;
        for (int i = 0; i < multiplyArray.length; i++) {
            multiplyArray[i] += i; 
            sum *= multiplyArray[i]; 
        }

        for(int i : multiplyArray) {
            System.out.print(i == 8 ? i + " = " + sum : i + " * ");
        }
    }

    public static void deleteArrayElements() {
        System.out.println("\n\n3.Удаление элементов массива : ");
        float[] floatArray = new float[15];
        var sumIndex = 0;
        for(int i = 0; i < floatArray.length; i++) {
            sumIndex += i;
            float tempFl = (float)Math.random();
            floatArray[i] = tempFl;
        }
        System.out.println("исходный массив : ");
        for(int i = 0; i < floatArray.length; i++) {
            if (i == 8) { System.out.println(); };
            System.out.printf("%.3f ",floatArray[i]);
        }
        
        var averageIndex = sumIndex / floatArray.length;
        var zeroIndex = 0;
        for(int i = 0; i < floatArray.length; i++) {
            if (floatArray[averageIndex] < floatArray[i]) {
                floatArray[i] = 0.0f;
                zeroIndex++;
            }
        }
        System.out.println("\nИзмененный массив : ");
        for(int i = 0; i < floatArray.length; i++) {
            if (i == 8) { System.out.println(); };
            System.out.printf("%.3f ",floatArray[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек : " + zeroIndex);
    }

    public static void outputAlphabet() {
        System.out.println("\n4.Вывод алфавита лесенкой : ");
        char[] charArray = new char[26];
        int z = 0; 
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            charArray[z++] = ch;
        }
        
        for(int i = 1; i <= charArray.length - 1; i++) {
            for(int y = 1; y <= i; y++) {
                System.out.print(charArray[y]);
            }
            System.out.println();
        }
    }

    public static void addArrayUnicElemenets() {
        System.out.println("\n5.Заполнение массива уникальными числами : ");
        int[] uniqueArray = new int[30];
        var length = uniqueArray.length;
        
        for(int i = 0; i < length; i++) {
            uniqueArray[i] = (int)(60 + Math.random() * 100);
        }

        var count = 0;
        while (true) {
            count = 0;
            for(int i = 0; i < length - 1; i++) {
                if (contains(uniqueArray, uniqueArray[i])){
                    uniqueArray[i] = (int)(60 + Math.random() * 100);
                } 
            }
            if (count == 0) {
                break;
            }
            
        }
        bubbleSort(uniqueArray);
        for(int i = 0; i < uniqueArray.length; i++) {
            System.out.print(i == 10 || i == 20 ? uniqueArray[i] + "\n": uniqueArray[i] + " ");
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
        int num = 0;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < uniqueArray.length - 1; i++) {
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