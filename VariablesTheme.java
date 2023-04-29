public class VariablesTheme{

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte core = 3; 
        short logical_proccesor = 6;
        int system_type = 64; 
        long ram = 8_000_000L; 
        float processor_speed = 3.3f; 
        double core_speed_accurate = 1406.19; 
        char all_rights_reserved = '©'; 
        String all_rights_reserved2 =  Character.toString(all_rights_reserved); 
        boolean windowsActive;
        
        String os = System.getProperty("os.name").toLowerCase();
        
        if (os.equals("windows 7")) {
            windowsActive = true;
        } else {
            windowsActive = false;
        }

        System.out.printf("ядер: %d", core);
        System.out.printf("\nлогических процессов: %d", logical_proccesor);
        System.out.printf("\n%d-битная разрядная операционная система", system_type);
        System.out.printf("\n8 гб оперативной памяти( в десятичной %d KB)", ram);
        System.out.printf("\nтактовая частота процессора %.2f", processor_speed);
        System.out.printf("\nтактовая частота процессора сейчас %.2f", core_speed_accurate);
        System.out.printf("\nНа компьютере windows 7? %b", windowsActive);
        System.out.printf("\n%s Корпорация Майкрософт\n" , all_rights_reserved2);
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
    }
}