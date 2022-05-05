package exercises.technology;

import java.util.ArrayList;

public class computer extends abstractEntity {

    private String brand;
    private String model;
    private double memoryInGB;
    private double memoryInGBUsed;
    private double memoryInGBRemaining;
    private ArrayList<String> files = new ArrayList<>();

    public computer(String brand, String model, double memoryInGB, double iDNumber) {
        super(iDNumber);
        this.brand = brand;
        this.model = model;
        this.memoryInGB = memoryInGB;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getMemoryInGB() {
        return memoryInGB;
    }

    public double getMemoryInGBRemaining() {
        return memoryInGBRemaining;
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    public void addFile(String fileName, double fileSize){
        files.add(fileName);
        memoryInGBUsed = memoryInGBUsed + fileSize;
        memoryInGBRemaining = memoryInGB - memoryInGBUsed;
    }

    public void deleteAllFiles(){
        for (String file : files){
            files.remove(file);
        }
        memoryInGBRemaining = memoryInGB;
    }
}
