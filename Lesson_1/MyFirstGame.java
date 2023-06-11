public class MyFirstGame {
    public static void  main(String[] args) {
        System.out.println("\nИгра Угадай число : ");

        int computerNumber = 79;
        bSearch(computerNumber);
    }

    public static void bSearch(int elementToSearch) {
        int min = 0;
        int max = 100;
        int midRange = 0;
        
        while (min <= max) {
            midRange = (min + max) / 2; 
            if (midRange < elementToSearch) {
                min = midRange + 1;
                System.out.println(midRange + " число меньше того, что загадал компьютер");
            } else if (midRange == elementToSearch) {
                System.out.printf(elementToSearch + " число найдено ");
                break;
            } else {
                max = midRange - 1;
                System.out.printf(midRange + " число больше того, что загадал компьютер\n");
            }
        }
    }
}