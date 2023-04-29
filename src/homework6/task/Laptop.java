package homework6.task;

public class Laptop {
    private String brand;
    private String model;
    private String os;
    private int ram;
    private int storage;
    public Laptop(String brand, String model, String os, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getOs() {
        return os;
    }
    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public String outputLaptop() {
        return String.format("Бренд: %s \n модель: %s \n ОС %s \n  объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n",
                this.brand, this.model, this.os, this.ram, this.storage);
    }

}
