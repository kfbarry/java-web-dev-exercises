package exercises.technology;

public class smartPhone extends computer {

    private boolean isTouchScreen;

    public smartPhone(String brand, String model, double memoryInGB, boolean isTouchScreen, double iDNumber){
        super(brand, model, memoryInGB, iDNumber);
        this.isTouchScreen = isTouchScreen;
    }

    public void takePic(){
        System.out.println("*click*");
    }
}
