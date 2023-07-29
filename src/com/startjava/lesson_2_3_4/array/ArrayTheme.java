public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        multiArrayElements();
        deleteArrayElements();
        outputAlphabet();
        addArrayUnicElemenets();
    }

    public static void reverseArray() {
        System.out.println("\n1.Реверс значений массива : ");
        int[] arr = new int[]{1, 7, 4, 5, 2, 6, 3};
        System.out.print("   До реверса : ");
        for(int y : arr) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.print("После реверса : ");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void multiArrayElements() {
        System.out.println("\n\n2.Произведение элементов массива : ");
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] += (i + 1); 
        }
        var r = 0;
        for(int i = 0; i < 9; i++) {
            r += arr[i] * arr[i]; 
        }
        for(int i : arr) {
            System.out.print(i == 9 ? i + " = " + r: i + " * ");
        }
    }

    public static void deleteArrayElements() {
        System.out.println("\n\n3.Удаление элементов массива : ");
        float[] flArr = new float[15];
        var sumIndex = 0;
        for(int i = 0; i < 15; i++) {
            sumIndex += i;
            float tempFl = (float)Math.random();
            flArr[i] = tempFl;
        }
        System.out.println("исходный массив : ");
        for(int i = 0; i < 15; i++) {
            if (i == 8) { System.out.println(); };
            System.out.printf("%.3f ",flArr[i]);
        }
        
        var averageIndex = sumIndex / flArr.length;
        var zeroIndex = 0;
        for(int i = 0; i < 15; i++) {
            if (flArr[averageIndex] < flArr[i]) {
                flArr[i] = 0.0f;
                zeroIndex++;
            }
        }
        System.out.println("\nИзмененный массив : ");
        for(int i = 0; i < 15; i++) {
            if (i == 8) { System.out.println(); };
            System.out.printf("%.3f ",flArr[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек : " + zeroIndex);
    }

    public static void outputAlphabet() {
        System.out.println("\n4.Вывод алфавита лесенкой : ");
        char[] chars = new char[26];
        int z = 0; 
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            chars[z++] = ch;
        }
        
        for(int i = 1; i <= chars.length - 1; i++) {
            for(int y = 1; y <= i; y++) {
                System.out.print(chars[y]);
            }
            System.out.println();
        }
    }

    public static void addArrayUnicElemenets() {
        System.out.println("\n5.Заполнение массива уникальными числами : ");
        int[] arr = new int[30];
        int length = arr.length;
        
        for(int i = 0; i < length; i++) {
            arr[i] = (int)(60 + Math.random() * 100);
        }

        var count = 0;
        while (true) {
            bubbleSort(arr);
            for(int i = 0; i < length - 1; i++) {
                if (contains(arr, arr[i])){
                    count = 1;
                    arr[i] = (int)(60 + Math.random() * 100);
                } 
            }
            bubbleSort(arr);
            if (count == 0) {
                break;
            }
            count = 0;
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(i == 10 || i == 20 ? arr[i] + "\n": arr[i] + " ");
        }
    }

    private static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
    }

    private static int[] bubbleSort(int[] arr) {
        boolean isSorted = false;
        int num = 0;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    isSorted = false;

                    num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                }
            }
        }
        return arr;
    }
}