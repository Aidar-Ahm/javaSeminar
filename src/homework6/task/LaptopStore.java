package homework6.task;

import java.util.*;


public class LaptopStore {
        public static void main(String[]args) {
        Laptop laptop1 = new Laptop("Samsung", "S102", "Windows", 8, 256);
        Laptop laptop2 = new Laptop("Aplle", "MacBook", "MacOS", 8, 256);
        Laptop laptop3 = new Laptop("HP", "HP15", "Linux", 16, 512);
        Laptop laptop4 = new Laptop("HP", "HP15", "Linux", 2, 512);
        Laptop laptop5 = new Laptop("HP", "HP15", "Linux", 4, 512);

        Set<Laptop> Laptops = new HashSet<Laptop>();
        Laptops.add(laptop1);
        Laptops.add(laptop2);
        Laptops.add(laptop3);
        Laptops.add(laptop4);
        Laptops.add(laptop5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите характеристики: 1. Бренд : ");
        String inputBrand = sc.next();
        System.out.println("2. объем памяти : ");
        int inputRam = sc.nextInt();
        System.out.println("3. объем накопителя: ");
        int inputStorage = sc.nextInt();

        for(Laptop lap: Laptops) {
            if ((lap.getBrand().equals(inputBrand) && lap.getRam() >= inputRam) && (lap.getStorage() >= inputStorage)) {
                System.out.println(lap.outputLaptop());
            }
        }
    }
}
