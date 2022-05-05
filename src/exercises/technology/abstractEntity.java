package exercises.technology;

public abstract class abstractEntity {
    private double iDNumber;

    public abstractEntity(double iDNumber){
        this.iDNumber = iDNumber;
    }

    public double getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(double iDNumber) {
        this.iDNumber = iDNumber;
    }
}
