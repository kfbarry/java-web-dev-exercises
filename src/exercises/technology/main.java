package exercises.technology;

public class main {

    public static void main(String[] args){

        laptop macbook = new laptop("apple","macBook",208,15.4,02);
        macbook.ejectDisk();
        smartPhone iphone = new smartPhone("apple","iphone SE",64,true,03);
        iphone.takePic();

        iphone.addFile("a game", 3);
        System.out.println(iphone.getMemoryInGBRemaining());
    }
}
