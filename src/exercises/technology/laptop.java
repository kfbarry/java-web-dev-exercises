package exercises.technology;

public class laptop extends computer {
    private double sizeInInches;

    public laptop(String brand, String model, double memoryInGB, double sizeInInches, double iDNumber) {
        super(brand, model, memoryInGB,iDNumber);
        this.sizeInInches = sizeInInches;
    }

    public void ejectDisk(){
        System.out.println("Disc Attack");
    }

}
